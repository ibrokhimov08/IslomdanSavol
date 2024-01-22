package uz.ibrokhimov.quizislamic.ui.fragment

import android.content.pm.ActivityInfo
import android.view.View
import androidx.navigation.fragment.findNavController
import uz.ibrokhimov.quizislamic.core.base.BaseFragment
import uz.ibrokhimov.quizislamic.databinding.ScreenStartBinding

class ScreenStart :BaseFragment() {
    private val binding by lazy { ScreenStartBinding.inflate(layoutInflater) }

    override fun onCreate(): View {
        requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        return binding.root
    }

    override fun onCreated() {
        loadAction()
    }

    private fun loadAction() {

        binding.startBtn.setOnClickListener{
            findNavController().navigate(ScreenStartDirections.screenToGame())
        }

        binding.exitBtn.setOnClickListener{
            requireActivity().finish()
        }

    }
}