package myfirst.isuru.com.explicitintents;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    EditText etSurname;
    Button btnSubmitAct3,btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        etSurname=findViewById(R.id.etSurname);
        btnSubmitAct3=findViewById(R.id.btnSubmitAct3);
        btnCancel=findViewById(R.id.btnCancel);
        btnSubmitAct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etSurname.getText().toString().isEmpty()){
                    Toast.makeText(Main3Activity.this,"please Enter All fields",Toast.LENGTH_SHORT).show();
                }else{
                    String surname=etSurname.getText().toString().trim();
                    Intent intent=new Intent();
                    intent.putExtra("surname",surname);
                    setResult(RESULT_OK,intent);
                    Main3Activity.this.finish();
                }
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                Main3Activity.this.finish();
            }
        });
    }
}
