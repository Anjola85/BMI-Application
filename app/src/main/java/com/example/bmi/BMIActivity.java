package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_layout);
    }
    public void buttonClicked(View v){
//        C2V
        EditText weightView =  findViewById(R.id.weightBox);
        String weight = weightView.getText().toString();
        EditText heightView =  findViewById(R.id.heightBox);
        String height = heightView.getText().toString();

//        C2M
        BMIModel myModel = new BMIModel(weight, height);
        String myBMI = myModel.getBMI();

//        Display answer
        ((TextView) findViewById(R.id.answer)).setText(myBMI);
    }
}
