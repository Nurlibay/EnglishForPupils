package uz.nurlibaydev.englishforpupils.presentation.exercises

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.databinding.ContainerTasksBinding
import uz.nurlibaydev.englishforpupils.utils.Observer
import uz.nurlibaydev.englishforpupils.utils.extensions.onClick

/**
 *  Created by Nurlibay Koshkinbaev on 18/02/2023 18:37
 */

@AndroidEntryPoint
class MainContainer : Fragment(R.layout.container_tasks) {

    private val navArgs by navArgs<MainContainerArgs>()
    private lateinit var navController: NavController
    private val binding by viewBinding<ContainerTasksBinding>()

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            Observer.whichTask.observe(viewLifecycleOwner) {
                when (it) {
                    1 -> unitName.text = "1: Categorize the words"
                    2 -> unitName.text = "2: Match antonyms"
                    3 -> unitName.text = "3: Use past Simple"
                    4 -> unitName.text = "4: Collect right sentence"
                    5 -> unitName.text = "5: Find picture meaning"
                }
            }
            btnBack.onClick {
                findNavController().popBackStack()
            }
        }

        navController = Navigation.findNavController(requireActivity(), R.id.container_exercises)
    }
}