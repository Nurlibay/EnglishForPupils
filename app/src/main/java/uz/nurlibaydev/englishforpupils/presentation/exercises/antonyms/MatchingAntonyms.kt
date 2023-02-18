package uz.nurlibaydev.englishforpupils.presentation.exercises.antonyms

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.databinding.ScreenMatchAntonymsBinding
import uz.nurlibaydev.englishforpupils.presentation.exercises.matchingwords.MatchingWordsScreenDirections
import uz.nurlibaydev.englishforpupils.utils.extensions.onClick

/**
 *  Created by Nurlibay Koshkinbaev on 18/02/2023 18:45
 */

@AndroidEntryPoint
class MatchingAntonyms: Fragment(R.layout.screen_match_antonyms) {

    private val binding by viewBinding<ScreenMatchAntonymsBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNext.onClick {
            findNavController().navigate(MatchingAntonymsDirections.actionMatchingAntonymsToFillingScreen())
        }
    }
}