package com.example.aluno.cadastro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnConfirmar: Button = findViewById<Button>(R.id.btnConfirmar)
        val btnLimpar: Button = findViewById<Button>(R.id.btnLimpar)

        btnLimpar.setOnClickListener {
            val nomeText: EditText = findViewById<EditText>(R.id.nome)
            val emailText: EditText = findViewById<EditText>(R.id.email)
            val loginText: EditText = findViewById<EditText>(R.id.login)
            val senhaText: EditText = findViewById<EditText>(R.id.senha)



        }
    }
}
