package com.example.exekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exekotlin.databinding.ActivityExercicioQuatroBinding

class ExercicioQuatroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExercicioQuatroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicioQuatroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btVoltar3.setOnClickListener{
            finish()
        }

        val cotacaoDolarEditText = binding.etValor1
        val valorReaisEditText = binding.etValor2
        val converterButton = binding.btConverter2
        val resultadoTextView = binding.tvResultado2

        converterButton.setOnClickListener {
            val cotacaoDolar = cotacaoDolarEditText.text.toString().toDoubleOrNull()
            val valorReais = valorReaisEditText.text.toString().toDoubleOrNull()

            if (cotacaoDolar != null && valorReais != null) {
                val valorDolar = valorReais / cotacaoDolar
                resultadoTextView.text = "Valor em dólar: \$${String.format("%.2f", valorDolar)}"
            } else {
                resultadoTextView.text = "Por favor, insira valores válidos."
            }


        }
    }
}