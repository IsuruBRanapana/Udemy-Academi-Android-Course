package myfirst.isuru.com.customization;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView etfirstName;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etfirstName=(AutoCompleteTextView) findViewById(R.id.etfirstName);

        String [] names={"Jane","John","Janny","Jenny","Johny","Jack","Jackson","Jennifer"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,names);
        etfirstName.setThreshold(1);
        etfirstName.setAdapter(adapter);

    }
}
