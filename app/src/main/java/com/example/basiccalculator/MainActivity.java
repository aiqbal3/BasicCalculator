package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //Addition
    public void clickFunction(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int num1 = Integer.parseInt(myTextField.getText().toString());
        int num2 = Integer.parseInt(myTextField2.getText().toString());

        int solution = num1 + num2;
        String str = String.valueOf(solution);

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(str);
    }

    //subtraction
    public void clickFunction2(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int num1 = Integer.parseInt(myTextField.getText().toString());
        int num2 = Integer.parseInt(myTextField2.getText().toString());

        int solution = num1 - num2;
        String str = String.valueOf(solution);

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(str);
    }

    //multiplication
    public void clickFunction3(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int num1 = Integer.parseInt(myTextField.getText().toString());
        int num2 = Integer.parseInt(myTextField2.getText().toString());

        int solution = num1 * num2;
        String str = String.valueOf(solution);

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(str);
    }

    //division
    public void clickFunction4(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        int num1 = Integer.parseInt(myTextField.getText().toString());
        int num2 = Integer.parseInt(myTextField2.getText().toString());

        int solution = num1 / num2;
        String str = String.valueOf(solution);

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(str);
    }


    public void goToActivity2(String s){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}