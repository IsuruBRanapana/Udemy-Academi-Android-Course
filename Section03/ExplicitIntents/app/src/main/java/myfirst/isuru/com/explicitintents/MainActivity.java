package myfirst.isuru.com.explicitintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    Button btnAct1,btnAct2;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName=findViewById(R.id.etName);
        btnAct1=findViewById(R.id.btnAct1);
        btnAct2=findViewById(R.id.btnAct2);
        tvResult=findViewById(R.id.tvResult);

        btnAct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etName.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"please enter all fields",Toast.LENGTH_SHORT).show();
                }else {
                    String name=etName.getText().toString().trim();
                    Intent intent=new Intent(MainActivity.this,myfirst.isuru.com.explicitintents.Main2Activity.class);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }
            }
        });

        btnAct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
