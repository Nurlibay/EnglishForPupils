package uz.nurlibaydev.englishforpupils.presentation.exercises.wordorder

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.flexbox.*
import dagger.hilt.android.AndroidEntryPoint
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.databinding.ScreenWordOrderBinding
import uz.nurlibaydev.englishforpupils.utils.extensions.onClick

/**
 *  Created by Nurlibay Koshkinbaev on 18/02/2023 18:48
 */

@AndroidEntryPoint
class WordOrderScreen : Fragment(R.layout.screen_word_order) {

    private val binding by viewBinding<ScreenWordOrderBinding>()
    private val words = mutableListOf("The", "clash", "bands", "were", "teenagers", "into", "like")
    private val correctAnswer = mutableListOf("")
    private val wordsAdapter by lazy { WordOrderAdapter() }
    private val answerWordsAdapter by lazy { WordOrderAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNext.onClick {
            if(binding.btnNext.text == "Next") {
                findNavController().navigate(WordOrderScreenDirections.actionWordOrderScreenToPictureGameScreen())
            } else {
                var answer = ""
                answerWordsAdapter.currentList.forEach {
                    answer += it
                }

            }
        }
        binding.apply {
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
        }
    }
}