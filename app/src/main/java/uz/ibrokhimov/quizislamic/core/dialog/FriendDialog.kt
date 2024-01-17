package uz.ibrokhimov.quizislamic.core.dialog

import android.app.Dialog
import android.content.Context
import uz.ibrokhimov.quizislamic.databinding.ItemDialogBinding

class FriendDialog(context: Context, private val javob: String) : Dialog(context) {


    private val binding by lazy { ItemDialogBinding.inflate(layoutInflater) }

    init {
        setContentView(binding.root)
        loadView()
    }

    private fun loadView() {
        binding.trueAnswer.text = javob
    }
}