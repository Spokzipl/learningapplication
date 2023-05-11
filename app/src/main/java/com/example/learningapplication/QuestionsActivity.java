package com.example.learningapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionsActivity extends AppCompatActivity {
    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1, rb2, rb3, rb4;

    String questions[] = {
            "Вопрос 1",
            "Вопрос 2",
            "Вопрос 3",
            "Вопрос 4",
            "Вопрос 5",
            "Вопрос 6",
            "Вопрос 7",
            "Вопрос 8",
            "Вопрос 9",
            "Вопрос 10",
            "Вопрос 11",
            "Вопрос 12",
            "Вопрос 13",
            "Вопрос 14",
            "Вопрос 15"
    };
    String answers[] = {"Ответ 2", "Ответ 2", "Ответ 3", "Ответ 3", "Ответ 3", "Ответ 3*", "Ответ 3", "Ответ 3", "Ответ 3", "Ответ 3"};
    String opt[] = {
            "Ответ 1", "Ответ 2", "Ответ 3", "Ответ 4",
            "Ответ 1", "Ответ 2", "Ответ 3", "Ответ 4",
            "Ответ 1", "Ответ 2", "Ответ 3", "Ответ 4",
            "Ответ 1", "Ответ 2", "Ответ 3", "Ответ 4",
            "Ответ 1", "Ответ 2", "Ответ 3", "Ответ 4",
            "Ответ 1", "Ответ 2", "Ответ 3", "Ответ 4",
            "Ответ 1", "Ответ 2", "Ответ 3", "Ответ 4",
            "Ответ 1", "Ответ 2", "Ответ 3", "Ответ 4",
            "Ответ 1", "Ответ 2", "Ответ 3", "Ответ 4",
            "Ответ 1", "Ответ 2", "Ответ 3", "Ответ 4"
    };
    int flag = 0;
    public static int marks = 0, correct = 0, wrong = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        final TextView score = (TextView) findViewById(R.id.textView4);
        TextView textView = (TextView) findViewById(R.id.DispName);
        Intent intent = getIntent();
        String name = intent.getStringExtra("myname");

        if (name.trim().equals(""))
            textView.setText("Hello User");
        else
            textView.setText("Hello " + name);

        submitbutton = (Button) findViewById(R.id.button3);
        quitbutton = (Button) findViewById(R.id.buttonquit);
        tv = (TextView) findViewById(R.id.tvque);


        tv.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);
    }
}