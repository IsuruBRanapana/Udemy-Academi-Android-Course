package myfirst.isuru.com.explicitintents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    EditText etSurname;
    Button btnSubmitAct3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        etSurname=findViewById(R.id.etSurname);
        btnSubmitAct3=findViewById(R.id.btnSubmitAct3);
        btnSubmitAct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
