package com.saugatjonchhen.kotlin.example.db

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.saugatjonchhen.kotlin.example.R
import com.saugatjonchhen.kotlin.example.databinding.ActivityProgressBarCodeChallengeBinding

class ProgressBarCodeChallengeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProgressBarCodeChallengeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_progress_bar_code_challenge)

        binding =
            DataBindingUtil.setContentView(this,
                R.layout.activity_progress_bar_code_challenge
            )

        binding.btnControl.setOnClickListener { startOrStopProgressBar() }

    }

    private fun startOrStopProgressBar() {

        binding.apply {
            if (progressBar.visibility == View.VISIBLE) {
                progressBar.visibility = View.GONE
                btnControl.text = "Start"
            } else {
                progressBar.visibility = View.VISIBLE
                btnControl.text = "Stop"
            }
        }

    }
}
