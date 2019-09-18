package myfirst.isuru.com.savedatausingtextfile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etName,etSurname;
    Button btnAdd, btnSave;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName=(EditText) findViewById(R.id.etName);
        etSurname=(EditText) findViewById(R.id.etSurname);
        tvResult=(TextView) findViewById(R.id.tvResult);
    }

    public void btnAddData(View v){

    }

    public void btnSaveData(View v){

    }
}
