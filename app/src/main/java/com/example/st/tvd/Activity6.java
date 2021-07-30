package com.example.st.tvd;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity6 extends AppCompatActivity {
    public void guess(){
        TextView text = (TextView)findViewById(R.id.textView);
        text.animate().alpha(1).setDuration(1500);

    }
    MediaPlayer audio;
    TextView text2;
    public void onClick(View view){
        EditText answer = (EditText) findViewById(R.id.editText);
        TextView text = (TextView) findViewById(R.id.textView) ;
        text2 = (TextView) findViewById(R.id.text2) ;
        Button button = (Button)findViewById(R.id.button);
        String answerString = answer.getText().toString();
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        if(answerString.equalsIgnoreCase("bonnie")){
            audio.start();
            text.setText("Correct Answer");
            text.animate().rotation(3600).setDuration(2000);
            Intent intent = new Intent(this, Activity7.class);
            startActivity(intent);
        }
        else{
            text.setText("Wrong Answer, Try again!");
            text.setTextSize(20);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        guess();
        audio = MediaPlayer.create(this,R.raw.clapping);
    }
}
