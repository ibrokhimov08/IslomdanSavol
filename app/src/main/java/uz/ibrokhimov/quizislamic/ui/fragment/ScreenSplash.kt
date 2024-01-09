package uz.ibrokhimov.quizislamic.ui.fragment

import android.os.Handler
import android.view.View
import androidx.navigation.fragment.findNavController
import uz.ibrokhimov.quizislamic.core.base.BaseFragment
import uz.ibrokhimov.quizislamic.databinding.ScreenSplashBinding


class ScreenSplash : BaseFragment() {

    private val binding by lazy { ScreenSplashBinding.inflate(layoutInflater) }

    override fun onCreate(): View {
        return binding.root
    }

    override fun onCreated() {

        Handler().postDelayed(
            {
                findNavController().navigate(ScreenSplashDirections.splashToStart())
            },
            1500
        )
    }
}