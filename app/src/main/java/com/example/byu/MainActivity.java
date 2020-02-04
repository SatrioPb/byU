package com.example.byu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView masuk;
    TextView login;
    TextView dft;
    ImageView img;
    Button fb;
    Button google;
    Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        masuk = findViewById(R.id.masuk);
        login = findViewById(R.id.login);
        dft = findViewById(R.id.dft);
        img = findViewById(R.id.img);
        fb = findViewById(R.id.fb);
        google = findViewById(R.id.gogle);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Toast.makeText(MainActivity.this, "login menggunakan fb", Toast.LENGTH_SHORT).show();


                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "login gagal", Toast.LENGTH_SHORT).show();


                }

            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Toast.makeText(MainActivity.this, "login menggunakan google", Toast.LENGTH_SHORT).show();


                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "login gagal", Toast.LENGTH_SHORT).show();


                }
            }
        });




    }
}
