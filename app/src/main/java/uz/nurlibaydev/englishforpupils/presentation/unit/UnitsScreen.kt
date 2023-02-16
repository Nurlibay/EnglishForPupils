package uz.nurlibaydev.englishforpupils.presentation.unit

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.data.DataList
import uz.nurlibaydev.englishforpupils.databinding.ScreenUnitsBinding

/**
 *  Created by Nurlibay Koshkinbaev on 16/02/2023 16:09
 */

@AndroidEntryPoint
class UnitsScreen : Fragment(R.layout.screen_units) {

    private val binding: ScreenUnitsBinding by viewBinding()
    private val navController by lazy(LazyThreadSafetyMode.NONE) { findNavController() }
    private val adapter by lazy(LazyThreadSafetyMode.NONE) { UnitAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            setupAdapter()
            navigateTo()
        }
    }

    private fun navigateTo() {
        adapter.setOnUnitItemClickListener {
            navController.navigate(UnitsScreenDirections.actionUnitsScreenToExerciseScreen(it))
        }
    }
    private fun ScreenUnitsBinding.setupAdapter() {
        rvUnits.adapter = adapter
        adapter.submitList(DataList.getAllUnits())
    }
}