package com.example.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String inputT;
    int textNum;
    TextView inputTextV;
    String[] answers = {"Да", "Нет", "Возможно"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(new MyDraw(this));

    }

    public void answer (View view){
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.shake);
        View screen = findViewById(R.id.screen);
        Animation fadeIn = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        screen.startAnimation(anim);
        TextView ballText = findViewById(R.id.textView);
        ballText.setText("");
        ballText.startAnimation(fadeIn);
        int randomNum = textNum%3;
        ballText.setText(answers[randomNum]);
    }
    public void questionInput(View view){
        textNum = 0;
        EditText inputTextPanel = findViewById(R.id.editTextTextPersonName);
        Editable inputText = inputTextPanel.getText();
        inputT = inputText.toString();
        inputTextV.setText(inputT);
        for(int i = 0 ; i < inputT.length(); i ++){
            int x = inputText.charAt(i);
            textNum += x;
        }
    }
}