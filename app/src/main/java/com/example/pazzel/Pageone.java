package com.example.pazzel;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Pageone extends AppCompatActivity {
    AlertDialog.Builder alert;
    private RadioGroup radioGroup;
   // ********************************************************************
    private RadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
    //*******************************************************************
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
    Button bb;
    //********************************************************************
    TextView textView4;
    TextView tx1;

//**********************************************************************
    LinearLayout ll1, ll2,ll3,ll4,ll5,ll6,ll7,ll8,ll9,ll10;
//**********************************************************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pageone);
        //*****************************************************
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10= findViewById(R.id.button10);

        bb= findViewById(R.id.bb);
        //**********************************************************************
        radioGroup = findViewById(R.id.rr1);
        textView4 = findViewById(R.id.textView4);
        //اجابه الاسئله
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);
        r5 = findViewById(R.id.r5);
        r6 = findViewById(R.id.r6);
        r7 = findViewById(R.id.r7);
        r8 = findViewById(R.id.r8);
        r9 = findViewById(R.id.r9);
        r10 = findViewById(R.id.r10);
        //**************************************************************************
        ll1 = findViewById(R.id.ll1);
        ll2 = findViewById(R.id.ll2);
        ll3 = findViewById(R.id.ll3);
        ll4 = findViewById(R.id.ll4);
        ll5 = findViewById(R.id.ll5);
        ll6 = findViewById(R.id.ll6);
        ll7 = findViewById(R.id.ll7);
        ll8 = findViewById(R.id.ll8);
        ll9 = findViewById(R.id.ll9);
        ll10 = findViewById(R.id.ll10);

      //  ***********************************************
        tx1 = findViewById(R.id.tx1);
        //*********************************************

        //**************************************************************
        alert = new AlertDialog.Builder(Pageone.this);
        Bundle n = getIntent().getExtras();
        String s = n.getString("name");
        tx1.setText("مرحبا بك "+s+"\n"+"هيا بنا لنجيب علي بعض الاسئله ");
        //***************************************************************


        //****************************************************************************************
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  int checkedId=radioGroup.getCheckedRadioButtonId();
                if (r1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "رائع", Toast.LENGTH_LONG).show();

                    alert.setMessage("احسنت اجابه صحيحه هيا الي االسؤال التالي   ");
                    alert.setCancelable(true);
                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    ll1.setVisibility(View.GONE);
                    ll2.setVisibility(View.VISIBLE);
                    r1.clearComposingText();
                    // textView4.setVisibility(View.VISIBLE);
                } else {
                    alert.setMessage("اجابه خاطئه حاول مره اخري لا تستسلم");
                    alert.setCancelable(true);
                    alert.setPositiveButton("هيا بنا", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                }
                AlertDialog sa = alert.create();
                sa.show();
            }
        });
        //*****************************************************************************************
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (r2.isChecked()) {
                Toast.makeText(getApplicationContext(), "احسنت", Toast.LENGTH_LONG).show();

                alert.setMessage("احسنت اجابه صحيحه هيا الي االسؤال التالي  ");
                alert.setCancelable(true);
                alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                ll2.setVisibility(View.GONE);
                ll3.setVisibility(View.VISIBLE);
                // textView4.setVisibility(View.VISIBLE);
            } else {
                alert.setMessage("اجابه خاطئه حاول مره اخري لا تستسلم");
                alert.setCancelable(true);
                alert.setPositiveButton("هيا بنا", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }

                });
            }
                AlertDialog sa = alert.create();
                sa.show();
            }
            });
        //******************************************************************************************
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "رائع", Toast.LENGTH_LONG).show();

                    alert.setMessage("احسنت اجابه صحيحه هيا الي االسؤال التالي  ");
                    alert.setCancelable(true);
                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    ll3.setVisibility(View.GONE);
                    ll4.setVisibility(View.VISIBLE);
                    // textView4.setVisibility(View.VISIBLE);
                } else {
                    alert.setMessage("اجابه خاطئه حاول مره اخري لا تستسلم");
                    alert.setCancelable(true);
                    alert.setPositiveButton("هيا بنا", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }

                    });
                }
                AlertDialog sa = alert.create();
                sa.show();
            }
        });
        //******************************************************************************************
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r4.isChecked()) {
                    Toast.makeText(getApplicationContext(), "ممتاز", Toast.LENGTH_LONG).show();

                    alert.setMessage("احسنت اجابه صحيحه هيا الي االسؤال التالي  ");
                    alert.setCancelable(true);
                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    ll4.setVisibility(View.GONE);
                   ll5.setVisibility(View.VISIBLE);
                    // textView4.setVisibility(View.VISIBLE);
                } else {
                    alert.setMessage("اجابه خاطئه حاول مره اخري لا تستسلم");
                    alert.setCancelable(true);
                    alert.setPositiveButton("هيا بنا", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }

                    });
                }
                AlertDialog sa = alert.create();
                sa.show();
            }
        });
        //*****************************************************************************************
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r5.isChecked()) {
                    Toast.makeText(getApplicationContext(), "رائع", Toast.LENGTH_LONG).show();

                    alert.setMessage("احسنت اجابه صحيحه هيا الي االسؤال التالي  ");
                    alert.setCancelable(true);
                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    ll5.setVisibility(View.GONE);
                    ll6.setVisibility(View.VISIBLE);
                    // textView4.setVisibility(View.VISIBLE);
                } else {
                    alert.setMessage("اجابه خاطئه حاول مره اخري لا تستسلم");
                    alert.setCancelable(true);
                    alert.setPositiveButton("هيا بنا", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }

                    });
                }
                AlertDialog sa = alert.create();
                sa.show();
            }
        });
        //*****************************************************************************************
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r6.isChecked()) {
                    Toast.makeText(getApplicationContext(), "واصل التقدم", Toast.LENGTH_LONG).show();

                    alert.setMessage("احسنت اجابه صحيحه هيا واصل التقدم  ");
                    alert.setCancelable(true);
                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    ll6.setVisibility(View.GONE);
                    ll7.setVisibility(View.VISIBLE);
                    // textView4.setVisibility(View.VISIBLE);
                } else {
                    alert.setMessage("اجابه خاطئه حاول مره اخري لا تستسلم");
                    alert.setCancelable(false);
                    alert.setPositiveButton("هيا بنا", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }

                    });
                }
                AlertDialog sa = alert.create();
                sa.show();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r7.isChecked()) {
                    Toast.makeText(getApplicationContext(), "رائع", Toast.LENGTH_LONG).show();

                    alert.setMessage("احسنت اجابه صحيحه هيا الي االسؤال التالي  ");
                    alert.setCancelable(true);
                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    ll7.setVisibility(View.GONE);
                    ll8.setVisibility(View.VISIBLE);
                    // textView4.setVisibility(View.VISIBLE);
                } else {
                    alert.setMessage("اجابه خاطئه حاول مره اخري لا تستسلم");
                    alert.setCancelable(true);
                    alert.setPositiveButton("هيا بنا", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }

                    });
                }
                AlertDialog sa = alert.create();
                sa.show();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r8.isChecked()) {
                    Toast.makeText(getApplicationContext(), "ممتاز", Toast.LENGTH_LONG).show();

                    alert.setMessage("احسنت اجابه صحيحه هيا الي االسؤال التالي  ");
                    alert.setCancelable(true);
                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    ll8.setVisibility(View.GONE);
                    ll9.setVisibility(View.VISIBLE);
                    // textView4.setVisibility(View.VISIBLE);
                } else {
                    alert.setMessage("اجابه خاطئه حاول مره اخري لا تستسلم");
                    alert.setCancelable(true);
                    alert.setPositiveButton("هيا بنا", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }

                    });
                }
                AlertDialog sa = alert.create();
                sa.show();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r9.isChecked()) {
                    Toast.makeText(getApplicationContext(), "واصل التقدم", Toast.LENGTH_LONG).show();

                    alert.setMessage("احسنت اجابه صحيحه هيا الي االسؤال التالي  ");
                    alert.setCancelable(true);
                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    ll9.setVisibility(View.GONE);
                    ll10.setVisibility(View.VISIBLE);
                    // textView4.setVisibility(View.VISIBLE);
                } else {
                    alert.setMessage("اجابه خاطئه حاول مره اخري لا تستسلم");
                    alert.setCancelable(true);
                    alert.setPositiveButton("هيا بنا", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }

                    });
                }
                AlertDialog sa = alert.create();
                sa.show();
            }
        });
        //*****************************************************************************************
        //********************************************************************************************
        //********************************************************************************************
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r10.isChecked()) {
                    Toast.makeText(getApplicationContext(), "احسنت", Toast.LENGTH_LONG).show();

                    alert.setMessage("احسنت اجابه صحيحه \n انت رائع ياصديقي هيا نذهب الي المرحله الثانيه   ");
                    alert.setCancelable(true);
                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    ll10.setVisibility(View.GONE);
                    bb.setVisibility(View.VISIBLE);
                    // textView4.setVisibility(View.VISIBLE);
                } else {
                    alert.setMessage("اجابه خاطئه حاول مره اخري لا تستسلم");
                    alert.setCancelable(true);
                    alert.setPositiveButton("هيا بنا", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }

                    });
                }
                AlertDialog sa = alert.create();
                sa.show();
            }
        });
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "انت رائع ياصديقي", Toast.LENGTH_LONG).show() ;
                alert.setMessage("لقد انهيت هذا الجزء من السباق احسنت ");
                alert.setCancelable(false);
                alert.setPositiveButton("احسنت", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog sa = alert.create();
                sa.show();
                //***********************
                Intent Page2=new Intent(Pageone.this,Page2.class);
                Page2.putExtra("name",s);
                startActivity(Page2);
            }
        });
    }

}
                /*
                rr=findViewById(checkedId);
                switch(rr.getId()){
                    case R.id.r1:
                        alert=new AlertDialog.Builder(Pageone.this);
                        alert.setMessage("احسنت اجابه صحيحه هيا الي االسؤال الثاني  ");
                        alert.setCancelable(false);
                        alert.setNegativeButton("good", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                textView4.setVisibility(View.VISIBLE);
                            }
                        });
                        break;
                    case  R.id.radioButton3:
                        alert=new AlertDialog.Builder(Pageone.this);
                        alert.setMessage("اجابه خاطئه حاول مره اخري لا تستسلم");
                        alert.setCancelable(false);
                        alert.setPositiveButton("احسنت", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                                ll.setVisibility(View.VISIBLE);
                            }
                        });
                        alert.setNegativeButton("a", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        break;
                    case R.id.radioButton4:
                        alert=new AlertDialog.Builder(Pageone.this);
                        alert.setMessage("اجابه خاطئه حاول مره اخري لا تستسلم");
                        alert.setCancelable(true);
                        alert.setPositiveButton("احسنت", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                                ll.setVisibility(View.VISIBLE);
                            }
                        });
                        alert.setNegativeButton("", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        break;

                }
                AlertDialog sa=alert.create();
                sa.show();
            }
        });

                 */

