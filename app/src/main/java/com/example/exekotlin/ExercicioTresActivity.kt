package com.example.exekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exekotlin.databinding.ActivityExercicioTresBinding

class ExercicioTresActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExercicioTresBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicioTresBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btVoltar2.setOnClickListener {
            finish()
        }

        binding.btConverter.setOnClickListener {
            val celsius = binding.etValor.text.toString().toDouble()
            val fahrenheit = celsius * 1.8 + 32

            binding.tvResultado.text = "$fahrenheit °F"
        }

    }
}