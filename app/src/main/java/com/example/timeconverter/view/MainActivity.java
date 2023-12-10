package com.example.timeconverter.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.timeconverter.R;
import com.example.timeconverter.controller.Controller;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final int REQUEST_CODE = 1;
    private EditText etSecondes;
    private Button btnConvertir;
    private Controller controller= Controller.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btnConvertir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                long secondes=0;
                boolean verif = false;

                // à compléter
                if(etSecondes.getText().toString().isEmpty() || Long.parseLong(etSecondes.getText().toString())<=0){
                    Toast.makeText(MainActivity.this, "Veuillez vérifier votre saisie ! ", Toast.LENGTH_SHORT).show();
                }
                else{
                    verif = true;
                }
                if(verif) {

                    secondes = Long.parseLong(etSecondes.getText().toString());
                    controller.createTimeConvertion(secondes);

                   // à compléter

                    Intent  intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("temps",controller.getTemps());
                    intent.putExtra("secondes",String.valueOf(secondes));
                    startActivityForResult(intent, REQUEST_CODE);

                }
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
            // à implémenter
            if(requestCode == REQUEST_CODE){
                if(resultCode == RESULT_OK){
                    Toast.makeText(this, "Temps converti", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(this, "Temps non converti", Toast.LENGTH_SHORT).show();
                }
            }
    }

    private void init()
    {
        // à compléter
        btnConvertir = (Button) findViewById(R.id.btnConvertir);
        etSecondes = (EditText) findViewById(R.id.etSecondes);
    }
}