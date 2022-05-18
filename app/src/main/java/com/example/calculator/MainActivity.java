package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt;
    private Button btnzero;
    private Button btnone;
    private Button btntwo;
    private Button btnthree;
    private Button btnfour;
    private Button btnfive;
    private Button btnsix;
    private Button btnseven;
    private Button btneight;
    private Button btnnine;
    private Button btnequal;
    private Button btnadd;
    private Button btnsub;
    private Button btnmul;
    private Button btnmod;
    private Button btnclear;
    private String data;
    private String editarea;
    private int result=0;
    int val1,val2;
    public TextView textView;
    private EditText calArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calArea=findViewById(R.id.edtText);
        btnone=findViewById(R.id.btnOne);
        btntwo=findViewById(R.id.btnTwo);
        btnthree=findViewById(R.id.btnthree);
        btnfour=findViewById(R.id.btnfour);
        btnfive=findViewById(R.id.btnfive);
        btnsix=findViewById(R.id.btnsix);
        btnseven=findViewById(R.id.btnseven);
        btneight=findViewById(R.id.btneight);
        btnnine=findViewById(R.id.btnnine);
        btnzero=findViewById(R.id.btnzero);

        btnadd=findViewById(R.id.btnadd);
        btnsub=findViewById(R.id.btnsub);
        btnmul=findViewById(R.id.btnmul);
        btnequal=findViewById(R.id.btnequal);
        btnmod=findViewById(R.id.btnmod);
        btnclear=findViewById(R.id.btnclear);



        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calArea.setText(calArea.getText()+"1");
            }
        });

        btntwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calArea.setText(calArea.getText()+"2");

            }
        });

        btnthree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calArea.setText(calArea.getText()+"3");

            }
        });

        btnfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calArea.setText(calArea.getText()+"4");

            }
        });

        btnfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calArea.setText(calArea.getText()+"5");

            }
        });

        btnsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calArea.setText(calArea.getText()+"6");

            }
        });

        btnseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calArea.setText(calArea.getText()+"7");

            }
        });

        btneight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calArea.setText(calArea.getText()+"8");

            }
        });

        btnnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                calArea.setText(calArea.getText()+"9");

            }
        });
        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calArea.setText(calArea.getText()+"0");

            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calArea.setText("");
                val1=0;
                val2=0;
                result=0;
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(calArea.getText().toString());
                calArea.setText(calArea.getText()+"+");

            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(calArea.getText().toString());
                calArea.setText(calArea.getText()+"-");

            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(calArea.getText().toString());
                calArea.setText(calArea.getText()+"*");


            }
        });


        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(calArea.getText().toString());
                calArea.setText(calArea.getText()+"/");


            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editarea=calArea.getText().toString();
                for (int i=0; i<=editarea.length()-1;i++){
                    String secondhalf="";
                    switch (editarea.charAt(i)){
                        case'+':
                            secondhalf=editarea.substring(i+1);
                            val2=Integer.parseInt(secondhalf);
                            result=val1+val2;
                            calArea.setText(String.valueOf(result));
                            break;

                        case'-':
                            secondhalf=editarea.substring(i+1);
                            val2=Integer.parseInt(secondhalf);
                            result=val1-val2;
                            calArea.setText(String.valueOf(result));
                            break;


                        case'*':
                            secondhalf=editarea.substring(i+1);
                            val2=Integer.parseInt(secondhalf);
                            result=val1*val2;
                            calArea.setText(String.valueOf(result));
                            break;

                        case'/':
                            secondhalf=editarea.substring(i+1);
                            val2=Integer.parseInt(secondhalf);
                            result=val1/val2;
                            calArea.setText(String.valueOf(result));
                            break;


                    }
                }

            }
        });



    }

    }
