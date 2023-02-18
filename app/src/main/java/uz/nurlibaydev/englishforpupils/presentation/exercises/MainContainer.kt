package uz.nurlibaydev.englishforpupils.presentation.exercises

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.databinding.ContainerTasksBinding

/**
 *  Created by Nurlibay Koshkinbaev on 18/02/2023 18:37
 */

@AndroidEntryPoint
class MainContainer : Fragment(R.layout.container_tasks) {

    private val navArgs by navArgs<MainContainerArgs>()
    private lateinit var navController: NavController
    private val binding by viewBinding<ContainerTasksBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.unitName.text = navArgs.unitName
        navController = Navigation.findNavController(requireActivity(), R.id.container_exercises)
    }
}