package com.example.aluno.kotlinapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;
import org.jetbrains.anko.toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enviarBtn: Button = findViewById<Button>(R.id.enviarBtn);
        val userTxt: TextView = findViewById<TextView>(R.id.userTxt);
        val passTxt: TextView = findViewById<TextView>(R.id.passTxt);
        val userEditText: EditText = findViewById<EditText>(R.id.userEditText);
        val passEditText: EditText = findViewById<EditText>(R.id.passEditText);

        userTxt.x = 70f;
        userTxt.y = 70f;

        userEditText.x = 150f;
        userEditText.y = 40f;

        passTxt.x = 80f;
        passTxt.y = 110f;

        passEditText.x = 150f;
        passEditText.y = 85f;

        enviarBtn.x = 150f;
        enviarBtn.y = 180f;

        enviarBtn.setOnClickListener{
            var loginBoolValue: Boolean =
                    AppStaticServices.login(userEditText.getText().toString(), passEditText.getText().toString());

            if(loginBoolValue)
                toast("Bem-vindo administrador.");

            else
                toast("usuário/senha incorretos.");
        };
    }
}
