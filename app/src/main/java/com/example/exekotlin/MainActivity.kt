package com.example.exekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btExe1.setOnClickListener{
            val i = Intent(this, ExercicioUmActivity::class.java)
            startActivity(i)
        }

        binding.btExe2.setOnClickListener{
            val i = Intent(this, ExercicioDoisActivity::class.java)
            startActivity(i)
        }

        binding.btExe3.setOnClickListener{
            val i = Intent(this, ExercicioTresActivity::class.java)
            startActivity(i)
        }

        binding.btExe4.setOnClickListener{
            val i = Intent(this, ExercicioQuatroActivity::class.java)
            startActivity(i)
        }

        binding.btExe5.setOnClickListener{
            val i = Intent(this, ExercicioCincoActivity::class.java)
            startActivity(i)
        }

        binding.btExe6.setOnClickListener{
            val i = Intent(this, ExercicioSeisActivity::class.java)
            startActivity(i)
        }

        binding.btExe7.setOnClickListener{
            val i = Intent(this, ExercicioSeteActivity::class.java)
            startActivity(i)
        }

        binding.btExe8.setOnClickListener{
            val i = Intent(this, ExercicioOitoActivity::class.java)
            startActivity(i)
        }

        binding.btExe9.setOnClickListener{
            val i = Intent(this, ExercicioNoveActivity::class.java)
            startActivity(i)
        }

        binding.btExe10.setOnClickListener{
            val i = Intent(this, ExerciseTenActivity::class.java)
            startActivity(i)
        }

        binding.btExe11.setOnClickListener{
            val i = Intent(this, ExerciseElevenActivity::class.java)
            startActivity(i)
        }

        binding.btExe12.setOnClickListener{
            val i = Intent(this, ExerciseTwelveActivity::class.java)
            startActivity(i)
        }

        binding.btExe13.setOnClickListener{
            val i = Intent(this, ExerciseThirteenActivity::class.java)
            startActivity(i)
        }

    }
}