package com.example.timeconverter.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.timeconverter.R;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ResultActivity extends AppCompatActivity {

    private TextView tvSecondes, tvTemps;
    private Button btnReturn;
    private String temps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        init();

        Intent intent = getIntent();
        tvSecondes.setText("Nombre de secondes : \n "+intent.getStringExtra("secondes"));
        tvTemps.setText(intent.getStringExtra("temps"));
        temps= intent.getStringExtra("temps");

        btnReturn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                // à implémenter
                Intent intent = new Intent();
                if(temps != null){
                    setResult(RESULT_OK, intent);
                }
                else{
                    setResult(RESULT_CANCELED,intent);
                }
                finish();
            }
        });
    }

    private void init()
    {
        tvTemps = (TextView) findViewById(R.id.tvTemps);
        tvSecondes = (TextView) findViewById(R.id.tvSecondes);
        btnReturn = (Button) findViewById(R.id.btnReturn);
    }
}