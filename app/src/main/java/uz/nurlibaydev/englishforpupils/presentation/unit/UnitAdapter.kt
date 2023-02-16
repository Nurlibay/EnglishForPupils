package uz.nurlibaydev.englishforpupils.presentation.unit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.data.models.UnitData
import uz.nurlibaydev.englishforpupils.databinding.ItemUnitBinding
import uz.nurlibaydev.englishforpupils.utils.extensions.onClick

/**
 *  Created by Nurlibay Koshkinbaev on 16/02/2023 16:19
 */

class UnitAdapter : ListAdapter<UnitData, UnitAdapter.UnitViewHolder>(UnitAdapterComparator) {

    inner class UnitViewHolder(private val binding: ItemUnitBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val item = getItem(absoluteAdapterPosition)
            binding.apply {
                tvUnitName.text = item.name
                root.onClick {
                    itemClick.invoke(item)
                }
            }
        }
    }

    private var itemClick: (UnitData) -> Unit = {}
    fun setOnUnitItemClickListener(block: (UnitData) -> Unit) {
        itemClick = block
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UnitViewHolder {
        return UnitViewHolder(ItemUnitBinding.bind(LayoutInflater.from(parent.context).inflate(R.layout.item_unit, parent, false)))
    }

    override fun onBindViewHolder(holder: UnitViewHolder, position: Int) {
        holder.bind()
    }
}

object UnitAdapterComparator : DiffUtil.ItemCallback<UnitData>() {

    override fun areItemsTheSame(oldItem: UnitData, newItem: UnitData): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: UnitData, newItem: UnitData): Boolean {
        return oldItem.name == newItem.name
    }
}