package com.example.exekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.exekotlin.databinding.ActivityExercicioSeisBinding

class ExercicioSeisActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExercicioSeisBinding

    private val itemList = mutableListOf<String>()


    private val valuesList = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicioSeisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVoltar.setOnClickListener {
            finish()
        }

        val editText = binding.etAdd
        val addButton = binding.btAdd
        val textView = binding.tvLista

        addButton.setOnClickListener {
            // Obtenha o valor do EditText
            val inputValue = editText.text.toString().trim()

            if (inputValue.isNotEmpty()) {
                // Adicione o valor à lista
                textView.add(inputValue)

                // Atualize a TextView com a lista de itens
                updateTextView(textView)

                // Limpe o EditText após adicionar o valor
                editText.text.clear()
            }
        }
    }

    private fun updateTextView(textView: TextView) {
        // Construa uma string com a lista de itens
        val itemsString = itemList.joinToString("\n")

        // Exiba a lista de itens na TextView
        textView.text = itemsString
    }
}

private fun TextView.add(inputValue: String) {
    TODO("Not yet implemented")
}
