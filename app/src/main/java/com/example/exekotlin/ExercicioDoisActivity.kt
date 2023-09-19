package com.example.exekotlin

import android.os.Bundle
import android.view.MenuItem
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.exekotlin.databinding.ActivityExercicioDoisBinding

class ExercicioDoisActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExercicioDoisBinding
    private lateinit var editText: EditText
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercicioDoisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btSair.setOnClickListener {
            finish()
        }

        editText = binding.editText
        textView = binding.textView

        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val inputText = editText.text.toString()
                if (inputText.isNotEmpty()) {
                    val numero = inputText.toInt()
                    if (numero in 1..10) {
                        calcularTabuada(numero)
                    } else {
                        textView.text = "Digite um número entre 1 e 10."
                    }
                } else {
                    textView.text = ""
                }
            }
        })
    }

    private fun calcularTabuada(numero: Int) {
        val builder = StringBuilder()
        for (i in 1..10) {
            val resultado = numero * i
            builder.append("$numero x $i = $resultado\n")
        }
        textView.text = builder.toString()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)

    }
}