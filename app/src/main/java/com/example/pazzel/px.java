package com.example.pazzel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class px extends AppCompatActivity {
Button Q;
Button ss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_px);
        Q=findViewById(R.id.Q);
        ss=findViewById(R.id.ss);
        Q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(px.this,PP1.class);
                startActivity(a);

            }
        });
ss.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
     Intent a=new Intent(px.this,ss.class);
     startActivity(a);
    }
});
    }
}