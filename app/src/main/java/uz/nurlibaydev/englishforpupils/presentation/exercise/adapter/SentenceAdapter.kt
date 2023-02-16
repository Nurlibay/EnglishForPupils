package uz.nurlibaydev.englishforpupils.presentation.exercise.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.presentation.exercise.callback.WordsDiffCallback

class SentenceAdapter : ListAdapter<String, SentenceAdapter.WordsViewHolder>(WordsDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_word, parent, false)
        return WordsViewHolder(view)
    }

    override fun onBindViewHolder(holder: WordsViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    fun addItem(selectedWord: String) {
        val list = ArrayList(currentList)
        list.add(selectedWord)
        submitList(list)
    }

    inner class WordsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(word: String) {
            itemView.findViewById<TextView>(R.id.tvWord).text = word
        }
    }
}
