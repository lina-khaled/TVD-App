package com.example.st.tvd;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    public void guess(){
        TextView text = (TextView)findViewById(R.id.text);
        text.animate().alpha(1).setDuration(2500);

    }
    MediaPlayer audio;
    TextView text2;
    public void onClick(View view){
        EditText answer = (EditText) findViewById(R.id.editText);
        TextView text = (TextView) findViewById(R.id.text) ;
        text2 = (TextView) findViewById(R.id.text2) ;
        Button button = (Button)findViewById(R.id.button);
        String answerString = answer.getText().toString();
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        if(answerString.equalsIgnoreCase("Elena")){
            audio.start();
            text.setText("Correct Answer");
            text.animate().rotation(3600).setDuration(2000);

            button.setVisibility(View.INVISIBLE);
            button2.setVisibility(View.VISIBLE);
            button3.setVisibility(View.VISIBLE);
        }
        else{
            text.setText("Wrong Answer, Try again!");
            text.setTextSize(20);
        }
    }
    public void Continue(View view){
        audio.pause();
        Button button1 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }
    public void openActivity3(){
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);

    }
    public void Stop(View view) {
        audio.pause();
        Button button1 = (Button) findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    }
    public void openActivity4(){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        guess();
        audio = MediaPlayer.create(this,R.raw.clapping);
    }
}
