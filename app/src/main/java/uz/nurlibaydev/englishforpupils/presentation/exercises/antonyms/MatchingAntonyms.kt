package uz.nurlibaydev.englishforpupils.presentation.exercises.antonyms

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.ItemTouchHelper.*
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.databinding.ScreenMatchAntonymsBinding
import uz.nurlibaydev.englishforpupils.utils.extensions.onClick

/**
 *  Created by Nurlibay Koshkinbaev on 18/02/2023 18:45
 */

@AndroidEntryPoint
class MatchingAntonyms : Fragment(R.layout.screen_match_antonyms) {

    private val binding by viewBinding<ScreenMatchAntonymsBinding>()
    private val leftWords = mutableListOf("polite", "careful", "funny", "miserable", "friendly", "confident", "naughty", "honest", "hard-working", "patient", "cruel")
    private val rightWords = mutableListOf("rude", "careless ", "serious", "cheerful", "unfriendly ", "shy", "well-behaved", "dishonest", "lazy", "impatient", "kind")

    private val itemTouchHelperLeftRV by lazy {
        val simpleItemTouchCallback = object : ItemTouchHelper.SimpleCallback(UP or DOWN or START or END, 0) {
            override fun onMove(recyclerView: RecyclerView,
                                viewHolder: RecyclerView.ViewHolder,
                                target: RecyclerView.ViewHolder): Boolean {
                val adapter = recyclerView.adapter as AntonymsAdapter
                val from = viewHolder.adapterPosition
                val to = target.adapterPosition
                adapter.moveItem(from, to)
                adapter.notifyItemMoved(from, to)
                return true
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
            }

            override fun onSelectedChanged(viewHolder: RecyclerView.ViewHolder?, actionState: Int) {
                super.onSelectedChanged(viewHolder, actionState)

                if (actionState == ACTION_STATE_DRAG) {
                    viewHolder?.itemView?.alpha = 0.5f
                }
            }

            override fun clearView(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder) {
                super.clearView(recyclerView, viewHolder)

                viewHolder.itemView.alpha = 1.0f
            }
        }
        ItemTouchHelper(simpleItemTouchCallback)
    }
    private val itemTouchHelperRightRV by lazy {
        val simpleItemTouchCallback = object : ItemTouchHelper.SimpleCallback(UP or DOWN or START or END, 0) {
            override fun onMove(recyclerView: RecyclerView,
                                viewHolder: RecyclerView.ViewHolder,
                                target: RecyclerView.ViewHolder): Boolean {
                val adapter = recyclerView.adapter as AntonymsAdapter
                val from = viewHolder.adapterPosition
                val to = target.adapterPosition
                adapter.moveItem(from, to)
                adapter.notifyItemMoved(from, to)
                return true
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
            }

            override fun onSelectedChanged(viewHolder: RecyclerView.ViewHolder?, actionState: Int) {
                super.onSelectedChanged(viewHolder, actionState)

                if (actionState == ACTION_STATE_DRAG) {
                    viewHolder?.itemView?.alpha = 0.5f
                }
            }

            override fun clearView(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder) {
                super.clearView(recyclerView, viewHolder)

                viewHolder.itemView.alpha = 1.0f
            }
        }
        ItemTouchHelper(simpleItemTouchCallback)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNext.onClick {
            findNavController().navigate(MatchingAntonymsDirections.actionMatchingAntonymsToFillingScreen())
        }

        itemTouchHelperLeftRV.attachToRecyclerView(binding.rvLeftWords)
        val  adapterLeft = AntonymsAdapter()
        leftWords.shuffle()
        adapterLeft.differ.submitList(leftWords)
        binding.rvLeftWords.adapter = adapterLeft

        itemTouchHelperRightRV.attachToRecyclerView(binding.rvRightWords)
        val  adapterRight = AntonymsAdapter()
        rightWords.shuffle()
        adapterRight.differ.submitList(rightWords)
        binding.rvRightWords.adapter = adapterRight
    }
}