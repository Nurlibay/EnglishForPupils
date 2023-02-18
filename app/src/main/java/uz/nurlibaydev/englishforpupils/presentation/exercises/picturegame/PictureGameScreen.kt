package uz.nurlibaydev.englishforpupils.presentation.exercises.picturegame

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.databinding.ScreenPictureGameBinding
import uz.nurlibaydev.englishforpupils.utils.extensions.onClick

/**
 *  Created by Nurlibay Koshkinbaev on 18/02/2023 18:49
 */

@AndroidEntryPoint
class PictureGameScreen : Fragment(R.layout.screen_picture_game) {

    private val binding by viewBinding<ScreenPictureGameBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnFinish.onClick {

        }
    }
}