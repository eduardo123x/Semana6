package com.example.semana6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReportesActivity extends AppCompatActivity {

Button btnVentas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);
        btnVentas=findViewById(R.id.btnVentas);

        btnVentas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s = new Intent(ReportesActivity.this, VentasActivity.class);
                startActivity(s);

            }
        });
    }
}
