package myfirst.isuru.com.myfragmented;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFrag.ItemSelected{
    TextView tvDescription;
    String [] descriptions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDescription=findViewById(R.id.tvDescription);

        descriptions=getResources().getStringArray(R.array.descriptions);

    }
    @Override
    public void onItemSelected(int index){
        tvDescription.setText(descriptions[index]);
    }
}
