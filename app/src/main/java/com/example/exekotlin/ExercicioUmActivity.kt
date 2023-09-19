package com.example.exekotlin

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.exekotlin.databinding.ActivityExercicioUmBinding

class ExercicioUmActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExercicioUmBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicioUmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btVoltar.setOnClickListener {
            finish()
        }

        binding.calculaButton.setOnClickListener {
            val numero1 = binding.numero1.text.toString().toInt()
            val numero2 = binding.numero2.text.toString().toInt()

            val soma = numero1 + numero2
            val subtracao = numero1 - numero2
            val multiplicacao = numero1 * numero2
            val divisao = if (numero2 != 0) {
                numero1.toDouble() / numero2.toDouble()
            } else {
                0.0 // Evita dividir por zero
            }

            binding.somaTextView.text = "Soma: $soma"
            binding.subtracaoTextView.text = "Subtração: $subtracao"
            binding.multiplicacaoTextView.text = "Multiplicação: $multiplicacao"
            binding.divisaoTextView.text = "Divisão: $divisao"
        }

        fun onOptionsItemSelected(item: MenuItem): Boolean {
            when (item.itemId) {
                android.R.id.home -> {
                    finish()
                    return true
                }
            }
            return super.onOptionsItemSelected(item)

        }
    }
}
