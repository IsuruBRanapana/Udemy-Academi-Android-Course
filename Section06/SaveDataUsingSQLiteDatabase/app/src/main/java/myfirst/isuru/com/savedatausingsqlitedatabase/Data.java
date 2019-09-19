package myfirst.isuru.com.savedatausingsqlitedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Data extends AppCompatActivity {

    TextView tvData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        tvData=(TextView) findViewById(R.id.tvData);
    }
}
