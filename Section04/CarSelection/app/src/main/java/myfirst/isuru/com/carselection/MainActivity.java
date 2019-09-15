package myfirst.isuru.com.carselection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnCarInfo,btnOwnerInfo;
    ImageView ivMake;
    TextView tvCarType,tvOwnerName,tvOwnerTel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCarInfo=findViewById(R.id.btnCarInfo);
        btnOwnerInfo=findViewById(R.id.btnOwnerInfo);
        ivMake=findViewById(R.id.ivMake);
        tvCarType=findViewById(R.id.tvCarType);
        tvOwnerName=findViewById(R.id.tvOwnerName);
        tvOwnerTel=findViewById(R.id.tvOwnerTel);

        btnOwnerInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnCarInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
