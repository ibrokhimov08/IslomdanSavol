package uz.ibrokhimov.quizislamic.core.dialog

import android.app.Dialog
import android.content.Context
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import uz.ibrokhimov.quizislamic.databinding.LoseDialogBinding

class LoseDialog(context: Context, private val nav: NavController, val trueAnswer:Int) : Dialog(context, false, null) {

    private val binding by lazy { LoseDialogBinding.inflate(layoutInflater) }
    var onClickRestart: ((isRestarted :Boolean) -> Unit)? = null
    var onClickOut: ((isBacked :Boolean) -> Unit)? = null

    init {
        setContentView(binding.root)
        loadView()
        loadAction()
    }

    private fun loadView() {

        binding.trueAnswerSize.text = "To'g'ri javoblar soni - $trueAnswer"

    }

    private fun loadAction() {

        binding.logOut.setOnClickListener {
            nav.popBackStack()
            onClickOut?.invoke(true)
        }

        binding.restart.setOnClickListener {
            onClickRestart?.invoke(true)
        }
    }




}