package uz.nurlibaydev.englishforpupils.presentation.exercises.filling

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.data.DataList
import uz.nurlibaydev.englishforpupils.databinding.ScreenFillingBinding
import uz.nurlibaydev.englishforpupils.utils.Observer
import uz.nurlibaydev.englishforpupils.utils.extensions.onClick

/**
 *  Created by Nurlibay Koshkinbaev on 18/02/2023 18:47
 */

@AndroidEntryPoint
class FillingScreen : Fragment(R.layout.screen_filling) {

    private val binding by viewBinding<ScreenFillingBinding>()
    private var questions = mutableListOf<String>()
    private var answers = mutableListOf<String>()
    private val args: FillingScreenArgs by navArgs()
    private var correctAnswers = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Observer.whichTask.value = 5
        questions = DataList.getFillingQuestions(Observer.whichUnit.value!!)
        answers = DataList.getFillingAnswers(Observer.whichUnit.value!!)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            correctAnswers = args.correctAnswers
            btnNext.onClick {
                if(answers.isNotEmpty()){
                    if (btnNext.text == "Next") {
                        val action = FillingScreenDirections.actionFillingScreenToSpeakingScreen(correctAnswers)
                        findNavController().navigate(action)
                    } else {
                        btnNext.text = "Next"
                        if (etFirstQuestion.text.toString() == answers[0]) {
                            tvFirstQuestionState.text = "Correct"
                            tvFirstQuestionState.setTextColor(Color.parseColor("#0BE814"))
                            correctAnswers +=5
                        } else {
                            tvFirstQuestionState.text = "Incorrect"
                            tvFirstQuestionState.setTextColor(Color.parseColor("#F44336"))
                        }

                        if (etSecondQuestion.text.toString() == answers[1]) {
                            tvSecondQuestionState.text = "Correct"
                            tvSecondQuestionState.setTextColor(Color.parseColor("#0BE814"))
                            correctAnswers +=5
                        } else {
                            tvSecondQuestionState.text = "Incorrect"
                            tvSecondQuestionState.setTextColor(Color.parseColor("#F44336"))
                        }

                        if (etThirdQuestion.text.toString() == answers[2]) {
                            tvThirdQuestionState.text = "Correct"
                            tvThirdQuestionState.setTextColor(Color.parseColor("#0BE814"))
                            correctAnswers +=5
                        } else {
                            tvThirdQuestionState.text = "Incorrect"
                            tvThirdQuestionState.setTextColor(Color.parseColor("#F44336"))
                        }

                        if (etFourQuestion.text.toString() == answers[3]) {
                            tvFourQuestionState.text = "Correct"
                            tvFourQuestionState.setTextColor(Color.parseColor("#0BE814"))
                            correctAnswers +=5
                        } else {
                            tvFourQuestionState.text = "Incorrect"
                            tvFourQuestionState.setTextColor(Color.parseColor("#F44336"))
                        }
                    }
                }
            }

            if (questions.isNotEmpty()) {
                tvFirstQuestion.text = questions[0]
                tvSecondQuestion.text = questions[1]
                tvThirdQuestion.text = questions[2]
                tvFourQuestion.text = questions[3]
            }
        }
    }
}