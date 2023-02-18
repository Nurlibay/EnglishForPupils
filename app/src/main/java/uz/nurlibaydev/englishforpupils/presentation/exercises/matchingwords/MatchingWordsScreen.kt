package uz.nurlibaydev.englishforpupils.presentation.exercises.matchingwords

import android.os.Bundle
import android.view.View
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
import uz.nurlibaydev.englishforpupils.utils.extensions.onClick

/**
 *  Created by Nurlibay Koshkinbaev on 16/02/2023 16:54
 */

@AndroidEntryPoint
class MatchingWordsScreen : Fragment(R.layout.screen_match_words) {

    private val binding: ScreenMatchWordsBinding by viewBinding()
    private val words = mutableListOf(
        "Bald", "attractive", "blonde", "curly", "dark",
        "elderly", "fair", "good-looking", "handsome",
        "middle-aged", "pretty", "straight", "teenage", "in", "his/her", "twenties"
    )
    private var selectedWord = ""

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNext.onClick {
            findNavController().navigate(MatchingWordsScreenDirections.actionMatchingWordsScreenToMatchingAntonyms())
        }

        val ageWordsAdapter = SortedWordsAdapter {
            selectedWord = it
        }
        val looksWordsAdapter = SortedWordsAdapter {
            selectedWord = it
        }
        val hairWordsAdapter = SortedWordsAdapter {
            selectedWord = it
        }

        val wordsAdapter = WordsAdapter {
            selectedWord = it
        }.apply {
            submitList(words)
        }

        binding.rvWords.setOnDragListener(
            DropListener {
                wordsAdapter.addItem(selectedWord)
                ageWordsAdapter.currentList.forEach {
                    if (selectedWord == it) {
                        ageWordsAdapter.removeItem(selectedWord)
                    }
                }
                looksWordsAdapter.currentList.forEach {
                    if (selectedWord == it) {
                        looksWordsAdapter.removeItem(selectedWord)
                    }
                }
                hairWordsAdapter.currentList.forEach {
                    if (selectedWord == it) {
                        hairWordsAdapter.removeItem(selectedWord)
                    }
                }
            }
        )

        /** Age words */
        binding.rvAgeWords.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rvAgeWords.adapter = ageWordsAdapter

        binding.rvAgeWords.setOnDragListener(
            DropListener {
                wordsAdapter.removeItem(selectedWord)
                looksWordsAdapter.removeItem(selectedWord)
                hairWordsAdapter.removeItem(selectedWord)
                ageWordsAdapter.addItem(selectedWord)
            }
        )

        /** Looks words */
        binding.rvLooksWords.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rvLooksWords.adapter = looksWordsAdapter

        binding.rvLooksWords.setOnDragListener(
            DropListener {
                wordsAdapter.removeItem(selectedWord)
                ageWordsAdapter.removeItem(selectedWord)
                hairWordsAdapter.removeItem(selectedWord)
                looksWordsAdapter.addItem(selectedWord)
            }
        )

        /** Hair words */
        binding.rvHairWords.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rvHairWords.adapter = hairWordsAdapter

        binding.rvHairWords.setOnDragListener(
            DropListener {
                wordsAdapter.removeItem(selectedWord)
                looksWordsAdapter.removeItem(selectedWord)
                ageWordsAdapter.removeItem(selectedWord)
                hairWordsAdapter.addItem(selectedWord)
            }
        )

        binding.rvWords.layoutManager = FlexboxLayoutManager(requireContext(), FlexDirection.ROW, FlexWrap.WRAP).apply {
            justifyContent = JustifyContent.SPACE_EVENLY
            alignItems = AlignItems.CENTER
        }
        binding.rvWords.adapter = wordsAdapter
    }
}