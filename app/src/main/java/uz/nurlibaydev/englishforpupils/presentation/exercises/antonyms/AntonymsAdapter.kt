package uz.nurlibaydev.englishforpupils.presentation.exercises.antonyms

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.databinding.ItemSortedWordBinding
import uz.nurlibaydev.englishforpupils.presentation.exercises.matchingwords.callback.WordsDiffCallback

/**
 *  Created by Nurlibay Koshkinbaev on 18/02/2023 19:43
 */

class AntonymsAdapter : ListAdapter<String, AntonymsAdapter.MoviesViewHolder>(WordsDiffCallback()) {

    inner class MoviesViewHolder(private val binding: ItemSortedWordBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindView(position: Int) {
            binding.apply {
                val item = getItem(absoluteAdapterPosition)
                tvWord.text = item
            }

            binding.root.setOnClickListener {
                onItemClickListener?.let {
                    it(getItem(absoluteAdapterPosition))
                }
            }
            changeBg.invoke(binding.item, position)
        }
    }

    var changeBg: (view: View, position: Int) -> Unit = {_, _ ->}
    fun changeBg(block: (view: View, position: Int) -> Unit) {
        changeBg = block
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        return MoviesViewHolder(ItemSortedWordBinding.bind(LayoutInflater.from(parent.context).inflate(R.layout.item_sorted_word, parent, false)))
    }

    private var onItemClickListener: ((String) -> Unit)? = null
    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bindView(position)
    }

    fun moveItem(from: Int, to: Int) {
        val list = currentList.toMutableList()
        val fromLocation = list[from]
        list.removeAt(from)
        if (to < from) {
            list.add(to + 1, fromLocation)
        } else {
            list.add(to - 1, fromLocation)
        }
        this.submitList(list)
    }

    override fun getItemCount(): Int {
        return currentList.size
    }

    fun setOnItemClickListener(listener: (String) -> Unit) {
        onItemClickListener = listener
    }
}