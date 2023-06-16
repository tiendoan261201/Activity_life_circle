package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitylifecycle.databinding.ActivityMainBinding
import com.example.activitylifecycle.databinding.ActivityManhinh2Binding

class Manhinh2 : AppCompatActivity() {
    private lateinit var binding:ActivityManhinh2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityManhinh2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}