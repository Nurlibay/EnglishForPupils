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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Observer.whichUnit.value = navArgs.unitName.split(" ")[1].toInt()
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            Observer.whichTask.observe(viewLifecycleOwner) {
                when (it) {
                    1 -> unitName.text = "1. Find picture meaning"
                    2 -> unitName.text = "2. Collect right sentence"
                    3 -> unitName.text = "3. Match antonyms"
                    4 -> unitName.text = "4. Categorize the words"
                    5 -> unitName.text = "5. Use past Simple"
                    6 -> unitName.text = "6. Speaking"
                }
            }
            Observer.whichUnit.observe(viewLifecycleOwner) { unitNumber ->
                if (unitNumber == 15) {
                    unitName.text = "3. Match synonyms"
                } else {
                    unitName.text = "3. Match antonyms"
                }
            }
            btnBack.onClick {
                findNavController().popBackStack()
            }
        }

        navController = Navigation.findNavController(requireActivity(), R.id.container_exercises)
    }
}