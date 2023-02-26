package uz.nurlibaydev.englishforpupils.presentation.exercises.antonyms

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.databinding.ItemSortedWordBinding

/**
 *  Created by Nurlibay Koshkinbaev on 18/02/2023 19:43
 */

class AntonymsAdapter : RecyclerView.Adapter<AntonymsAdapter.MoviesViewHolder>() {

    var answers = mutableListOf<Boolean>()

    var list = mutableListOf<String>()
        set(value) {
            field = value
        }

    inner class MoviesViewHolder(private val binding: ItemSortedWordBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindView(position: Int) {
            binding.root.setBackgroundColor(Color.parseColor("#ffffff"))
            if (answers.isNotEmpty()) {
                binding.root.setBackgroundColor(Color.parseColor(if (answers[position]) "#0BE814" else "#F44336"))
            }
            binding.apply {
                tvWord.text = list[position]
            }

            binding.root.setOnClickListener {
                onItemClickListener?.let {

                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        return MoviesViewHolder(ItemSortedWordBinding.bind(LayoutInflater.from(parent.context).inflate(R.layout.item_sorted_word, parent, false)))
    }

    private var onItemClickListener: ((String) -> Unit)? = null
    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bindView(position)
    }

    fun moveItem(from: Int, to: Int) {
        if (answers.isNotEmpty()) {
            answers = mutableListOf()
        }
        val newList = list.toMutableList()
        val fromLocation = list[from]
        newList.removeAt(from)
        newList.add(to, fromLocation)
        list = newList
        notifyItemMoved(from, to)
//        if (to < from) {
//            list.add(to + 1, fromLocation)
//        } else {
//            list.add(to - 1, fromLocation)
//        }
//        submitList(list)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}