package com.example.exekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.exekotlin.databinding.ActivityExerciseFourteenBinding
import java.text.DecimalFormat

class ExerciseFourteenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseFourteenBinding
    private lateinit var salarioEditText: EditText
    private lateinit var resultadoTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseFourteenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btBack.setOnClickListener {
            finish()
        }

        salarioEditText = binding.etWage
        resultadoTextView = binding.tvReadjustment

        val calcularButton: Button = binding.btReadjustment
        calcularButton.setOnClickListener(View.OnClickListener {
            calcularReajuste()
        })
    }

    private fun calcularReajuste() {
        val salarioString = salarioEditText.text.toString()
        if (salarioString.isNotEmpty()) {
            val salario = salarioString.toDouble()
            var percentual = 0.0
            var aumento = 0.0

            if (salario <= 280.0) {
                percentual = 20.0
            } else if (salario <= 700.0) {
                percentual = 15.0
            } else if (salario <= 1500.0) {
                percentual = 10.0
            } else {
                percentual = 5.0
            }

            aumento = salario * (percentual / 100)
            val novoSalario = salario + aumento

            val decimalFormat = DecimalFormat("#,##0.00")
            val resultado = """
                Salário antes do reajuste: R$ ${decimalFormat.format(salario)}
                Percentual de aumento aplicado: $percentual%
                Valor do aumento: R$ ${decimalFormat.format(aumento)}
                Novo salário após o aumento: R$ ${decimalFormat.format(novoSalario)}
            """.trimIndent()

            resultadoTextView.text = resultado
        } else {
            resultadoTextView.text = "Por favor, insira um valor válido para o salário."
        }
    }
}
