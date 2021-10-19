package com.example.pazzel;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Page2 extends AppCompatActivity {
    Button b;
TextView tx;
AlertDialog.Builder a,aa;
EditText fly;
EditText run;
EditText eat;
EditText apple;
EditText meat;
EditText fish ;
EditText drink;
EditText play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
         a =new AlertDialog.Builder(getApplicationContext());
         a.setTitle("مرحبا مره اخري");
         a.setMessage("يجب عليك الاجابه علي جميع الاسئله بشكل صحيح  \n ثم تطغط علي الزر  ");
         a.setCancelable(false);
        a.setPositiveButton(" هيابنا ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }


        });
        a.show();
        //**************************************************************************************
        fly=findViewById(R.id.fly);
        run=findViewById(R.id.run);
        eat=findViewById(R.id.eat);
        apple=findViewById(R.id.apple);
        meat=findViewById(R.id.meat);
        fish=findViewById(R.id.fish);
        drink=findViewById(R.id.drink);
        play=findViewById(R.id.play);


//***************************************************************************************
        b=findViewById(R.id.b);
//****************************************************************************
        Bundle a=getIntent().getExtras();
       String s= a.getString("name");
       tx=findViewById(R.id.tx1);
       tx.setText(" رائع لقد وصلت للمرحله الثانيه انت رائع "+s);
//***************************************************************************
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String f=String.valueOf(fly.getText()) ;
              String r=String.valueOf(run.getText());
              String e=String.valueOf( eat.getText()) ;
              String a=String.valueOf( apple.getText()) ;
              String m=String.valueOf(meat.getText());
              String fi=String.valueOf(fish.getText());
             String d=String.valueOf(drink.getText());
            String p=String.valueOf( play.getText());
                if(f.equalsIgnoreCase("fly")
                        &&r.equalsIgnoreCase("run")&&
                        e.equalsIgnoreCase("eat")&&
                        a.equalsIgnoreCase("apple")
                        &&m.equalsIgnoreCase("meat")&&
                        fi.equalsIgnoreCase("fish")&&
                        d.equalsIgnoreCase("drink")&&
                        p.equalsIgnoreCase("play")){

                        aa = new AlertDialog.Builder(Page2.this);
                        aa.setTitle("Wowo");
                        aa.setMessage(" لقد اجبت علي جميع الاسئله بصحيح رائع  \n   انت رائع لقد انهيت السباق ممتاز  ");
                        aa.setCancelable(false);
                        aa.setPositiveButton(" انت رائع ", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }


                        });
                    Intent fa=new Intent(Page2.this,First.class);
                    startActivity(fa);
                    Toast.makeText(getApplicationContext(),"رائع اكمل التعلم في شئ اخر",Toast.LENGTH_LONG).show();
                    aa.show();


                }else {
                    aa = new AlertDialog.Builder(Page2.this);
                    aa.setTitle("لا تستسلم ");
                    aa.setMessage("حاول مره اخري هناك خطاء ما في الكلمات \nاعد كتابتها بشكل صحيح وحاول مره اخري  ");
                    aa.setCancelable(false);
                    aa.setPositiveButton(" انت رائع ", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }


                    });

                    aa.show();
                }

            }
        });
        //************************************************************************************************
///*****************************************************************************************************
    }
}