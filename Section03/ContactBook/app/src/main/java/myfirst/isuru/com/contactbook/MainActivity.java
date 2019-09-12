package myfirst.isuru.com.contactbook;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
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
    final int CREATECONTACT=3;
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
                String number=getIntent().getStringExtra("number");
                Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+number));
                startActivity(intent);
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
                Intent intent=new Intent(MainActivity.this,myfirst.isuru.com.contactbook.CreateContact.class);
                startActivityForResult(intent,CREATECONTACT);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==CREATECONTACT){
            if (resultCode==RESULT_OK){
                ivCall.setVisibility(View.VISIBLE);
                ivAngryFace.setVisibility(View.VISIBLE);
                ivLocation.setVisibility(View.VISIBLE);
                ivWebSite.setVisibility(View.VISIBLE);
                String name=getIntent().getStringExtra("name");
                String number=getIntent().getStringExtra("number");
                String webSite=getIntent().getStringExtra("webSite");
                String location=getIntent().getStringExtra("location");
            }
        }
    }
}
