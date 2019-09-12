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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvHeading;
    ImageView ivCall,ivAngryFace,ivWebSite,ivLocation;
    Button btnNewContact;
    final int CREATECONTACT=3;
    String name="",number="",webSite="",location="",mood="";
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
                Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+number));
                startActivity(intent);
            }
        });
        ivWebSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+webSite));
                startActivity(intent);
            }
        });
        ivLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0.0?q="+location));
                startActivity(intent);
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


                name=data.getStringExtra("name");
                number=data.getStringExtra("number");
                webSite=data.getStringExtra("webSite");
                location=data.getStringExtra("location");
                mood=data.getStringExtra("mood");

                if (mood.equals("Angry")){
                    ivAngryFace.setImageResource(R.drawable.angryface);
                }else if (mood.equals("Normal")){
                    ivAngryFace.setImageResource(R.drawable.normalface);
                }else {
                    ivAngryFace.setImageResource(R.drawable.happyface);
                }
            }else {
                Toast.makeText(MainActivity.this,"Please Enter Name",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
