package myfirst.isuru.com.savedatausingsqlitedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etName,etCell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName=(EditText) findViewById(R.id.etName);
        etCell=(EditText) findViewById(R.id.etCell);
    }

    public void btnSubmit (View v){

    }
    public void btnShowData (View v){

        startActivity(new Intent(this,Data.class));
    }
    public void btnEditData (View v){

    }
    public void btnDeleteData (View v){

    }
}
