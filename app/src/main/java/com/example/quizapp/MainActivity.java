package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // TODO: Declare constants here


    // TODO: Declare member variables here:
    Button myesbutton;
    Button mnobutton;
    TextView textView;
    int nindex;
    int mquestion;

    int currentIndex = 0;

    // TODO: Uncomment to create question bank
    private truefalse[] mQuestionBank = new truefalse[]{
            new truefalse(R.string.question_1, true),
            new truefalse(R.string.question_2, true),
            new truefalse(R.string.question_3, true),
            new truefalse(R.string.question_4, true),
            new truefalse(R.string.question_5, true),
            new truefalse(R.string.question_6, false),
            new truefalse(R.string.question_7, true),
            new truefalse(R.string.question_8, false),
            new truefalse(R.string.question_9, true),
            new truefalse(R.string.question_10, true),
            new truefalse(R.string.question_11, false),
            new truefalse(R.string.question_12, false),
            new truefalse(R.string.question_13, true)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myesbutton = findViewById(R.id.true_button);
        mnobutton = findViewById(R.id.false_button);
        textView = findViewById(R.id.question_text_view);
        //  truefalse firstquestion = mQuestionBank[nindex];

        mquestion = mQuestionBank[nindex].getMquestion();
        textView.setText(mquestion);


        myesbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextquestion();
            }


        });

        mnobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextquestion();
            }


        });


    }

    private void nextquestion() {
        nindex = (nindex + 1) % mQuestionBank.length;
        mquestion = mQuestionBank[nindex].getMquestion();
        textView.setText(mquestion);


    }

    

}

