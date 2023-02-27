package uz.nurlibaydev.englishforpupils.presentation.exercises.wordorder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.presentation.exercises.matchingwords.callback.WordsDiffCallback

/**
 *  Created by Nurlibay Koshkinbaev on 18/02/2023 22:48
 */

class WordOrderAdapter : ListAdapter<String, WordOrderAdapter.WordsViewHolder>(WordsDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_word, parent, false)
        return WordsViewHolder(view)
    }

    override fun onBindViewHolder(holder: WordsViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    fun removeItem(selectedWord: String) {
        val list = ArrayList(currentList)
        list.remove(selectedWord)
        submitList(list.toSet().toList())
    }

    fun addItem(selectedWord: String) {
        val list = ArrayList(currentList)
        list.add(selectedWord)
        submitList(list.toSet().toList())
    }

    var itemClicked: (String) -> Unit = {}
    fun setOnItemClickListener(block: (String) -> Unit) {
        itemClicked = block
    }

    inner class WordsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(word: String) = itemView.run {
            findViewById<TextView>(R.id.tv_word).text = word
            setOnClickListener { view ->
                itemClicked.invoke(word)
            }
        }
    }
}