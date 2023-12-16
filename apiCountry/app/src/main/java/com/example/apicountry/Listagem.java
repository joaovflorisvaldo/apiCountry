package com.example.apicountry;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import adapter.AdapterPais;
import controller.PaisController;
import model.Pais;

public class Listagem extends AppCompatActivity {
    private TextView tvCodigo;
    private TextView tvDescricao;
    private PaisController controller;
    private RecyclerView rvPais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_paises);

        rvPais = findViewById(R.id.rvPais);
        carregarListaAlunos();
    }

    private void carregarListaAlunos(){
        ArrayList<Pais> listaPais = controller.retornar(this);
        AdapterPais adapter = new AdapterPais(this, listaPais);

        rvPais.setLayoutManager(new LinearLayoutManager(this));
        rvPais.setAdapter(adapter);
    }
}