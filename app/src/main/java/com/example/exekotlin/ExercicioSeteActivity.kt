package com.example.exekotlin

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.exekotlin.databinding.ActivityExercicioSeteBinding

class ExercicioSeteActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var textView: TextView
    private lateinit var binding: ActivityExercicioSeteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicioSeteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btVoltar3.setOnClickListener {
            finish()
        }

        editText = binding.editText
        textView = binding.textView
    }

    fun inverterPalavra(view: View) {
        val palavra = editText.text.toString()
        val palavraReversa = inverterString(palavra)
        textView.text = palavraReversa
    }

    private fun inverterString(s: String): String {
        val charArray = s.toCharArray()
        charArray.reverse()
        return String(charArray)
    }
}
