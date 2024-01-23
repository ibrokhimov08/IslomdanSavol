package uz.ibrokhimov.quizislamic.core.util

import android.widget.Toast
import androidx.fragment.app.Fragment

fun Fragment.myToast(text: String) {

    Toast.makeText(this.requireContext(), text, Toast.LENGTH_SHORT).show()

}