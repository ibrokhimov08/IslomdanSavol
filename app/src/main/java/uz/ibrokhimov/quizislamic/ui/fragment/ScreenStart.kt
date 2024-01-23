package uz.ibrokhimov.quizislamic.ui.fragment

import android.content.pm.ActivityInfo
import android.view.View
import androidx.navigation.fragment.findNavController
import uz.ibrokhimov.quizislamic.core.base.BaseFragment
import uz.ibrokhimov.quizislamic.databinding.ScreenStartBinding
import uz.ibrokhimov.quizislamic.ui.main.MainActivity

class ScreenStart : BaseFragment() {
    private val binding by lazy { ScreenStartBinding.inflate(layoutInflater) }

    override fun onCreate(): View {
        requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        return binding.root
    }

    override fun onCreated() {
        loadAction()
    }

    private fun loadAction() {

        binding.startBtn.setOnClickListener {
            findNavController().navigate(ScreenStartDirections.screenToGame())
        }

        binding.exitBtn.setOnClickListener {
            requireActivity().finish()
        }


        binding.switchBtn.setOnCheckedChangeListener { buttonView, isChecked ->
            if (!isChecked) {
                MainActivity.turnOffMusic()
                buttonView.text = "Tovushni yoqish"
            } else {
                MainActivity.turnOnMusic()
                buttonView.text = "Tovushni o'chirish"
            }
        }
    }
}