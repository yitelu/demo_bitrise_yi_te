package com.yitelu.demo_bitrise_yi_te

/*
* Author: Yi Te Lu
* Purpose: for demo purpose only
* Contact email: yitelu@gmail.com
* LinkedIn profile: https://www.linkedin.com/in/yi-te-lu-28370828/
* */


import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.yitelu.demo_bitrise_yi_te.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        val name = intent.getStringExtra("name")
        if (name != null){
            binding.tvTitleText.text = "hello $name"
        }

    }
}