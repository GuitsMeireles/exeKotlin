package com.example.exekotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exekotlin.databinding.ActivityExerciseTenBinding

class ExerciseTenActivity : AppCompatActivity() {

    private val convidados = mutableListOf<String>()
    private lateinit var binding: ActivityExerciseTenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseTenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            finish()
        }

        val resultTextView = binding.resultTextView
        val addButton = binding.addBtn
        val nameEditText = binding.nameEditText
        val showButton = binding.showBtn

        addButton.setOnClickListener {
            val nome = nameEditText.text.toString().trim()
            if (nome.isNotEmpty()) {
                convidados.add(nome)
                nameEditText.text.clear()
            }
        }

        showButton.setOnClickListener {
            val nomeMaisLongo = encontrarNomeMaisLongo()
            if (nomeMaisLongo.isNotEmpty()) {
                resultTextView.text = "Nome mais longo: $nomeMaisLongo"
            } else {
                resultTextView.text = "Lista de convidados está vazia"
            }
        }
    }

    private fun encontrarNomeMaisLongo(): String {
        var nomeMaisLongo = ""
        for (nome in convidados) {
            if (nome.length > nomeMaisLongo.length) {
                nomeMaisLongo = nome
            }
        }
        return nomeMaisLongo
    }
}
