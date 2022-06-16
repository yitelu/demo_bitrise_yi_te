package com.yitelu.demo_bitrise_yi_te

/*
* Author: Yi Te Lu
* Purpose: for demo purpose only
* Contact email: yitelu@gmail.com
* LinkedIn profile: https://www.linkedin.com/in/yi-te-lu-28370828/
* */

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yitelu.demo_bitrise_yi_te.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            val userName = binding.etPersonName.text.toString()
            intent.putExtra("name", userName)
            startActivity(intent)
            //throw RuntimeException("Test Crash") // Force a crash
        }

    }
}