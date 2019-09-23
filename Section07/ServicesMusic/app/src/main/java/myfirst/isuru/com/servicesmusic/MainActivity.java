package myfirst.isuru.com.servicesmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ivPlayStop;
    String audioLink="https://dl.dropbox.com/s/rdqgwa36pm2ayd0/Aradhana.mp3?dl=0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivPlayStop=(ImageView) findViewById(R.id.ivPlayStop);
        ivPlayStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
