package myfirst.isuru.com.temperaturecricket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView ivTemp;
    TextView tvDes;
    EditText etTemp;
    Button btnSubmit;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivTemp=findViewById(R.id.ivTemp);
        tvDes=findViewById(R.id.tvDes);
        etTemp=findViewById(R.id.etTemp);
        btnSubmit=findViewById(R.id.btnSubmit);
        tvResult=findViewById(R.id.tvResult);
    }
}
