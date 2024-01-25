package uz.ibrokhimov.quizislamic.ui.fragment

import android.content.pm.ActivityInfo
import android.media.MediaPlayer
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.forEachIndexed
import androidx.navigation.fragment.findNavController
import uz.ibrokhimov.quizislamic.R
import uz.ibrokhimov.quizislamic.core.base.BaseFragment
import uz.ibrokhimov.quizislamic.core.data.QuestionData
import uz.ibrokhimov.quizislamic.core.dialog.FriendDialog
import uz.ibrokhimov.quizislamic.core.dialog.HelpDialog
import uz.ibrokhimov.quizislamic.core.dialog.LoseDialog
import uz.ibrokhimov.quizislamic.databinding.ScreenGameBinding

class ScreenGame : BaseFragment() {
    private lateinit var timer: CountDownTimer
    private val binding by lazy { ScreenGameBinding.inflate(layoutInflater) }
    private var position = 0
    private var trueAnswerPosition = 0
    private val data = QuestionData.getData()
    private var coin = 0
    private var itemSelectMusic: MediaPlayer? = null
    private var itemTrueMusic: MediaPlayer? = null
    private var itemFalseMusic: MediaPlayer? = null
    private var timerCountDownTimer = 60
    private var counter = 60_000.0
    private var trueAnswerCount = 0
    private var falseAnswerCount = 0
    private var questionSize = 15
    private var isChecked = true

    override fun onCreate(): View {
        requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        return binding.root
    }

    override fun onCreated() {
        data.shuffle()
        loadView()
        loadAction()
        loadMusic()
    }

    private fun loadMusic() {
        itemSelectMusic = MediaPlayer.create(requireContext(), R.raw.select_answer)
        itemTrueMusic = MediaPlayer.create(requireContext(), R.raw.true_answer)
        itemFalseMusic = MediaPlayer.create(requireContext(), R.raw.false_answer)
    }


