package uz.nurlibaydev.englishforpupils.presentation.exercises.picturegame

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.data.DataList
import uz.nurlibaydev.englishforpupils.data.PictureData
import uz.nurlibaydev.englishforpupils.databinding.ScreenPictureGameBinding
import uz.nurlibaydev.englishforpupils.utils.Observer
import uz.nurlibaydev.englishforpupils.utils.extensions.onClick
import uz.nurlibaydev.englishforpupils.utils.extensions.showMessage

/**
 *  Created by Nurlibay Koshkinbaev on 18/02/2023 18:49
 */

@AndroidEntryPoint
class PictureGameScreen : Fragment(R.layout.screen_picture_game) {

    override fun onResume() {
        super.onResume()
        Observer.whichTask.value = 5
    }

    private var firstQuestionVariants = HashMap<Int, String>()
    private var secondQuestionVariants = HashMap<Int, String>()
    private var thirdQuestionVariants = HashMap<Int, String>()
    private var fourthQuestionVariants = HashMap<Int, String>()
    private var answersIndex = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        firstQuestionVariants = PictureData.getPictureScreenQuestions(Observer.whichUnit.value!!)[0]
        secondQuestionVariants = PictureData.getPictureScreenQuestions(Observer.whichUnit.value!!)[1]
        thirdQuestionVariants = PictureData.getPictureScreenQuestions(Observer.whichUnit.value!!)[2]
        fourthQuestionVariants = PictureData.getPictureScreenQuestions(Observer.whichUnit.value!!)[3]
        answersIndex = PictureData.getPictureScreenAnswers(Observer.whichUnit.value!!)
    }

    private val binding by viewBinding<ScreenPictureGameBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            radioFirstQuestion1.text = firstQuestionVariants[0]
            radioFirstQuestion2.text = firstQuestionVariants[1]
            radioFirstQuestion3.text = firstQuestionVariants[2]
            radioFirstQuestion4.text = firstQuestionVariants[3]

            radioSecondQuestion1.text = secondQuestionVariants[0]
            radioSecondQuestion2.text = secondQuestionVariants[1]
            radioSecondQuestion3.text = secondQuestionVariants[2]
            radioSecondQuestion4.text = secondQuestionVariants[3]

            radioThirdQuestion1.text = thirdQuestionVariants[0]
            radioThirdQuestion2.text = thirdQuestionVariants[1]
            radioThirdQuestion3.text = thirdQuestionVariants[2]
            radioThirdQuestion4.text = thirdQuestionVariants[3]

            radioFourthQuestion1.text = fourthQuestionVariants[0]
            radioFourthQuestion2.text = fourthQuestionVariants[1]
            radioFourthQuestion3.text = fourthQuestionVariants[2]
            radioFourthQuestion4.text = fourthQuestionVariants[3]

            val firstQuestionState = radioFirstQuestion1.isChecked || radioFirstQuestion2.isChecked || radioFirstQuestion3.isChecked || radioFirstQuestion4.isChecked
            val secondQuestionState = radioSecondQuestion1.isChecked || radioSecondQuestion2.isChecked || radioSecondQuestion3.isChecked || radioSecondQuestion4.isChecked
            val thirdQuestionState = radioThirdQuestion1.isChecked || radioThirdQuestion2.isChecked || radioThirdQuestion3.isChecked || radioThirdQuestion4.isChecked
            val fourthQuestionState = radioFourthQuestion1.isChecked || radioFourthQuestion2.isChecked || radioFourthQuestion3.isChecked || radioFourthQuestion4.isChecked

            if(firstQuestionState && secondQuestionState && thirdQuestionState && fourthQuestionState){
                btnFinish.isVisible = true
            }

            btnFinish.onClick {


                radioFirstQuestion1.isClickable = false
                radioFirstQuestion2.isClickable = false
                radioFirstQuestion3.isClickable = false
                radioFirstQuestion4.isClickable = false

                radioSecondQuestion1.isClickable = false
                radioSecondQuestion2.isClickable = false
                radioSecondQuestion3.isClickable = false
                radioSecondQuestion4.isClickable = false

                radioThirdQuestion1.isClickable = false
                radioThirdQuestion2.isClickable = false
                radioThirdQuestion3.isClickable = false
                radioThirdQuestion4.isClickable = false

                radioFourthQuestion1.isClickable = false
                radioFourthQuestion2.isClickable = false
                radioFourthQuestion3.isClickable = false
                radioFourthQuestion4.isClickable = false

                btnFinish.text = getString(R.string.finish)
                if (radioFirstQuestion1.isChecked && radioFirstQuestion1.text.toString() == firstQuestionVariants[answersIndex[0]]) {
                    radioFirstQuestion1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green))
                } else if (radioFirstQuestion2.isChecked && radioFirstQuestion2.text.toString() == firstQuestionVariants[answersIndex[0]]) {
                    radioFirstQuestion2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green))
                } else if (radioFirstQuestion3.isChecked && radioFirstQuestion3.text.toString() == firstQuestionVariants[answersIndex[0]]) {
                    radioFirstQuestion3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green))
                } else if (radioFirstQuestion4.isChecked && radioFirstQuestion4.text.toString() == firstQuestionVariants[answersIndex[0]]) {
                    radioFirstQuestion4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green))
                } else {
                    if (radioFirstQuestion1.isChecked) radioFirstQuestion1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red))
                    if (radioFirstQuestion2.isChecked) radioFirstQuestion2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red))
                    if (radioFirstQuestion3.isChecked) radioFirstQuestion3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red))
                    if (radioFirstQuestion4.isChecked) radioFirstQuestion4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red))
                }

                if (radioSecondQuestion1.isChecked && radioSecondQuestion1.text.toString() == secondQuestionVariants[answersIndex[1]]) {
                    radioSecondQuestion1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green))
                } else if (radioSecondQuestion2.isChecked && radioSecondQuestion2.text.toString() == secondQuestionVariants[answersIndex[1]]) {
                    radioSecondQuestion2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green))
                } else if (radioSecondQuestion3.isChecked && radioSecondQuestion3.text.toString() == secondQuestionVariants[answersIndex[1]]) {
                    radioSecondQuestion3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green))
                } else if (radioSecondQuestion4.isChecked && radioSecondQuestion4.text.toString() == secondQuestionVariants[answersIndex[1]]) {
                    radioSecondQuestion4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green))
                } else {
                    if (radioSecondQuestion1.isChecked) radioSecondQuestion1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red))
                    if (radioSecondQuestion2.isChecked) radioSecondQuestion2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red))
                    if (radioSecondQuestion3.isChecked) radioSecondQuestion3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red))
                    if (radioSecondQuestion4.isChecked) radioSecondQuestion4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red))
                }

                if (radioThirdQuestion1.isChecked && radioThirdQuestion1.text.toString() == thirdQuestionVariants[answersIndex[2]]) {
                    radioThirdQuestion1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green))
                } else if (radioThirdQuestion2.isChecked && radioThirdQuestion2.text.toString() == thirdQuestionVariants[answersIndex[2]]) {
                    radioThirdQuestion2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green))
                } else if (radioThirdQuestion3.isChecked && radioThirdQuestion3.text.toString() == thirdQuestionVariants[answersIndex[2]]) {
                    radioThirdQuestion3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green))
                } else if (radioThirdQuestion4.isChecked && radioThirdQuestion4.text.toString() == thirdQuestionVariants[answersIndex[2]]) {
                    radioThirdQuestion4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green))
                } else {
                    if (radioThirdQuestion1.isChecked) radioThirdQuestion1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red))
                    if (radioThirdQuestion2.isChecked) radioThirdQuestion2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red))
                    if (radioThirdQuestion3.isChecked) radioThirdQuestion3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red))
                    if (radioThirdQuestion4.isChecked) radioThirdQuestion4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red))
                }

                if (radioFourthQuestion1.isChecked && radioFourthQuestion1.text.toString() == fourthQuestionVariants[answersIndex[3]]) {
                    radioFourthQuestion1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green))
                } else if (radioFourthQuestion2.isChecked && radioFourthQuestion2.text.toString() == fourthQuestionVariants[answersIndex[3]]) {
                    radioFourthQuestion2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green))
                } else if (radioFourthQuestion3.isChecked && radioFourthQuestion3.text.toString() == fourthQuestionVariants[answersIndex[3]]) {
                    radioFourthQuestion3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green))
                } else if (radioFourthQuestion4.isChecked && radioFourthQuestion4.text.toString() == fourthQuestionVariants[answersIndex[3]]) {
                    radioFourthQuestion4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green))
                } else {
                    if (radioFourthQuestion1.isChecked) radioFourthQuestion1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red))
                    if (radioFourthQuestion2.isChecked) radioFourthQuestion2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red))
                    if (radioFourthQuestion2.isChecked) radioFourthQuestion2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red))
                    if (radioFourthQuestion3.isChecked) radioFourthQuestion3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red))
                }
            }
        }
    }
}