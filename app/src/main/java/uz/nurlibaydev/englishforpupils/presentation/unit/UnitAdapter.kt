package uz.nurlibaydev.englishforpupils.presentation.unit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.databinding.ItemUnitBinding
import uz.nurlibaydev.englishforpupils.presentation.exercises.categorizewords.callback.WordsDiffCallback
import uz.nurlibaydev.englishforpupils.utils.Observer
import uz.nurlibaydev.englishforpupils.utils.extensions.onClick

/**
 *  Created by Nurlibay Koshkinbaev on 16/02/2023 16:19
 */

class UnitAdapter : ListAdapter<String, UnitAdapter.UnitViewHolder>(WordsDiffCallback()) {

    inner class UnitViewHolder(private val binding: ItemUnitBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val item = getItem(absoluteAdapterPosition)
            binding.apply {
                tvUnitName.text = item
//                when(Observer.whichUnit.value!!){
//                    1 -> ivUnit.setImageResource(R.drawable.one)
//                    2 -> ivUnit.setImageResource(R.drawable.two)
//                    3 -> ivUnit.setImageResource(R.drawable.three)
//                    4 -> ivUnit.setImageResource(R.drawable.four)
//                    5 -> ivUnit.setImageResource(R.drawable.five)
//                }
                root.onClick {
                    itemClick.invoke(item)
                }
            }
        }
    }

    private var itemClick: (String) -> Unit = {}
    fun setOnUnitItemClickListener(block: (String) -> Unit) {
        itemClick = block
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UnitViewHolder {
        return UnitViewHolder(ItemUnitBinding.bind(LayoutInflater.from(parent.context).inflate(R.layout.item_unit, parent, false)))
    }

    override fun onBindViewHolder(holder: UnitViewHolder, position: Int) {
        holder.bind()
    }
}