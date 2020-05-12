package com.saugatjonchhen.kotlin.example.db.db_obj_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.saugatjonchhen.kotlin.example.R
import com.saugatjonchhen.kotlin.example.databinding.ActivityDBObjectExampleBinding

class DBObjectExampleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDBObjectExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_d_b_object_example)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_d_b_object_example)

        binding.student = getStudent()

//        val student: Student = getStudent()
//
//        binding.textName.text = student.name
//        binding.textEmail.text = student.email

    }

    private fun getStudent(): Student {
        return Student(1, "Saugat Jonchhen", "saugat.john09@gmail.com")
    }

}
