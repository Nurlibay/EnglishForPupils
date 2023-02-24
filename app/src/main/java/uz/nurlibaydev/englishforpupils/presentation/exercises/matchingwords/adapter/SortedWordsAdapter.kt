package uz.nurlibaydev.englishforpupils.presentation.exercises.matchingwords.adapter

import android.content.ClipData
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.databinding.ItemSortedWordBinding
import uz.nurlibaydev.englishforpupils.presentation.exercises.matchingwords.callback.DragListener
import uz.nurlibaydev.englishforpupils.presentation.exercises.matchingwords.callback.WordsDiffCallback

class SortedWordsAdapter(private val list: List<String>, private val onDragStarted: (String) -> Unit) : ListAdapter<String, SortedWordsAdapter.WordsViewHolder>(WordsDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordsViewHolder {
        val view = ItemSortedWordBinding.bind(LayoutInflater.from(parent.context).inflate(R.layout.item_sorted_word, parent, false))
        return WordsViewHolder(view)
    }

    override fun onBindViewHolder(holder: WordsViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    fun addItem(selectedWord: String) {
        val list = ArrayList(currentList)
        list.add(selectedWord)
        if(list.contains(selectedWord)){
            notifyItemChanged(currentList.indexOf(selectedWord))
        }
        submitList(list.toSet().toList())
    }

    fun removeItem(selectedWord: String) {
        val list = ArrayList(currentList)
        list.remove(selectedWord)
        submitList(list.toSet().toList())
    }

    inner class WordsViewHolder(private val binding: ItemSortedWordBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(word: String) {
            binding.tvWord.text = word
            if(list.contains(binding.tvWord.text.toString())){
                binding.itemCard.setBackgroundColor(Color.parseColor("#0BE814"))
            } else {
                binding.itemCard.setBackgroundColor(Color.parseColor("#F44336"))
            }

            binding.itemCard.setOnLongClickListener { view ->
                // when user is long clicking on a view, drag process will start
                val data = ClipData.newPlainText("", word)
                val shadowBuilder = View.DragShadowBuilder(view)
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                    view.startDragAndDrop(data, shadowBuilder, view, 0)
                } else {
                    view.startDrag(data, shadowBuilder, view, 0)
                }
                onDragStarted(word)
                true
            }
            binding.itemCard.setOnDragListener(DragListener())
        }
    }
}
