package com.example.saramazloumi.calculationproject1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import model.Operation;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editTextShowResult;
    TextView textViewFirstNum, textViewSecondNum, textViewOperand;
    Button btnClear, btnGenerate, btnQuit, btnEqual, btnShowAll, btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnDash, btnDot;
    int num1, num2;
    String[] operand = {"+", "-", "/", "*"};
    ArrayList<Operation> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        initialize();
    }

    public void initialize(){
        editTextShowResult = findViewById(R.id.editTextShowResult);
        textViewFirstNum = findViewById(R.id.textViewFirstNum);
        textViewSecondNum = findViewById(R.id.textViewSecondNum);
        textViewOperand = findViewById(R.id.textViewOperand);
        btnClear = findViewById(R.id.btnClear);
        btnGenerate = findViewById(R.id.btnGenerate);
        btnQuit = findViewById(R.id.btnQuit);
        btnEqual = findViewById(R.id.btnEqual);
        btnShowAll = findViewById(R.id.btnShowAll);
        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnDash = findViewById(R.id.btnDash);
        btnDot = findViewById(R.id.btnDot);
        btnZero.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnGenerate.setOnClickListener(this);
        btnQuit.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnShowAll.setOnClickListener(this);
        btnDash.setOnClickListener(this);
        btnDot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int result = 0;
        int operandSign = 0;
        String op = null;
        String answer = null;
        int counter = 0;
        switch (v.getId()){

            case R.id.btnZero:
                if (editTextShowResult.toString().equals("")){
                    editTextShowResult.setText(String.valueOf(0));
                }else{
                    editTextShowResult.append(String.valueOf(0));
                }

                break;
            case R.id.btnOne:
                if (editTextShowResult.toString().equals("")){
                    editTextShowResult.setText(String.valueOf(1));
                }else{
                    editTextShowResult.append(String.valueOf(1));
                }
                break;
            case R.id.btnTwo:
                if (editTextShowResult.toString().equals("")){
                    editTextShowResult.setText(String.valueOf(2));
                }else{
                    editTextShowResult.append(String.valueOf(2));
                }
                break;
            case R.id.btnThree:
                if (editTextShowResult.toString().equals("")){
                    editTextShowResult.setText(String.valueOf(3));
                }else{
                    editTextShowResult.append(String.valueOf(3));
                }
                break;
            case R.id.btnFour:
                if (editTextShowResult.toString().equals("")){
                    editTextShowResult.setText(String.valueOf(4));
                }else{
                    editTextShowResult.append(String.valueOf(4));
                }
                break;
            case R.id.btnFive:
                if (editTextShowResult.toString().equals("")){
                    editTextShowResult.setText(String.valueOf(5));
                }else{
                    editTextShowResult.append(String.valueOf(5));
                }
                break;
            case R.id.btnSix:
                if (editTextShowResult.toString().equals("")){
                    editTextShowResult.setText(String.valueOf(6));
                }else{
                    editTextShowResult.append(String.valueOf(6));
                }
                break;
            case R.id.btnSeven:
                if (editTextShowResult.toString().equals("")){
                    editTextShowResult.setText(String.valueOf(7));
                }else{
                    editTextShowResult.append(String.valueOf(7));
                }
                break;
            case R.id.btnEight:
                if (editTextShowResult.toString().equals("")){
                    editTextShowResult.setText(String.valueOf(8));
                }else{
                    editTextShowResult.append(String.valueOf(8));
                }
                break;
            case R.id.btnNine:
                if (editTextShowResult.toString().equals("")){
                    editTextShowResult.setText(String.valueOf(9));
                }else{
                    editTextShowResult.append(String.valueOf(9));
                }
                break;

            case R.id.btnDash:
               editTextShowResult.setText("-");
                break;

            case R.id.btnDot:
                String text = editTextShowResult.getText().toString();
                editTextShowResult.setText(text + ".");
                break;

            case R.id.btnClear:
                editTextShowResult.setText(null);
                editTextShowResult.requestFocus();
                break;

            case R.id.btnGenerate:

                editTextShowResult.setText(null);
                Random random = new Random();
                num1 = random.nextInt(10) + 1;
                num2 = random.nextInt(10) + 1;
                op = operand[random.nextInt(operand.length)];
                textViewFirstNum.setText(String.valueOf(num1));
                textViewOperand.setText(op);
                textViewSecondNum.setText(String.valueOf(num2));
                break;

            case R.id.btnQuit:
                finish();
                break;

            case R.id.btnEqual:

                String sign = textViewOperand.getText().toString();
                int randOp = 0;
                switch (sign){

                    case  "+" :
                        randOp = 1;
                        result = num1 + num2;
                        break;
                    case "-" :
                        randOp = 2;
                        result = num1 - num2;
                        break;
                    case "*":
                        randOp = 3;
                        result = num1 * num2;
                        break;
                    case "/":
                        randOp = 4;
                        result = num1 / num2;
                        break;
                }
                int getResult = Integer.valueOf(editTextShowResult.getText().toString());
                if(result == getResult){
                    Toast.makeText(this,  "Your answer is correct", Toast.LENGTH_LONG).show();
                    ++ counter ;
                    answer = "Your answer is correct." + "\n" + "----------------------------------------------" + "\n";
                }else{
                    Toast.makeText(this, "Your answer is wrong", Toast.LENGTH_LONG).show();
                    ++ counter;
                    answer = "Your answer is wrong!!"+ "\n" +"The correct answer is : " + result + "" + "\n" + "----------------------------------------------" + "\n";
                }
                list.add(new Operation(num1, num2, randOp,getResult,answer));
                break;

            case R.id.btnShowAll:
                editTextShowResult.setText(null);
                Intent intent = new Intent(this, SecondActivity.class);
                intent.putExtra("tag", list);
                startActivity(intent);
                break;
        }

    }
}
