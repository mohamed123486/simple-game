package com.example.pazzel;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ss extends AppCompatActivity {
EditText tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10;
Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
LinearLayout ll1,ll2,ll3,ll4,ll5,ll6,ll7,ll8,ll9,ll10;
AlertDialog.Builder al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss);
        //*************************************************************************************
        tx1=findViewById(R.id.tx1);
        tx2=findViewById(R.id.tx2);
        tx3=findViewById(R.id.tx3);
        tx4=findViewById(R.id.tx4);
        tx5=findViewById(R.id.tx5);
        tx6=findViewById(R.id.tx6);
        tx7=findViewById(R.id.tx7);
        tx8=findViewById(R.id.tx8);
        tx9=findViewById(R.id.tx9);
        tx10=findViewById(R.id.tx10);
        //**************************************************************************************
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        button10=findViewById(R.id.button10);
        //*************************************************************************************
        ll1=findViewById(R.id.ll1);
        ll2=findViewById(R.id.ll2);
        ll3=findViewById(R.id.ll3);
        ll4=findViewById(R.id.ll4);
        ll5=findViewById(R.id.ll5);
        ll6=findViewById(R.id.ll6);
        ll7=findViewById(R.id.ll7);
        ll8=findViewById(R.id.ll8);
        ll9=findViewById(R.id.ll9);
        ll10=findViewById(R.id.ll10);
        //***************************************************************************************
       // int s1=Integer.parseInt(tx1.getText().toString());
        /*
        int s2=Integer.parseInt(tx2.getText().toString());
        int s3=Integer.parseInt(tx3.getText().toString());
        int s4=Integer.parseInt(tx4.getText().toString());
        int s5=Integer.parseInt(tx5.getText().toString());
        int s6=Integer.parseInt(tx6.getText().toString());
        int s7=Integer.parseInt(tx7.getText().toString());
        int s8=Integer.parseInt(tx8.getText().toString());
        int s9=Integer.parseInt(tx9.getText().toString());
        int s10=Integer.parseInt(tx10.getText().toString());

         */
        //***************************************************************************************
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                    if (Integer.parseInt(tx1.getText().toString()) == 10) {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("احسن اجابه صحيحه رائع اكمل الباقي هيا");
                        al.setCancelable(true);
                        al.setPositiveButton("رائع", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        al.show();
                        ll1.setVisibility(View.INVISIBLE);

                    } else {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("حاول مره اخري");
                        al.setCancelable(true);
                        al.setPositiveButton("خطاء", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        al.show();
                    }
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"خطاء حاول مره اخري",Toast.LENGTH_LONG).show();
                }
            }



        });
        //*******************************************************************************************************


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                    if (Integer.parseInt(tx2.getText().toString()) == 40) {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("احسن اجابه صحيحه رائع اكمل الباقي هيا");
                        al.setCancelable(true);
                        al.setPositiveButton("رائع", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        al.show();
                        ll2.setVisibility(View.INVISIBLE);

                    } else {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("حاول مره اخري");
                        al.setCancelable(true);
                        al.setPositiveButton("خطاء", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        al.show();
                    }
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"خطاء حاول مره اخري",Toast.LENGTH_LONG).show();
                }
            }
        });
        //**************************************************************************************

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                    if (Integer.parseInt(tx3.getText().toString()) == 63) {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("احسن اجابه صحيحه رائع اكمل الباقي هيا");
                        al.setCancelable(true);
                        al.setPositiveButton("رائع", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        al.show();
                        ll3.setVisibility(View.INVISIBLE);

                    } else {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("حاول مره اخري");
                        al.setCancelable(true);
                        al.setPositiveButton("خطاء", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        al.show();
                    }
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"خطاء حاول مره اخري",Toast.LENGTH_LONG).show();
                }
            }
        });
        //****************************************************************************************************
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                    if (Integer.parseInt(tx4.getText().toString()) == 24) {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("احسن اجابه صحيحه رائع اكمل الباقي هيا");
                        al.setCancelable(true);
                        al.setPositiveButton("رائع", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        al.show();
                        ll4.setVisibility(View.INVISIBLE);

                    } else {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("حاول مره اخري");
                        al.setCancelable(true);
                        al.setPositiveButton("خطاء", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        al.show();
                    }
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"خطاء حاول مره اخري",Toast.LENGTH_LONG).show();
                }
            }
        });
        //*********************************************************************************************

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                    if (Integer.parseInt(tx5.getText().toString()) == 35) {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("احسن اجابه صحيحه رائع اكمل الباقي هيا");
                        al.setCancelable(true);
                        al.setPositiveButton("رائع", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        al.show();
                        ll5.setVisibility(View.INVISIBLE);

                    } else {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("حاول مره اخري");
                        al.setCancelable(true);
                        al.setPositiveButton("خطاء", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        al.show();
                    }
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"خطاء حاول مره اخري",Toast.LENGTH_LONG).show();
                }
            }
        });
        //*******************************************************************************************

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                    if (Integer.parseInt(tx6.getText().toString()) == 30) {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("احسن اجابه صحيحه رائع اكمل الباقي هيا");
                        al.setCancelable(true);
                        al.setPositiveButton("رائع", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        al.show();
                        ll6.setVisibility(View.INVISIBLE);

                    } else {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("حاول مره اخري");
                        al.setCancelable(true);
                        al.setPositiveButton("خطاء", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        al.show();
                    }
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"خطاء حاول مره اخري",Toast.LENGTH_LONG).show();
                }
            }
        });
        //********************************************************************************************


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                    if (Integer.parseInt(tx7.getText().toString()) == 48) {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("احسن اجابه صحيحه رائع اكمل الباقي هيا");
                        al.setCancelable(true);
                        al.setPositiveButton("رائع", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        ll7.setVisibility(View.INVISIBLE);
                        al.show();
                    } else {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("حاول مره اخري");
                        al.setCancelable(true);
                        al.setPositiveButton("خطاء", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        al.show();
                    }
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"خطاء حاول مره اخري",Toast.LENGTH_LONG).show();
                }
            }
        });
        //******************************************************************************************


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    if (Integer.parseInt(tx8.getText().toString()) == 27) {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("احسن اجابه صحيحه رائع اكمل الباقي هيا");
                        al.setCancelable(true);
                        al.setPositiveButton("رائع", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        ll8.setVisibility(View.INVISIBLE);
                        al.show();
                    } else {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("حاول مره اخري");
                        al.setCancelable(true);
                        al.setPositiveButton("خطاء", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        al.show();
                    }
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"خطاء حاول مره اخري",Toast.LENGTH_LONG).show();
                }
            }
        });
        //********************************************************************************************
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                    if (Integer.parseInt(tx9.getText().toString()) == 120) {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("احسنت اجابه صحيحه");
                        al.setCancelable(true);
                        al.setPositiveButton("رائع", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        ll9.setVisibility(View.INVISIBLE);
                        al.show();
                    } else {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("حاول مره اخري");
                        al.setCancelable(true);
                        al.setPositiveButton("خطاء", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        al.show();
                    }
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"خطاء حاول مره اخري",Toast.LENGTH_LONG).show();
                }
            }
        });

        //***********************************************************************************************

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                    if (Integer.parseInt(tx10.getText().toString()) == 121) {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("اجابه صحيحه احسنت");
                        al.setCancelable(true);
                        al.setPositiveButton("رائع", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        ll10.setVisibility(View.INVISIBLE);
                        al.show();
                    } else {
                        al = new AlertDialog.Builder(ss.this);
                        al.setMessage("حاول مره اخري لا تستسلم ");
                        al.setCancelable(true);
                        al.setPositiveButton("خطاء", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        al.show();
                    }
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"خطاء حاول مره اخري",Toast.LENGTH_LONG).show();
                }
            }
        });

//*************************************************************************************************
        //********************************************************
        // ******************************************************************************************
    }
}