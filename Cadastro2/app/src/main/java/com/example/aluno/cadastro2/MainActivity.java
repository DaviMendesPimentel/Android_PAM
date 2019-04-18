package com.example.aluno.cadastro2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList lista = new ArrayList<String>();

        lista.add("Primeira Linha..");
        lista.add("Segunda Linha..");
        lista.add("Terceira Linha..");
        lista.add("Quarta Linha..");

        ListView lv = (ListView) findViewById(R.id.listview);

        lv.setAdapter(
                new ArrayAdapter<String>
                (this,
                 android.R.layout.simple_list_item_1,
                 lista)
        );
    }
}
