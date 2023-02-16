package uz.nurlibaydev.englishforpupils.presentation.exercise

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.databinding.ScreenExerciseBinding

/**
 *  Created by Nurlibay Koshkinbaev on 16/02/2023 16:54
 */

@AndroidEntryPoint
class ExerciseScreen : Fragment(R.layout.screen_exercise){

    private val binding: ScreenExerciseBinding by viewBinding()
    private val navArgs by navArgs<ExerciseScreenArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            tvUnitName.text = navArgs.unitName
        }
    }
}