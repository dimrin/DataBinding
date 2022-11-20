package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            displayGreeting()
        }
    }

    private fun displayGreeting(){
        binding.apply {
            textView.text = "Hello! ${editTextTextPersonName.text}"
        }

    }
}