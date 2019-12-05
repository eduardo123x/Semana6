package com.example.semana6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.semana6.models.Users;

public class AuthActivity extends AppCompatActivity {
    Button btnLogin;
    EditText txtUser;
    EditText txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        btnLogin=findViewById(R.id.btnLogin);
        txtUser=findViewById(R.id.txtUser);
        txtPassword=findViewById(R.id.txtPassword);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if (  Users.passwodIsValid(txtUser.getText().toString() , txtPassword.getText().toString())){

                    Intent s = new Intent(AuthActivity.this, Reportes1.class);
                    startActivity(s);

                }

            }
        });
    }
}

//hola  i am guillbert
//Claro manito que paso manito ehhhhhh!!!!
