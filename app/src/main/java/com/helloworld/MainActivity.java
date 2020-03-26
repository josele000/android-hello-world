package com.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etHello = findViewById(R.id.etHello);
        Button btHello = findViewById(R.id.btHello);

        btHello.setOnClickListener(new View.OnClickListener() {  //ctrl+space aqui estamos asignando un evento al boton cuando clickeamos
            @Override
            public void onClick(View v) { //el evento que ocurrirá se programara desde aqui
                String TextoInsertado = etHello.getText().toString(); //con gettext obtenemos el valor que se ingresa y luego lo convertimos a string
                if (TextoInsertado.isEmpty()) {
                    return;
                }
                Intent intent =  new Intent(MainActivity.this, HelloActivity.class);
                intent.putExtra("msgHello", TextoInsertado);
                startActivity(intent);

            }
        });

    }
}
