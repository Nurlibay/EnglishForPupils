package uz.nurlibaydev.englishforpupils.presentation.exercises.results

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.nurlibaydev.englishforpupils.R
import uz.nurlibaydev.englishforpupils.databinding.FragmentResultScreenBinding
import uz.nurlibaydev.englishforpupils.databinding.FragmentSpeakingScreenBinding


class ResultScreen : Fragment(R.layout.fragment_result_screen) {

    private val binding by viewBinding<FragmentResultScreenBinding>()
    private val args: ResultScreenArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            tvPercent.text = "${args.percent}%"
            seekbar.progress = args.percent
        }
    }
}