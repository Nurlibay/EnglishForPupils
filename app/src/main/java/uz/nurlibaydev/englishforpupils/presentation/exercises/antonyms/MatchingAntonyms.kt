package uz.nurlibaydev.englishforpupils.presentation.exercises.antonyms

import android.annotation.SuppressLint
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
import uz.nurlibaydev.englishforpupils.data.AntonymData
import uz.nurlibaydev.englishforpupils.data.DataList
import uz.nurlibaydev.englishforpupils.databinding.ScreenMatchAntonymsBinding
import uz.nurlibaydev.englishforpupils.utils.Observer
import uz.nurlibaydev.englishforpupils.utils.extensions.onClick

/**
 *  Created by Nurlibay Koshkinbaev on 18/02/2023 18:45
 */

@AndroidEntryPoint
class MatchingAntonyms : Fragment(R.layout.screen_match_antonyms) {

    override fun onResume() {
        super.onResume()
        Observer.whichTask.value = 3
    }

    private val binding by viewBinding<ScreenMatchAntonymsBinding>()
    private var leftWords = mutableListOf<String>()
    private var rightWords = mutableListOf<String>()

    private val answers: MutableMap<String, String> = mutableMapOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        leftWords = AntonymData.getAntonymsScreenLeftWord(Observer.whichUnit.value!!)
        rightWords = AntonymData.getAntonymsScreenRightWord(Observer.whichUnit.value!!)
        repeat(leftWords.size) {
            answers[leftWords[it]] = rightWords[it]
        }
    }

    private var itemTouchHelperLeft = ItemTouchHelper(object : SimpleCallback(UP or DOWN or START or END, 0) {
        override fun onMove(
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder,
            target: RecyclerView.ViewHolder,
        ): Boolean {
            val adapter = recyclerView.adapter as AntonymsAdapter
            val from = viewHolder.absoluteAdapterPosition
            val to = target.absoluteAdapterPosition
            adapter.moveItem(from, to)
            return true
        }

        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
            /** to do */
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
    })

    private var itemTouchHelperRight = ItemTouchHelper(object : SimpleCallback(UP or DOWN or START or END, 0) {
        override fun onMove(
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder,
            target: RecyclerView.ViewHolder,
        ): Boolean {
            val adapter = recyclerView.adapter as AntonymsAdapter
            val from = viewHolder.absoluteAdapterPosition
            val to = target.absoluteAdapterPosition
            adapter.moveItem(from, to)
            return true
        }

        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
            /** to do */
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
    })

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            itemTouchHelperLeft.attachToRecyclerView(binding.rvLeftWords)
            val adapterLeft = AntonymsAdapter()
            leftWords.shuffle()
            adapterLeft.list = leftWords
            rvLeftWords.adapter = adapterLeft

            itemTouchHelperRight.attachToRecyclerView(binding.rvRightWords)
            val adapterRight = AntonymsAdapter()
            rightWords.shuffle()
            adapterRight.list = rightWords
            rvRightWords.adapter = adapterRight

            btnNext.onClick {
                val newList = arrayListOf<Boolean>()
                for (i in 0 until adapterLeft.list.size) {
                    newList.add(answers[adapterLeft.list[i]] == adapterRight.list[i])
                }
                itemTouchHelperLeft.attachToRecyclerView(null)
                itemTouchHelperRight.attachToRecyclerView(null)
                adapterLeft.answers = newList
                adapterRight.answers = newList
                adapterLeft.notifyDataSetChanged()
                adapterRight.notifyDataSetChanged()
                btnNext.text = requireContext().getString(R.string.next)
                if (btnNext.text == requireContext().getString(R.string.next)) {
                    btnNext.onClick {
                        findNavController().navigate(MatchingAntonymsDirections.actionMatchingAntonymsToMatchingWordsScreen())
                    }
                }
            }
        }
    }
}