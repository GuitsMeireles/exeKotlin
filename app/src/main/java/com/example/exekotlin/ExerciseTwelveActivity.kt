package com.example.exekotlin

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.exekotlin.databinding.ActivityExerciseTwelveBinding

class ExerciseTwelveActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseTwelveBinding

    private lateinit var editTextName: EditText
    private lateinit var editTextAge: EditText
    private lateinit var textViewResult: TextView

    private val people = mutableListOf<Pair<String, Int>>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseTwelveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            finish()
        }

        binding.btnAddPeople.setOnClickListener {
            val name = editTextName.text.toString()
            val ageText = editTextAge.text.toString()

            if (name.isNotEmpty() && ageText.isNotEmpty()) {
                val age = ageText.toInt()
                people.add(Pair(name, age))
                editTextName.text.clear()
                editTextAge.text.clear()

                if (people.size == 5) {
                    displayResult()
                }

                editTextName = binding.etName
                editTextAge = binding.etAge
                textViewResult = binding.tvResult
            }
        }
    }

    private fun displayResult() {
        val youngest = people.minByOrNull { it.second }
        val oldest = people.maxByOrNull { it.second }
        val totalAge = people.sumBy { it.second }
        val averageAge = totalAge.toDouble() / people.size

        val result =
            "Mais novo: ${youngest?.first}, Mais velho: ${oldest?.first}, Média de idade: ${
                "%.2f".format(averageAge)
            }"
        textViewResult.text = result
    }
}
