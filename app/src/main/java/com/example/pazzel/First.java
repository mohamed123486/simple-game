package com.example.pazzel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class First extends AppCompatActivity {
    Button En,px;
    TextView tx;
    Button ks,ksn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        //******************************************************************************************
        //******************************************************************************************

        En=findViewById(R.id.En);
        px=findViewById(R.id.px);
        tx=findViewById(R.id.tx1);
        ks=findViewById(R.id.ks);
        ksn=findViewById(R.id.ksn);
        //******************************************************************************************
        //******************************************************************************************
        Bundle a=getIntent().getExtras();
      String aa=String.valueOf(a.getString("name"));
        tx.setText(aa+" "+"مرحبا بك ");
        //********************************************************************************************
        //********************************************************************************************
        En.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(First.this,Pageone.class);
                a.putExtra("name",aa);
                startActivity(a);

            }
        });
        //****************************************************************************************
        //****************************************************************************************
        px.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(First.this,px.class);
                startActivity(a);

            }
        });
        //**************************************************************************************
        //**************************************************************************************


ks.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
Intent n=new Intent(First.this,ks.class);
startActivity(n);
    }
});
//**********************************************************************************************
        //**************************************************************************************

        ksn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(First.this,ksn.class);
                startActivity(n);
            }
        });
    }
}