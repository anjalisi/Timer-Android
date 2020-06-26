package com.example.timerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar timerSeekBar;
    TextView timerTextView;
    Boolean counterIsActive= false;


    public void updateTimer(int secondsLeft)
    {
        int mins= (int)secondsLeft/60;
        int secs= secondsLeft-mins*60;
        String secondStr= Integer.toString(secs);
        String minsStr= Integer.toString(mins);
        if(secs<=9)
        {
            secondStr="0"+secondStr;
        }
        if(mins<=9)
        {
            minsStr="0"+minsStr;
        }
        timerTextView.setText(minsStr+":"+secondStr);

    }
    public void controlTimer(View view)
    {
        Log.i("Button Pressed : ","Pressed");
        new CountDownTimer(timerSeekBar.getProgress()*1000+100,1000)
        {
            @Override
            public void onTick(long millisUntilFinished) {
                updateTimer((int)millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                timerTextView.setText("00:00");
                MediaPlayer mediaPlayer= MediaPlayer.create(getApplicationContext(),R.raw.airhorn);
                mediaPlayer.start();
                Log.i("Finished","done");
            }
        }.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timerSeekBar= (SeekBar)findViewById(R.id.timerSeekBar);
        timerTextView=(TextView)findViewById(R.id.timerTextView);
        timerSeekBar.setMax(1200);
        timerSeekBar.setProgress(30);

        timerSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                updateTimer(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
