package com.example.aluno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;
import org.jetbrains.anko.

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button enviarBtn = findViewById(R.id.enviarBtn);
        TextView userTxt = findViewById(R.id.userTxt);
        TextView passTxt = findViewById(R.id.passTxt);
        final EditText userEditText = findViewById(R.id.userEditText);
        final EditText passEditText = findViewById(R.id.passEditText);

        userTxt.setX(70);
        userTxt.setY(70);

        userEditText.setX(150);
        userEditText.setY(40);

        passTxt.setX(80);
        passTxt.setY(110);

        passEditText.setX(150);
        passEditText.setY(85);

        enviarBtn.setX(150);
        enviarBtn.setY(180);

        enviarBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean loginBoolValue =
                        AppStaticServices.login(userEditText.getText().toString(), passEditText.getText().toString());

                if(loginBoolValue)
                    toast("Bem-vindo administrador.");

                else
                    toast("usuário/senha incorretos.");
            }
        });
    }
}
