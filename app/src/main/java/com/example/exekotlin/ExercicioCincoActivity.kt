package com.example.exekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exekotlin.databinding.ActivityExercicioCincoBinding

class ExercicioCincoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExercicioCincoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicioCincoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btVol.setOnClickListener {
            finish()
        }

        binding.btConv.setOnClickListener {
            val polegadas = binding.etPolegadas.text.toString().toDouble()
            val centimetros = polegadas * 2.54

            binding.tvResult.text = "$centimetros cm"
        }

    }
}