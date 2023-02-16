package uz.nurlibaydev.englishforpupils.presentation.exercise

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.flexbox.*
import uz.nurlibaydev.englishforpupils.presentation.exercise.adapter.SentenceAdapter
import uz.nurlibaydev.englishforpupils.presentation.exercise.adapter.WordsAdapter
import uz.nurlibaydev.englishforpupils.presentation.exercise.callback.DropListener
import dagger.hilt.android.AndroidEntryPoint
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.databinding.ScreenExerciseBinding

/**
 *  Created by Nurlibay Koshkinbaev on 16/02/2023 16:54
 */

@AndroidEntryPoint
class ExerciseScreen : Fragment(R.layout.screen_exercise) {

    private val binding: ScreenExerciseBinding by viewBinding()
    private val navArgs by navArgs<ExerciseScreenArgs>()

    private val words = mutableListOf("world", "a", "!", "What", "wonderful")
    private var selectedWord = ""

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sentenceAdapter = SentenceAdapter()
        val wordsAdapter = WordsAdapter {
            selectedWord = it
        }.apply {
            submitList(words)
        }

        binding.rvSentence.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.rvSentence.adapter = sentenceAdapter

        binding.rvSentence.setOnDragListener(
            DropListener {
                wordsAdapter.removeItem(selectedWord)
                sentenceAdapter.addItem(selectedWord)
            }
        )

        binding.rvWords.layoutManager = FlexboxLayoutManager(requireContext(), FlexDirection.ROW, FlexWrap.WRAP).apply {
            justifyContent = JustifyContent.SPACE_EVENLY
            alignItems = AlignItems.CENTER
        }
        binding.rvWords.adapter = wordsAdapter
    }
}