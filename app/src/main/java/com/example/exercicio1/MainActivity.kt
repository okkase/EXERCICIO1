package com.example.exercicio1

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewbinding.ViewBinding
import com.example.exercicio1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    val itens = listOf("masculino", "feminino")


        val adapter = ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,itens)
        binding.spinnerSexo.adapter = adapter

        binding.buttonCalc.setOnClickListener{
            val sexoSelecionado = binding.spinnerSexo.selectedItem as String
            val idade = binding.editTextIdade.text.toString().toLongOrNull()
            var resultado: Long
            if (idade!= null) {

                if (idade <65 && sexoSelecionado.trim() == "masculino" ) {
                    resultado = 65 - idade
                    binding.textResultado.text = "Você ainda precisa trabalhar $resultado Anos!!"

                } else if(idade <62){
                    resultado = 62 - idade
                    binding.textResultado.text = "Você ainda precisa trabalhar $resultado Anos!!"
                }



            }

        }
        }
    }
