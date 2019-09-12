package myfirst.isuru.com.contactbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class CreateContact extends AppCompatActivity {
    EditText etName,etNumber,etWebSite,etLocation;
    ImageView ivHappy,ivNormal,ivAngry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_contact);
        etName=findViewById(R.id.etName);
        etNumber=findViewById(R.id.etNumber);
        etWebSite=findViewById(R.id.etWebSite);
        etLocation=findViewById(R.id.etLocation);
        ivHappy=findViewById(R.id.ivHappy);
        ivNormal=findViewById(R.id.ivNormal);
        ivAngry=findViewById(R.id.ivAngry);

        ivHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ivNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ivAngry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }
}
