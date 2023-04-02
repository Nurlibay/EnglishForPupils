package uz.nurlibaydev.englishforpupils.presentation.exercises.wordorder

import android.graphics.Color
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
import uz.nurlibaydev.englishforpupils.data.WordOrderData
import uz.nurlibaydev.englishforpupils.databinding.ScreenWordOrderBinding
import uz.nurlibaydev.englishforpupils.utils.Observer
import uz.nurlibaydev.englishforpupils.utils.extensions.onClick

/**
 *  Created by Nurlibay Koshkinbaev on 18/02/2023 18:48
 */

@AndroidEntryPoint
class WordOrderScreen : Fragment(R.layout.screen_word_order) {

    private val binding by viewBinding<ScreenWordOrderBinding>()
    private var words = mutableListOf<String>()
    private var correctAnswer = ""
    private val wordsAdapter by lazy { WordOrderAdapter() }
    private val answerWordsAdapter by lazy { WordOrderAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        words = WordOrderData.getWordOrderWords(Observer.whichUnit.value!!)
        correctAnswer = WordOrderData.getWordOrderAnswers(Observer.whichUnit.value!!)
    }

    override fun onResume() {
        super.onResume()
        Observer.whichTask.value = 4
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            btnNext.onClick {
                if (btnNext.text == requireContext().resources.getString(R.string.next)) {
                    findNavController().navigate(WordOrderScreenDirections.actionWordOrderScreenToPictureGameScreen())
                } else {
                    btnNext.text = requireContext().resources.getString(R.string.next)
                    var answer = ""
                    answerWordsAdapter.currentList.forEachIndexed { index, element ->
                        answer += if (answerWordsAdapter.currentList.size - 1 == index) {
                            element
                        } else {
                            "$element "
                        }
                    }
                    if (correctAnswer == answer) {
                        tvState.text = getString(R.string.correct)
                        tvState.setTextColor(Color.parseColor("#0BE814"))
                    } else {
                        tvState.text = getString(R.string.incorrect)
                        tvCorrectAnswer.text = correctAnswer
                        tvCorrectAnswer.setTextColor(Color.parseColor("#0BE814"))
                        tvState.setTextColor(Color.parseColor("#F44336"))
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
            rvWords.adapter = wordsAdapter
            wordsAdapter.setOnItemClickListener {
                answerWordsAdapter.addItem(it)
                wordsAdapter.removeItem(it)
                if (wordsAdapter.currentList.size == 1) {
                    btnNext.isVisible = true
                }
            }

            rvSortedWords.adapter = answerWordsAdapter
            answerWordsAdapter.submitList(emptyList())
            rvSortedWords.layoutManager = FlexboxLayoutManager(requireContext(), FlexDirection.ROW, FlexWrap.WRAP).apply {
                justifyContent = JustifyContent.SPACE_EVENLY
                alignItems = AlignItems.CENTER
            }
            answerWordsAdapter.setOnItemClickListener {
                if (wordsAdapter.currentList.isNotEmpty()) {
                    wordsAdapter.addItem(it)
                    answerWordsAdapter.removeItem(it)
                }
            }
        }
    }
}