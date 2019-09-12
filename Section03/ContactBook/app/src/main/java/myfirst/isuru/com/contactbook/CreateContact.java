package myfirst.isuru.com.contactbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

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
                if (etName.getText().toString().isEmpty()){
                    Toast.makeText(CreateContact.this,"Please Enter Name",Toast.LENGTH_SHORT).show();
                }else if(etNumber.getText().toString().isEmpty()){
                    Toast.makeText(CreateContact.this,"Please Enter Number",Toast.LENGTH_SHORT).show();
                }else if (etWebSite.getText().toString().isEmpty()){
                    Toast.makeText(CreateContact.this,"Please Enter Website",Toast.LENGTH_SHORT).show();
                }else if (etLocation.getText().toString().isEmpty()){
                    Toast.makeText(CreateContact.this,"Please Enter Location",Toast.LENGTH_SHORT).show();
                }else{
                    String name=etName.getText().toString().trim();
                    String number=etNumber.getText().toString().trim();
                    String webSite=etWebSite.getText().toString().trim();
                    String location=etLocation.getText().toString().trim();
                    Intent intent=new Intent();
                    intent.putExtra("name",name);
                    intent.putExtra("number",number);
                    intent.putExtra("webSite",webSite);
                    intent.putExtra("location",location);
                    setResult(RESULT_OK,intent);
                    CreateContact.this.finish();
                }
            }
        });
    }
}
