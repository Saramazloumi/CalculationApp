package com.example.saramazloumi.calculationproject1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import model.Operation;

public class SecondActivity extends AppCompatActivity {
    TextView textViewUserAnswer, textViewPercentageC;
    Button btnGoBack;
    float counterWrong = 0.0f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initialize();

        ArrayList<Operation> list = (ArrayList<Operation>) getIntent().getExtras().getSerializable("tag");
        for(int i = 0; i < list.size(); i ++){
            textViewUserAnswer.setText(list.toString());
            if (list.get(i).getS1().contains("wrong!!")) {
                counterWrong++;
            }
        }
        int correct = Math.round((list.size() - counterWrong)/list.size()*100);
        int wrong = Math.round((counterWrong/list.size())*100);

        String str = "You got " + correct + "% of correct answers \n" +
                "You got "+ wrong +"% of wrong answers";
        textViewPercentageC.setText(str);
    }

    public void initialize(){
        textViewUserAnswer = findViewById(R.id.textViewUserAnswer);
        textViewPercentageC = findViewById(R.id.textViewPercentageC);
        btnGoBack = findViewById(R.id.btnGoBack);
    }

    public void setBack(View view){
        finish();
    }
}



