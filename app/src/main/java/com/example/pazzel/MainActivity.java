package com.example.pazzel;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder alert;
    TextView textView;
    final int Re = 100;
    Button button;
    EditText Ed;

    @Override
    protected void onStart() {
        super.onStart();
        alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("مرحبا بكم في برنامجنا");
        alert.setMessage("هذا البرنامج مخصص للفئه العمريه \n  حتي 13 عام ");
        alert.setCancelable(false);
        alert.setPositiveButton(" هيانبدا", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }


        });
        AlertDialog a=alert.create();
        a.show();
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        Ed = findViewById(R.id.Ed);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = Ed.getText().toString();
                if (s.isEmpty()) {
                    Toast.makeText(MainActivity.this, "برجاء كتابه اسمك", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, First.class);
                    intent.putExtra("name", s);
                   startActivity(intent);
                   Toast.makeText(getApplicationContext(),"مرحبا بك "+s+"",Toast.LENGTH_LONG).show();
                }
            }
        });


    }

}