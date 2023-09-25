package com.example.exekotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.exekotlin.databinding.ActivityExerciseElevenBinding

class ExerciseElevenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseElevenBinding
    private lateinit var editText: EditText
    private lateinit var textView: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseElevenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack2.setOnClickListener {
            finish()
        }

        editText = binding.etWord
        textView = binding.tvResult
        button = binding.btnConverter
    }

    fun onConvertClick(view: View) {
        val inputText = editText.text.toString()
        val convertedText = convertToUpperCaseOddChars(inputText)
        textView.text = convertedText
    }

    private fun convertToUpperCaseOddChars(input: String): String {
        val builder = StringBuilder()
        for (i in input.indices) {
            val char = input[i]
            if (i % 2 == 0) {
                // Caracteres pares (índices ímpares) permanecem em minúsculas
                builder.append(char.toLowerCase())
            } else {
                // Caracteres ímpares (índices pares) são convertidos para maiúsculas
                builder.append(char.toUpperCase())
            }
        }
        return builder.toString()
    }
}
