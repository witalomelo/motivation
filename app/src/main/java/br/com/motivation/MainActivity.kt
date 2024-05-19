package br.com.motivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.com.motivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding //criação de binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //instanciado e expandindo layout
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root) //atribuindo layout a view

        //Esconder barra de navegação
        supportActionBar?.hide()

        // Eventos
        binding.buttonNewFrase.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_new_frase) {
            var s = ""
        }
    }
}