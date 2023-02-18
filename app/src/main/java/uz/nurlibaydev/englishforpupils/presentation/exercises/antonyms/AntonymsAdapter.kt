package uz.nurlibaydev.englishforpupils.presentation.exercises.antonyms

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.databinding.ItemSortedWordBinding
import uz.nurlibaydev.englishforpupils.databinding.ItemWordBinding

/**
 *  Created by Nurlibay Koshkinbaev on 18/02/2023 19:43
 */

class AntonymsAdapter : RecyclerView.Adapter<AntonymsAdapter.MoviesViewHolder>() {

    inner class MoviesViewHolder(private val binding: ItemSortedWordBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindView(movieItem: String) {
            binding.apply {
                tvWord.text = movieItem
            }

            binding.root.setOnClickListener {
                onItemClickListener?.let {
                    it(movieItem)

                }
            }
        }
    }

    private val differCallBack = object : DiffUtil.ItemCallback<String>() {

        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem.contentEquals(newItem)
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem.contentEquals(newItem)
        }
    }

    val differ = AsyncListDiffer(this, differCallBack)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        return MoviesViewHolder(ItemSortedWordBinding.bind(LayoutInflater.from(parent.context).inflate(R.layout.item_sorted_word, parent, false)))
    }

    private var onItemClickListener: ((String) -> Unit)? = null
    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val movieItem = differ.currentList[position]
        holder.bindView(movieItem)
    }

    fun moveItem(from: Int, to: Int) {
        val list = differ.currentList.toMutableList()
        val fromLocation = list[from]
        list.removeAt(from)
        if (to < from) {
            list.add(to + 1, fromLocation)
        } else {
            list.add(to - 1, fromLocation)
        }
        differ.submitList(list)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    fun setOnItemClickListener(listener: (String) -> Unit) {
        onItemClickListener = listener

    }
}