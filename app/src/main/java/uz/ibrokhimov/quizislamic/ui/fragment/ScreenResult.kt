package uz.ibrokhimov.quizislamic.ui.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import uz.ibrokhimov.quizislamic.core.base.BaseFragment
import uz.ibrokhimov.quizislamic.databinding.ScreenResultBinding

class ScreenResult : BaseFragment() {
    private val binding by lazy { ScreenResultBinding.inflate(layoutInflater) }
    private val args: ScreenResultArgs by navArgs()

    override fun onCreate(): View {
        return binding.root
    }

    override fun onCreated() {

        loadView()
        loadAction()

    }

    private fun loadView() {
        binding.trueAnswerSize.text = "To'g'ri javoblar soni - ${args.trueAnswer}"
    }

    private fun loadAction() {
        binding.refreshBtn.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}