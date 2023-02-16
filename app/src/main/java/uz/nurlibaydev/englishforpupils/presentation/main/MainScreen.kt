package uz.nurlibaydev.englishforpupils.presentation.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.databinding.ScreenMainBinding

/**
 *  Created by Nurlibay Koshkinbaev on 16/02/2023 15:27
 */

@AndroidEntryPoint
class MainScreen : Fragment(R.layout.screen_main) {

    private lateinit var navController: NavController
    private val binding: ScreenMainBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(requireActivity(), R.id.inner_host_fragment)
        binding.bottomNavView.setupWithNavController(navController)
    }
}