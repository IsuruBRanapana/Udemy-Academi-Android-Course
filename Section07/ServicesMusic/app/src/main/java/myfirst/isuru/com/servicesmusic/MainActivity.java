package myfirst.isuru.com.servicesmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MusicStoppedListner{
    ImageView ivPlayStop;
    String audioLink="https://dl.dropbox.com/s/rdqgwa36pm2ayd0/Aradhana.mp3?dl=0";
    boolean musicPlaying=false;
    Intent serviceIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivPlayStop=(ImageView) findViewById(R.id.ivPlayStop);
        Applicationclass.context=(Context) MainActivity.this;
        ivPlayStop.setBackgroundResource(R.drawable.play);
        serviceIntent=new Intent(this,MyMusicService.class);
        ivPlayStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!musicPlaying){
                    playAudio();
                    ivPlayStop.setImageResource(R.drawable.stop);
                    musicPlaying=true;
                }else {
                    stopPlayAudio();
                    ivPlayStop.setImageResource(R.drawable.play);
                    musicPlaying=false;
                }
            }
        });
    }

    private void playAudio() {
        serviceIntent.putExtra("AudioLink",audioLink);
        try {
            startService(serviceIntent);
        }catch (SecurityException e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }
    private void stopPlayAudio(){
        try {
            stopService(serviceIntent);
        }catch (SecurityException e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void OnMusicStopped() {
        ivPlayStop.setImageResource(R.drawable.play);
        musicPlaying=false;
    }
}
