package uz.nurlibaydev.englishforpupils.presentation.exercises.categorizewords.callback

import androidx.recyclerview.widget.DiffUtil

/**
 * This is a DiffUtil.ItemCallback for our adapters, nothing special :)
 * */
class WordsDiffCallback : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean = oldItem == newItem

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean = oldItem == newItem
}
