package uz.ibrokhimov.quizislamic.core.dialog

import android.app.Dialog
import android.content.Context
import uz.ibrokhimov.quizislamic.databinding.ItemDialogBinding
import uz.ibrokhimov.quizislamic.ui.fragment.ScreenGame

class Dialog(context: Context, val javob: String) : Dialog(context) {

    private val screenGame = ScreenGame()
    private val binding by lazy { ItemDialogBinding.inflate(layoutInflater) }

    init {
        setContentView(binding.root)
        loadView()
    }

    private fun loadView() {
        binding.trueAnswer.text = javob

        /*binding.okBtn.setOnClickListener {

            dismiss()

        }*/
    }
}