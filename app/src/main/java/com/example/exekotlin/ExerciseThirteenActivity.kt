package com.example.exekotlin

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.exekotlin.databinding.ActivityExerciseThirteenBinding

class ExerciseThirteenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExerciseThirteenBinding
    private lateinit var editTextName: EditText
    private lateinit var editTextHeight: EditText
    private lateinit var editTextWeight: EditText
    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseThirteenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack4.setOnClickListener {
            finish()
        }

        editTextName = binding.etName
        editTextHeight = binding.etHeight
        editTextWeight = binding.etWeight
        textViewResult = binding.tvResult
    }

    fun onCalculateIMCClick(view: View) {
        val name = editTextName.text.toString()
        val heightText = editTextHeight.text.toString()
        val weightText = editTextWeight.text.toString()

        if (name.isNotEmpty() && heightText.isNotEmpty() && weightText.isNotEmpty()) {
            val height = heightText.toDouble()
            val weight = weightText.toDouble()
            val bmi = calculateBMI(height, weight)
            val result = "Nome: $name, IMC: ${"%.2f".format(bmi)}"

            textViewResult.append("$result\n")

            // Verifica se o IMC está fora do ideal
            if (bmi < 18.5 || bmi > 25) {
                textViewResult.append("Fora do peso ideal!\n")
            }

            // Limpa os campos
            editTextName.text.clear()
            editTextHeight.text.clear()
            editTextWeight.text.clear()
        }
    }

    private fun calculateBMI(height: Double, weight: Double): Double {
        return weight / (height * height)
    }
}
