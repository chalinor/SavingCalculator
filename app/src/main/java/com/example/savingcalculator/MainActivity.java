package com.example.savingcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnCalculate, btnComputeSum;
    private EditText num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculate = findViewById(R.id.btnCompute);
        btnComputeSum = findViewById(R.id.btnSum);
        num1 = findViewById(R.id.editTextNum1);
        num2 = findViewById(R.id.editTextNum2);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You clicked compute", Toast.LENGTH_SHORT).show();
            }
        });

        //this is for the Compute Sum button
        btnComputeSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sum = " + add(), Toast.LENGTH_SHORT).show();
            }
        });

    } //end of onCreate() method

    public int add(){
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int sum = n1 + n2;
        return sum;
    }
}
