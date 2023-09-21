package com.example.exekotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.exekotlin.databinding.ActivityExercicioNoveBinding
class ExercicioNoveActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExercicioNoveBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityExercicioNoveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var textView = binding.txtResultado


        binding.btnReturn.setOnClickListener {
            finish()
        }

        binding.btnCalculo.setOnClickListener {

            val numero1 = binding.etNumero1.text.toString().toDouble()
            val numero2 = binding.etNumero2.text.toString().toDouble()
            val numero3 = binding.etNumero3.text.toString().toDouble()
            val numero4 = binding.etNumero4.text.toString().toDouble()
            val numero5 = binding.etNumero5.text.toString().toDouble()

            // maior numero
            val maiorNumero = maxOf(numero1, numero2, numero3, numero4, numero5)

            // menor número
            val menorNumero = minOf(numero1, numero2, numero3, numero4, numero5)

            // Calcular a média dos números
            val media = (numero1 + numero2 + numero3 + numero4 + numero5) / 5.0

            textView.text = "Maior número: $maiorNumero\nMenor número: $menorNumero\nMédia: $media"
        }
    }
}
