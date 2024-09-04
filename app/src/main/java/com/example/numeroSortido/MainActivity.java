package com.example.numeroSortido;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void sortear(View view){
        // Instanciamento dos elementos:
        TextView resultado = findViewById(R.id.textResultado);

        // Logica para trazer um numero sortido:
        int numero = new Random().nextInt(100);

        // Converte numero para String:
        String numResultado = String.valueOf(numero);

        // Mudando o conteudo do textResultado (resultado)
        resultado.setText(numResultado);

    }

    public void limpar(View view){
        // Instanciamento dos elementos:
        TextView resultado = findViewById(R.id.textResultado);

        resultado.setText("----");
    }

}