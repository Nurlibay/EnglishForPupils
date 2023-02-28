package uz.nurlibaydev.englishforpupils.presentation.exercises.categorizewords

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
import uz.nurlibaydev.englishforpupils.data.DataList
import uz.nurlibaydev.englishforpupils.databinding.ScreenMatchWordsBinding
import uz.nurlibaydev.englishforpupils.presentation.exercises.categorizewords.adapter.SortedWordsAdapter
import uz.nurlibaydev.englishforpupils.presentation.exercises.categorizewords.adapter.WordsAdapter
import uz.nurlibaydev.englishforpupils.presentation.exercises.categorizewords.callback.DropListener
import uz.nurlibaydev.englishforpupils.utils.Observer
import uz.nurlibaydev.englishforpupils.utils.extensions.onClick

/**
 *  Created by Nurlibay Koshkinbaev on 16/02/2023 16:54
 */

@AndroidEntryPoint
class MatchingWordsScreen : Fragment(R.layout.screen_match_words) {

    override fun onResume() {
        super.onResume()
        Observer.whichTask.value = 1
    }

    private val binding: ScreenMatchWordsBinding by viewBinding()
    private var words = mutableListOf<String>()
    private var selectedWord = ""
    private var correctLeftWords = mutableListOf<String>()
    private var correctMiddleWords = mutableListOf<String>()
    private var correctRightWords = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        words = DataList.getMatchingWords(Observer.whichUnit.value!!)
        correctLeftWords = DataList.getMatchingWordsScreenLeftWords(Observer.whichUnit.value!!)
        correctMiddleWords = DataList.getMatchingWordsScreenMiddleWords(Observer.whichUnit.value!!)
        correctRightWords = DataList.getMatchingWordsScreenRightWords(Observer.whichUnit.value!!)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {

            tvLeftColumn.text = DataList.getMatchingWordScreenThreeWords(Observer.whichUnit.value!!)[0]
            tvMiddleColumn.text = DataList.getMatchingWordScreenThreeWords(Observer.whichUnit.value!!)[1]
            tvRightColumn.text = DataList.getMatchingWordScreenThreeWords(Observer.whichUnit.value!!)[2]

            btnNext.onClick {
                findNavController().navigate(MatchingWordsScreenDirections.actionMatchingWordsScreenToMatchingAntonyms())
            }

            val leftWordsAdapter = SortedWordsAdapter(correctLeftWords) {
                selectedWord = it
            }
            val middleWordsAdapter = SortedWordsAdapter(correctMiddleWords) {
                selectedWord = it
            }
            val rightWordsAdapter = SortedWordsAdapter(correctRightWords) {
                selectedWord = it
            }

            val wordsAdapter = WordsAdapter {
                selectedWord = it
            }.apply {
                submitList(words)
            }

            /** Left words */
            rvLeftColumn.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            rvLeftColumn.adapter = leftWordsAdapter

            rvLeftColumn.setOnDragListener(
                DropListener {
                    if (wordsAdapter.currentList.contains(selectedWord) && !leftWordsAdapter.currentList.contains(selectedWord)) {
                        wordsAdapter.removeItem(selectedWord)
                        middleWordsAdapter.removeItem(selectedWord)
                        rightWordsAdapter.removeItem(selectedWord)
                        leftWordsAdapter.addItem(selectedWord)
                        if (Observer.emptyDataObserver.value == true) {
                            btnNext.isVisible = true
                        }
                    }
                }
            )

            /** Middle words */
            rvLooksWords.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            rvLooksWords.adapter = middleWordsAdapter

            rvLooksWords.setOnDragListener(
                DropListener {
                    if (wordsAdapter.currentList.contains(selectedWord) && !middleWordsAdapter.currentList.contains(selectedWord)) {
                        wordsAdapter.removeItem(selectedWord)
                        leftWordsAdapter.removeItem(selectedWord)
                        rightWordsAdapter.removeItem(selectedWord)
                        middleWordsAdapter.addItem(selectedWord)
                        if (Observer.emptyDataObserver.value == true) {
                            binding.btnNext.isVisible = true
                        }
                    }
                }
            )

            /** Right words */
            rvHairWords.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            rvHairWords.adapter = rightWordsAdapter

            rvHairWords.setOnDragListener(
                DropListener {
                    if (wordsAdapter.currentList.contains(selectedWord) && !rightWordsAdapter.currentList.contains(selectedWord)) {
                        wordsAdapter.removeItem(selectedWord)
                        middleWordsAdapter.removeItem(selectedWord)
                        leftWordsAdapter.removeItem(selectedWord)
                        rightWordsAdapter.addItem(selectedWord)
                        if (Observer.emptyDataObserver.value == true) {
                            binding.btnNext.isVisible = true
                        }
                    }
                }
            )

            rvWords.layoutManager = FlexboxLayoutManager(requireContext(), FlexDirection.ROW, FlexWrap.WRAP).apply {
                justifyContent = JustifyContent.SPACE_EVENLY
                alignItems = AlignItems.CENTER
            }
            rvWords.adapter = wordsAdapter
        }
    }
}