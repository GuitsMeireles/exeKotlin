package com.example.exekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.exekotlin.databinding.ActivityExercicioSeisBinding

class ExercicioSeisActivity : AppCompatActivity() {

    private lateinit var editTextFruta: EditText
    private lateinit var buttonAdicionar: Button
    private lateinit var textViewLista: TextView

    private val carrinhoDeCompras = mutableListOf<String>()

    private lateinit var binding: ActivityExercicioSeisBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicioSeisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btVolt.setOnClickListener {
            finish()
        }

        editTextFruta = binding.editTextFruta
        buttonAdicionar = binding.buttonAdicionar
        textViewLista = binding.textViewLista

        buttonAdicionar.setOnClickListener {
            val fruta = editTextFruta.text.toString()
            if (fruta.isNotBlank()) {
                carrinhoDeCompras.add(fruta)
                editTextFruta.text.clear()
                atualizarLista()
            }
        }
    }

    private fun atualizarLista() {
        val listaFrutas = carrinhoDeCompras.joinToString("\n")
        textViewLista.text = listaFrutas
    }
}
