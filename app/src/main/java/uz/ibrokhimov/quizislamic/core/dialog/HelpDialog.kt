package uz.ibrokhimov.quizislamic.core.dialog

import android.app.Dialog
import android.content.Context
import uz.ibrokhimov.quizislamic.databinding.ItemHelpBinding

class HelpDialog(context: Context):Dialog(context) {

    private val binding by lazy { ItemHelpBinding.inflate(layoutInflater) }

    init {
        setContentView(binding.root)
    }
}