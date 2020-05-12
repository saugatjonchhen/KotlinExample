package com.saugatjonchhen.kotlin.example.db

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.saugatjonchhen.kotlin.example.R
import com.saugatjonchhen.kotlin.example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )

        binding.btnSubmit.setOnClickListener { displayGreeting() }

    }

    private fun displayGreeting() {
        binding.apply {
            tvGreetings.text = "Hello " + etName.text
        }
    }
}