/*
         if(radioGroup.isClickable()){
                    if(r21.getId()==R.id.r1){
                        alert=new AlertDialog.Builder(Pageone.this);
                        alert.setMessage("احسنت اجابه صحيحه هيا الي االسؤال الثاني  ");
                        alert.setCancelable(false);
                        alert.setPositiveButton("احسنت", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                ll.setVisibility(View.VISIBLE);
                                dialog.cancel();
                            }
                        });

                    }else{
                        alert=new AlertDialog.Builder(Pageone.this);
                        alert.setMessage("اجابه خاطئه حاول مره اخري لا تستسلم");
                        alert.setCancelable(true);
                    }
                }



                switch(){
                case R.id.r1:
                alert=new AlertDialog.Builder(Pageone.this);
                alert.setMessage("احسنت اجابه صحيحه هيا الي االسؤال الثاني  ");
                alert.setCancelable(false);
                alert.setPositiveButton("احسنت", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ll.setVisibility(View.VISIBLE);
                        dialog.cancel();

                    }
                });
                alert.setNegativeButton("", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                break;
                case  R.id.radioButton3:
                alert=new AlertDialog.Builder(Pageone.this);
                alert.setMessage("اجابه خاطئه حاول مره اخري لا تستسلم");
                alert.setCancelable(true);
                alert.setPositiveButton("احسنت", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        ll.setVisibility(View.VISIBLE);
                    }
                });
                alert.setNegativeButton("", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                break;
                case R.id.radioButton4:
                alert=new AlertDialog.Builder(Pageone.this);
                alert.setMessage("اجابه خاطئه حاول مره اخري لا تستسلم");
                alert.setCancelable(true);
                alert.setPositiveButton("احسنت", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        ll.setVisibility(View.VISIBLE);
                    }
                });
                alert.setNegativeButton("", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                break;

            }
            AlertDialog sa=alert.create();
                           sa.show();
            }
        });


 */