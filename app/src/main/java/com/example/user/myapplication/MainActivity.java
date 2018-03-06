package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnadd, btnsub, btndiv, btnmul, btnmod, btnmul2, btncle;
    private TextView tvresult;
    private EditText edfirst, edsecond;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btnadd = (Button) findViewById(R.id.btnAdd);
        btnsub = (Button) findViewById(R.id.btnSub);
        btndiv = (Button) findViewById(R.id.btnDiv);
        btnmul = (Button) findViewById(R.id.btnMul);
        btnmod = (Button) findViewById(R.id.btnMod);
        btnmul2 = (Button) findViewById(R.id.btnMul2);
        edfirst = (EditText) findViewById(R.id.edFirstNum);
        edsecond = (EditText) findViewById(R.id.edSecondNum);
        tvresult = (TextView) findViewById(R.id.tvRes);
        btncle=(Button)findViewById(R.id.btnCle);

        btnadd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btnmod.setOnClickListener(this);
        btnmul2.setOnClickListener(this);
        btncle.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String num1 = edfirst.getText().toString();
        String num2 = edsecond.getText().toString();


        switch (view.getId()) {
            case R.id.btnAdd:
                try {
                    int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                    tvresult.setText(String.valueOf(addition));
                } catch (Exception e) {
                    tvresult.setText("Enter values in the spaces");
                }
                break;

            case R.id.btnSub:
                try {
                    int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                    tvresult.setText(String.valueOf(subtraction));
                } catch (Exception e) {
                    tvresult.setText("Enter values in the spaces");
                }
                break;

            case R.id.btnDiv:
                try {
                    int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                    tvresult.setText(String.valueOf(division));
                } catch (Exception e) {
                    tvresult.setText("Cannot Divide!");
                }
                break;

            case R.id.btnMul:
                try {
                    int multiply = Integer.parseInt(num1) * Integer.parseInt(num2);
                    tvresult.setText(String.valueOf(multiply));
                } catch (Exception e) {
                    tvresult.setText("Enter values in the spaces");
                }
                break;

            case R.id.btnMod:
                try {
                    int mods = Integer.parseInt(num1) % Integer.parseInt(num2);
                    tvresult.setText(String.valueOf(mods));
                } catch (Exception e) {
                    tvresult.setText("Enter values in the spaces");
                }
                break;

            case R.id.btnMul2:

                if((!num1.equals(""))&&(!num2.equals(""))){
                    tvresult.setText("Select input number");

                } else if (!(num1.equals(""))) {
                    Double n = Double.parseDouble(num1);
                    Double k = Math.pow(n, 2);
                    tvresult.setText(k.toString());

                } else if (!(num2.equals(""))) {
                    Double m = Double.parseDouble(num2);
                    Double o = Math.pow(m, 2);
                    tvresult.setText(o.toString());

                } else {
                        tvresult.setText("Please input number");
                        }
                break;

            case R.id.btnCle:
                edfirst.setText(null);
                edsecond.setText(null);


                }
        }
    }

