package com.example.tugas_multiwindow_yeremia;

import androidx.appcompat.app.AlertDialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;

import android.widget.Toast;

public class login extends AppCompatActivity {

//    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//       username = (EditText) findViewById(R.id.username);
//       password = (EditText) findViewById(R.id.password);
        btnLogin = (Button)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                String usernameKey = username.getText().toString();
//                String passwordKey = password.getText().toString();
//                Toast.makeText(getApplicationContext(), "LOGIN SUKSES", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(login.this, profile.class));
//                Intent intent = new Intent(login.this, Welcome.class);
//                if (usernameKey.equals("admin") && passwordKey.equals("123")){
//                    //jika login berhasil
//                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
//                            Toast.LENGTH_SHORT).show();
//                    Intent intent = new Intent(login.this, Welcome.class);
//                    login.this.startActivity(intent);
//                    finish();
//                }else {
//                    //jika login gagal
//                    AlertDialog.Builder builder = new AlertDialog.Builder(login.this);
//                    builder.setMessage("Username atau Password Anda salah!")
//                            .setNegativeButton("Retry", null).create().show();
//                }
            }

        });

    }
}