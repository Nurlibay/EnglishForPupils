package uz.nurlibaydev.englishforpupils.presentation.exercises.speaking

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.data.PictureData
import uz.nurlibaydev.englishforpupils.data.SpeakingData
import uz.nurlibaydev.englishforpupils.databinding.FragmentSpeakingScreenBinding
import uz.nurlibaydev.englishforpupils.databinding.ScreenPictureGameBinding
import uz.nurlibaydev.englishforpupils.presentation.exercises.picturegame.PictureGameScreenDirections
import uz.nurlibaydev.englishforpupils.utils.Observer
import uz.nurlibaydev.englishforpupils.utils.extensions.onClick

class SpeakingScreen : Fragment(R.layout.fragment_speaking_screen) {

    private val binding by viewBinding<FragmentSpeakingScreenBinding>()
    private var firstQuestionVariants = HashMap<Int, String>()
    private var secondQuestionVariants = HashMap<Int, String>()

    override fun onResume() {
        super.onResume()
        Observer.whichTask.value = 6
    }

    private var answersIndex = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        firstQuestionVariants = SpeakingData.getSpeakingScreenQuestions(Observer.whichUnit.value!!)[0]
        secondQuestionVariants = SpeakingData.getSpeakingScreenQuestions(Observer.whichUnit.value!!)[1]
        answersIndex = SpeakingData.getSpeakingScreenAnswers(Observer.whichUnit.value!!)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            btnFinish.setOnClickListener {
                findNavController().navigate(PictureGameScreenDirections.actionPictureGameScreenToWordOrderScreen())
            }
            when (Observer.whichUnit.value!!) {
                1 -> {
                    tvFirstQuestion.text = "What are your hobbies?"
                    tvSecondQuestion.text = "When do you usually do your homework?"
                }
                2 -> {
                    tvFirstQuestion.text = "Where do you usually do shopping?"
                    tvSecondQuestion.text = "Who do you usually go shopping with?"
                }
                3 -> {
                    tvFirstQuestion.text = "What do you do in your free time?"
                    tvSecondQuestion.text = "Where do you spend most of your time?"
                }
                4 -> {
                    tvFirstQuestion.text = "What sports are popular in your country?"
                    tvSecondQuestion.text = "How was the film?"
                }
                5 -> {
                    tvFirstQuestion.text = "How often do you write a letter?"
                    tvSecondQuestion.text = "Is letter writing popular?"
                }
                6 -> {
                    tvFirstQuestion.text = "When do you use public transport?"
                    tvSecondQuestion.text = "Do you use rubbish bin?"
                }
                7 -> {
                    tvFirstQuestion.text = "How people make friends?"
                    tvSecondQuestion.text = "What makes you happy?"
                }
                8 -> {
                    tvFirstQuestion.text = "How often do you travel?"
                    tvSecondQuestion.text = "How do you travel?"
                }
                9 -> {
                    tvFirstQuestion.text = "Do you like shopping?"
                    tvSecondQuestion.text = "Why do you go shopping?"
                }
                10 -> {
                    tvFirstQuestion.text = "Do you like cooking?"
                    tvSecondQuestion.text = "How often do you cook?"
                }

            }
            radioFirstQuestion1.text = firstQuestionVariants[0]
            radioFirstQuestion2.text = firstQuestionVariants[1]
            radioFirstQuestion3.text = firstQuestionVariants[2]
            radioFirstQuestion4.text = firstQuestionVariants[3]

            radioSecondQuestion1.text = secondQuestionVariants[0]
            radioSecondQuestion2.text = secondQuestionVariants[1]
            radioSecondQuestion3.text = secondQuestionVariants[2]
            radioSecondQuestion4.text = secondQuestionVariants[3]

            val firstQuestionState =
                radioFirstQuestion1.isChecked || radioFirstQuestion2.isChecked || radioFirstQuestion3.isChecked || radioFirstQuestion4.isChecked
            val secondQuestionState =
                radioSecondQuestion1.isChecked || radioSecondQuestion2.isChecked || radioSecondQuestion3.isChecked || radioSecondQuestion4.isChecked

            if (firstQuestionState && secondQuestionState) {
                btnFinish.isVisible = true
            }

            btnFinish.onClick {
                if (btnFinish.text == getString(R.string.finish)) {
                    Toast.makeText(requireContext(), "Boldi molodec!!", Toast.LENGTH_SHORT).show()
                } else {
                    radioFirstQuestion1.isClickable = false
                    radioFirstQuestion2.isClickable = false
                    radioFirstQuestion3.isClickable = false
                    radioFirstQuestion4.isClickable = false

                    radioSecondQuestion1.isClickable = false
                    radioSecondQuestion2.isClickable = false
                    radioSecondQuestion3.isClickable = false
                    radioSecondQuestion4.isClickable = false

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
                }
            }
        }
    }
}