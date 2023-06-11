package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    Button add, sub, mult, div, clear, equal, dot;

    EditText edittext;
    Integer n1, n2;
    String opr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);

        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.subs);
        mult = (Button) findViewById(R.id.multi);
        div = (Button) findViewById(R.id.divi);
        clear = (Button) findViewById(R.id.CE);
        equal = (Button) findViewById(R.id.equal);
        dot = (Button)findViewById(R.id.btndot);

        edittext = (EditText) findViewById(R.id.editTextNumber);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText((edittext.getText())+btn1.getText().toString());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText((edittext.getText())+btn2.getText().toString());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText((edittext.getText())+btn3.getText().toString());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText((edittext.getText())+btn4.getText().toString());
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText((edittext.getText())+btn5.getText().toString());
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText((edittext.getText())+btn6.getText().toString());
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText((edittext.getText())+btn7.getText().toString());
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText((edittext.getText())+btn8.getText().toString());
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText((edittext.getText())+btn9.getText().toString());
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText((edittext.getText())+btn0.getText().toString());
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText("");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(edittext.getText()+"");
                opr = "add";
                edittext.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(edittext.getText().toString());
                opr="sub";
                edittext.setText(null);
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(edittext.getText().toString());
                opr="mul";
                edittext.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Integer.parseInt(edittext.getText().toString());
                opr="div";
                edittext.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2 = Integer.parseInt(edittext.getText()+"");
                switch(opr)
                {
                    case "add":
                        edittext.setText((n1+n2)+"");
                        break;
                    case "sub":
                        edittext.setText(n1-n2+"");
                        break;
                    case "mul":
                        edittext.setText(n1*n2+"");
                        break;
                    case "div":
                        edittext.setText(n1/n2+"");
                        break;
                }
            }
        });


    }
}