    private fun loadAction() {

        binding.answerGroup.forEachIndexed { i, _ ->

            val textView = binding.answerGroup.getChildAt(i) as TextView

            textView.setOnClickListener {
                if (isChecked) {
                    if (data[position].javoblar[i] == data[position].javob) {
                        trueAnswerPosition = i
                        trueAnswerCount++
                        isChecked = false
                        textView.setBackgroundResource(R.drawable.shape_of_start_btn)
                        itemSelectMusic!!.start()
                        Handler().postDelayed(
                            {
                                textView.setBackgroundResource(R.drawable.shape_of_true)
                                itemTrueMusic!!.start()
                            },
                            1_000
                        )
                        Handler().postDelayed(
                            {
                                positionIncrement()
                                coin += 5
                                loadView()
                            },
                            2000
                        )
                    } else {
                        isChecked = false
                        falseAnswerCount++
                        textView.setBackgroundResource(R.drawable.shape_of_start_btn)
                        itemSelectMusic!!.start()
                        Handler().postDelayed(
                            {
                                textView.setBackgroundResource(R.drawable.shape_of_false)
                                itemFalseMusic!!.start()
                            },
                            1_000
                        )

                        Handler().postDelayed({
                            (binding.answerGroup.getChildAt(getTrueAnswerId()) as TextView).setBackgroundResource(
                                R.drawable.shape_of_true
                            )
                        }, 2_000)

                        Handler().postDelayed(
                            {
                                timer.cancel()
                                val loseDialog =
                                    LoseDialog(
                                        requireContext(),
                                        this.findNavController(),
                                        trueAnswerCount
                                    )
                                loseDialog.show()
                                loseDialog.onClickOut = {
                                    if (it) {
                                        loseDialog.cancel()
                                    }
                                }
                                loseDialog.onClickRestart = {
                                    if (it) {
                                        position = 0
                                        data.shuffle()
                                        loadView()
                                        loseDialog.cancel()
                                    }
                                }
                            },
                            3_000
                        )
                        coin = 0
                    }
                }
                timer.cancel()
            }

        }

        binding.changeQuestion.setOnClickListener {
            if (isChecked) {
                if (coin >= 15) {
                    questionSize++
                    coin -= 15
                    binding.winCoin.text = "Yutuq: $coin"
                    positionIncrement()
                    loadView()
                } else {
                    Toast.makeText(
                        requireContext(),
                        "Sizning yutuqlar soningiz kamida 15 bolishi kerak",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }

        binding.halfBtn.setOnClickListener {
            binding.winCoin.text = "Yutuq: $coin"
            if (isChecked) {
                var trueId = 0
                val trueAnswer = data[position].javob
                binding.answerGroup.forEachIndexed { i, _ ->
                    if (trueAnswer == data[position].javoblar[i]) {
                        trueId = i
                    }
                }
                if (coin >= 15) {
                    when (trueId) {
                        0 -> {
                            binding.answerGroup.getChildAt(1).visibility = View.INVISIBLE
                            binding.answerGroup.getChildAt(3).visibility = View.INVISIBLE
                        }

                        1 -> {
                            binding.answerGroup.getChildAt(0).visibility = View.INVISIBLE
                            binding.answerGroup.getChildAt(2).visibility = View.INVISIBLE
                        }

                        2 -> {
                            binding.answerGroup.getChildAt(1).visibility = View.INVISIBLE
                            binding.answerGroup.getChildAt(0).visibility = View.INVISIBLE
                        }

                        3 -> {
                            binding.answerGroup.getChildAt(1).visibility = View.INVISIBLE
                            binding.answerGroup.getChildAt(2).visibility = View.INVISIBLE
                        }
                    }
                    coin -= 15
                    binding.winCoin.text = "Yutuq: $coin"
                } else {
                    Toast.makeText(
                        requireContext(),
                        "Sizning yutuqlar soningiz kamida 15 bolishi kerak",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }

        binding.eyeBtn.setOnClickListener {

            if (isChecked) {
                var trueId = 0
                val trueAnswer = data[position].javob
                binding.answerGroup.forEachIndexed { i, _ ->
                    if (trueAnswer == data[position].javoblar[i]) {
                        trueId = i
                    }
                }
                if (coin >= 15) {
                    binding.winCoin.text = "Yutuq:$coin"
                    when (trueId) {
                        0 -> {
                            binding.answerGroup.getChildAt(1).visibility = View.INVISIBLE
                            binding.answerGroup.getChildAt(2).visibility = View.INVISIBLE
                            binding.answerGroup.getChildAt(3).visibility = View.INVISIBLE
                        }

                        1 -> {
                            binding.answerGroup.getChildAt(0).visibility = View.INVISIBLE
                            binding.answerGroup.getChildAt(3).visibility = View.INVISIBLE
                            binding.answerGroup.getChildAt(2).visibility = View.INVISIBLE
                        }

                        2 -> {
                            binding.answerGroup.getChildAt(1).visibility = View.INVISIBLE
                            binding.answerGroup.getChildAt(3).visibility = View.INVISIBLE
                            binding.answerGroup.getChildAt(0).visibility = View.INVISIBLE
                        }

                        3 -> {
                            binding.answerGroup.getChildAt(1).visibility = View.INVISIBLE
                            binding.answerGroup.getChildAt(0).visibility = View.INVISIBLE
                            binding.answerGroup.getChildAt(2).visibility = View.INVISIBLE
                        }
                    }
                    coin -= 15
                    binding.winCoin.text = "Yutuq: $coin"
                } else {
                    Toast.makeText(
                        requireContext(),
                        "Sizning yutuqlar soningiz kamida 15 bolishi kerak",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }

        binding.friendBtn.setOnClickListener {
            var javob = "A"
            if (isChecked) {
                var trueId = 0
                val trueAnswer = data[position].javob
                binding.answerGroup.forEachIndexed { i, _ ->
                    if (trueAnswer == data[position].javoblar[i]) {
                        trueId = i
                    }
                }
                if (coin >= 15) {
                    binding.winCoin.text = "Yutuq:$coin"
                    when (trueId) {
                        0 -> javob = "A"
                        1 -> javob = "B"
                        2 -> javob = "C"
                        3 -> javob = "D"
                    }
                    coin -= 15
                    binding.winCoin.text = "Yutuq: $coin"
                    FriendDialog(context = requireContext(), javob).show()
                } else {
                    Toast.makeText(
                        requireContext(),
                        "Sizning yutuqlar soningiz kamida 15 bolishi kerak",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }

        binding.helpBtn.setOnClickListener {
            HelpDialog(requireContext()).show()
        }
    }


    private fun positionIncrement() {
        if (position < questionSize) position++
        else findNavController().navigate(
            ScreenGameDirections.gameToResult(
                falseAnswerCount
            )
        )
    }

    private fun loadView() {
        timerCountDownTimer = 60
        counter = 60_000.0

        timer = object : CountDownTimer(counter.toLong(), 1_000) {
            override fun onTick(millisUntilFinished: Long) {
                binding.time.text = "Vaqt: $timerCountDownTimer"
                timerCountDownTimer--
            }

            override fun onFinish() {
                findNavController().navigate(ScreenGameDirections.gameToResult(trueAnswerCount))
            }
        }.start()

        isChecked = true
        binding.answerGroup.forEachIndexed { i, _ ->
            val textView = binding.answerGroup.getChildAt(i) as TextView
            textView.visibility = View.VISIBLE
        }
        binding.question.text = data[position].savol
        binding.answerGroup.forEachIndexed { i, _ ->
            binding.answerGroup.getChildAt(i).setBackgroundResource(R.drawable.shape_of_bar)
            val child = binding.answerGroup.getChildAt(i) as TextView

            when (i) {
                0 -> child.text = "A: " + data[position].javoblar[i]
                1 -> child.text = "B: " + data[position].javoblar[i]
                2 -> child.text = "C: " + data[position].javoblar[i]
                3 -> child.text = "D: " + data[position].javoblar[i]
            }

        }
        binding.winCoin.text = "Yutuq: $coin"
        binding.questionCount.text = "Savol: ${position + 1}/$questionSize"
    }

    fun getTrueAnswerId(): Int {
        var trueAnswer = 0

        for (i in 0..3) {
            if (data[position].javoblar[i] == data[position].javob) {
                trueAnswer = i
            }
        }
        return trueAnswer
    }

    override fun onDetach() {
        super.onDetach()
        timer.cancel()
    }
}