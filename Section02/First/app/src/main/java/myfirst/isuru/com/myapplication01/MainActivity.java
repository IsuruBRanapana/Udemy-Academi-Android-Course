package myfirst.isuru.com.myapplication01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        Log.d("Life Cycle event","In onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life Cycle event","In onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Life Cycle event","In onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life Cycle event","In onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life Cycle event","In onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life Cycle event","In onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life Cycle event","In onRestart");
    }
}
