package myfirst.isuru.com.contactbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvHeading;
    ImageView ivCall,ivAngryFace,ivWebSite,ivLocation;
    Button btnNewContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHeading=findViewById(R.id.tvHeading);
        ivAngryFace=findViewById(R.id.ivAngryFace);
        ivCall=findViewById(R.id.ivCall);
        ivLocation=findViewById(R.id.ivLocation);
        ivWebSite=findViewById(R.id.ivWebSite);
        btnNewContact=findViewById(R.id.btnNewContact);

        ivCall.setVisibility(View.GONE);
        ivLocation.setVisibility(View.GONE);
        ivWebSite.setVisibility(View.GONE);
        ivAngryFace.setVisibility(View.GONE);

        ivCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ivWebSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ivLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnNewContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
