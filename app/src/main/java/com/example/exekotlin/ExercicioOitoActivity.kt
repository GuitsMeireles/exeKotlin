package com.example.exekotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.exekotlin.databinding.ActivityExercicioOitoBinding

class ExercicioOitoActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var button: Button
    private lateinit var textView: TextView
    private lateinit var binding: ActivityExercicioOitoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicioOitoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVoltar.setOnClickListener {
            finish()
        }

        editText = binding.editText
        button = binding.button
        textView = binding.textView

        button.setOnClickListener {
            processarNumeros()
        }
    }

    private fun processarNumeros() {
        val numerosStr = editText.text.toString().trim()
        val numeros = numerosStr.split(" ").mapNotNull { it.trim().toIntOrNull() }

        val impares = mutableListOf<Int>()
        val pares = mutableListOf<Int>()

        for (numero in numeros) {
            if (numero % 2 == 0) {
                pares.add(numero)
            } else {
                impares.add(numero)
            }
        }

        val resultado = "Ímpares: ${impares.joinToString(", ")}\n\nPares: ${pares.joinToString(", ")}"
        textView.text = resultado
    }
}
