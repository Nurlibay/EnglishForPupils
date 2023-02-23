package uz.nurlibaydev.englishforpupils.presentation.exercises.filling

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.databinding.ScreenFillingBinding
import uz.nurlibaydev.englishforpupils.utils.extensions.onClick

/**
 *  Created by Nurlibay Koshkinbaev on 18/02/2023 18:47
 */

@AndroidEntryPoint
class FillingScreen : Fragment(R.layout.screen_filling) {

    private val binding by viewBinding<ScreenFillingBinding>()

    private val wordList = mutableListOf(
        "Young man------[wear] smart suits and skinny ties in 1960th",
        "Clothing trends-----[match] the music",
        "People----[dress] second-hand clothes"
    )
    private val answers = mutableListOf("wore", "matched", "called")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            btnNext.onClick {
                if (btnNext.text == "Next") {
                    findNavController().navigate(FillingScreenDirections.actionFillingScreenToWordOrderScreen())
                } else {
                    btnNext.text = "Next"
                    if(etFirstQuestion.text.toString() == answers[0]){
                        tvFirstQuestionState.text = "Correct"
                        tvFirstQuestionState.setTextColor(Color.parseColor("#0BE814"))
                    } else {
                        tvFirstQuestionState.text = "Incorrect"
                        tvFirstQuestionState.setTextColor(Color.parseColor("#F44336"))
                    }

                    if(etSecondQuestion.text.toString() == answers[1]){
                        tvSecondQuestionState.text = "Correct"
                        tvSecondQuestionState.setTextColor(Color.parseColor("#0BE814"))
                    } else {
                        tvSecondQuestionState.text = "Incorrect"
                        tvSecondQuestionState.setTextColor(Color.parseColor("#F44336"))
                    }

                    if(etThirdQuestion.text.toString() == answers[2]){
                        tvThirdQuestionState.text = "Correct"
                        tvThirdQuestionState.setTextColor(Color.parseColor("#0BE814"))
                    } else {
                        tvThirdQuestionState.text = "Incorrect"
                        tvThirdQuestionState.setTextColor(Color.parseColor("#F44336"))
                    }
                }
            }

            tvFirstQuestion.text = wordList[0]
            tvSecondQuestion.text = wordList[1]
            tvThirdQuestion.text = wordList[2]


        }
    }
}