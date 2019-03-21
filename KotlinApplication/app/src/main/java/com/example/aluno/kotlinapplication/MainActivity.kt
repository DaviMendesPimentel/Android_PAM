package com.example.aluno.kotlinapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enviarBtn: Button = findViewById<Button>(R.id.enviarBtn)
        val userEditText: EditText = findViewById<EditText>(R.id.userEditText)
        val passEditText: EditText = findViewById<EditText>(R.id.passEditText)

        userEditText.y = 0f

        passEditText.y = 60f

        enviarBtn.y = 120f

        enviarBtn.setOnClickListener{
            val loginBoolValue: Boolean =
                    AppStaticServices.login(userEditText.getText().toString(), passEditText.getText().toString())

            if(loginBoolValue)
                toast("Bem-vindo administrador.")

            else
                toast("usuário/senha incorretos.")
        }
    }
}
