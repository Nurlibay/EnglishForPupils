package uz.nurlibaydev.englishforpupils.presentation.exercises.matchingwords

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
import uz.nurlibaydev.englishforpupils.databinding.ScreenMatchWordsBinding
import uz.nurlibaydev.englishforpupils.presentation.exercises.matchingwords.adapter.SortedWordsAdapter
import uz.nurlibaydev.englishforpupils.presentation.exercises.matchingwords.adapter.WordsAdapter
import uz.nurlibaydev.englishforpupils.presentation.exercises.matchingwords.callback.DropListener
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
    private val words = mutableListOf(
        "bald", "attractive", "blonde", "curly", "dark",
        "elderly", "fair", "good-looking", "handsome",
        "middle-aged", "pretty", "straight", "teenage", "in twenties"
    )
    private var selectedWord = ""
    private val correctAgeWords = mutableListOf("elderly", "middle-aged", "teenage", "in twenties")
    private val correctLooksWords = mutableListOf("attractive", "good-looking", "handsome", "pretty")
    private val correctHairWords = mutableListOf("bald", "blonde", "curly", "dark", "fair", "straight")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            btnNext.onClick {
                findNavController().navigate(MatchingWordsScreenDirections.actionMatchingWordsScreenToMatchingAntonyms())
            }

            val ageWordsAdapter = SortedWordsAdapter(correctAgeWords) {
                selectedWord = it
            }
            val looksWordsAdapter = SortedWordsAdapter(correctLooksWords) {
                selectedWord = it
            }
            val hairWordsAdapter = SortedWordsAdapter(correctHairWords) {
                selectedWord = it
            }

            val wordsAdapter = WordsAdapter {
                selectedWord = it
            }.apply {
                submitList(words)
            }

            /** Age words */
            rvLeftColumn.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            rvLeftColumn.adapter = ageWordsAdapter

            rvLeftColumn.setOnDragListener(
                DropListener {
                    if (wordsAdapter.currentList.contains(selectedWord) && !ageWordsAdapter.currentList.contains(selectedWord)) {
                        wordsAdapter.removeItem(selectedWord)
                        looksWordsAdapter.removeItem(selectedWord)
                        hairWordsAdapter.removeItem(selectedWord)
                        ageWordsAdapter.addItem(selectedWord)
                        if (Observer.emptyDataObserver.value == true) {
                            btnNext.isVisible = true
                        }
                    }
                }
            )

            /** Looks words */
            rvLooksWords.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            rvLooksWords.adapter = looksWordsAdapter

            rvLooksWords.setOnDragListener(
                DropListener {
                    if (wordsAdapter.currentList.contains(selectedWord) && !looksWordsAdapter.currentList.contains(selectedWord)) {
                        wordsAdapter.removeItem(selectedWord)
                        ageWordsAdapter.removeItem(selectedWord)
                        hairWordsAdapter.removeItem(selectedWord)
                        looksWordsAdapter.addItem(selectedWord)
                        if (Observer.emptyDataObserver.value == true) {
                            binding.btnNext.isVisible = true
                        }
                    }
                }
            )

            /** Hair words */
            rvHairWords.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            rvHairWords.adapter = hairWordsAdapter

            rvHairWords.setOnDragListener(
                DropListener {
                    if (wordsAdapter.currentList.contains(selectedWord) && !hairWordsAdapter.currentList.contains(selectedWord)) {
                        wordsAdapter.removeItem(selectedWord)
                        looksWordsAdapter.removeItem(selectedWord)
                        ageWordsAdapter.removeItem(selectedWord)
                        hairWordsAdapter.addItem(selectedWord)
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