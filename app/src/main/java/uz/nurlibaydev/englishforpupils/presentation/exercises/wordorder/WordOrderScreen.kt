package uz.nurlibaydev.englishforpupils.presentation.exercises.wordorder

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.flexbox.*
import dagger.hilt.android.AndroidEntryPoint
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.databinding.ScreenWordOrderBinding
import uz.nurlibaydev.englishforpupils.utils.Observer
import uz.nurlibaydev.englishforpupils.utils.extensions.onClick
import uz.nurlibaydev.englishforpupils.utils.extensions.showMessage

/**
 *  Created by Nurlibay Koshkinbaev on 18/02/2023 18:48
 */

@AndroidEntryPoint
class WordOrderScreen : Fragment(R.layout.screen_word_order) {

    override fun onResume() {
        super.onResume()
        Observer.whichTask.value = 4
    }

    private val binding by viewBinding<ScreenWordOrderBinding>()
    private val words = mutableListOf("The", "clash", "bands", "were", "teenagers", "into", "like")
    private val correctAnswer = mutableListOf("")
    private val wordsAdapter by lazy { WordOrderAdapter() }
    private val answerWordsAdapter by lazy { WordOrderAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            btnNext.onClick {
                if (btnNext.text == requireContext().resources.getString(R.string.next)) {
                    findNavController().navigate(WordOrderScreenDirections.actionWordOrderScreenToPictureGameScreen())
                } else {
                    var answer = ""
                    answerWordsAdapter.currentList.forEach {
                        answer += it
                    }
                }
            }

            rvWords.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            rvWords.adapter = wordsAdapter
            wordsAdapter.submitList(words)
            rvWords.layoutManager = FlexboxLayoutManager(requireContext(), FlexDirection.ROW, FlexWrap.WRAP).apply {
                justifyContent = JustifyContent.SPACE_EVENLY
                alignItems = AlignItems.CENTER
            }
            binding.rvWords.adapter = wordsAdapter
            wordsAdapter.setOnItemClickListener {
                answerWordsAdapter.addItem(it)
                wordsAdapter.removeItem(it)
                showMessage(wordsAdapter.currentList.size.toString())
                if (wordsAdapter.currentList.size == 1) {
                    btnNext.isVisible = true
                    btnNext.text = requireContext().resources.getString(R.string.next)
                }
            }

            rvSortedWords.adapter = answerWordsAdapter
            answerWordsAdapter.submitList(emptyList())
            rvSortedWords.layoutManager = FlexboxLayoutManager(requireContext(), FlexDirection.ROW, FlexWrap.WRAP).apply {
                justifyContent = JustifyContent.SPACE_EVENLY
                alignItems = AlignItems.CENTER
            }
            answerWordsAdapter.setOnItemClickListener {
                wordsAdapter.addItem(it)
                answerWordsAdapter.removeItem(it)
            }

            if (btnNext.text == requireContext().resources.getString(R.string.next)) {
                findNavController().navigate(WordOrderScreenDirections.actionWordOrderScreenToPictureGameScreen())
            }
        }
    }
}