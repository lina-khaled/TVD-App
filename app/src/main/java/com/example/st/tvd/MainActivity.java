package com.example.st.tvd;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    ImageView imageView;
    MediaPlayer audio;
    public void notPlay(View view){
        Button button1 = (Button) findViewById(R.id.notPlay);
        button1.setVisibility(View.INVISIBLE);
        Button button2 = (Button) findViewById(R.id.play);
        button2.setVisibility(View.INVISIBLE);
        text.setText("Good Bye!");
        text.animate().rotationY(1800).setDuration(300);
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setVisibility(View.VISIBLE);
        imageView = (ImageView)findViewById(R.id.imageView2) ;
        imageView.setVisibility(View.INVISIBLE);
        audio.start();

    }
    public void play(View view) {
        Button button1 = (Button) findViewById(R.id.play);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView)findViewById(R.id.text);
        text.setY(-1000);
        text.animate().translationYBy(1000).setDuration(2000);
        audio = MediaPlayer.create(this,R.raw.sad);
        ImageView image = (ImageView) findViewById(R.id.imageView2);
        image.animate().rotationY(3600).setDuration(1000);
    }
}
