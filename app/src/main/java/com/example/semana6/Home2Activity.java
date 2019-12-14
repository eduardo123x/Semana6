package com.example.semana6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Home2Activity extends AppCompatActivity {

    Button btnReportes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        btnReportes=findViewById(R.id.btnReportes);

        btnReportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s = new Intent(Home2Activity.this, ReportesActivity.class);
                startActivity(s);

            }
        });


    }





}
