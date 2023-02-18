package uz.nurlibaydev.englishforpupils.presentation.exercises.wordorder

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.databinding.ScreenWordOrderBinding
import uz.nurlibaydev.englishforpupils.utils.extensions.onClick

/**
 *  Created by Nurlibay Koshkinbaev on 18/02/2023 18:48
 */

@AndroidEntryPoint
class WordOrderScreen : Fragment(R.layout.screen_word_order) {

    private val binding by viewBinding<ScreenWordOrderBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNext.onClick {
            findNavController().navigate(WordOrderScreenDirections.actionWordOrderScreenToPictureGameScreen())
        }
    }
}