package myfirst.isuru.com.savedatausingsqlitedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.SQLException;

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
        String name=etName.getText().toString().trim();
        String cell=etCell.getText().toString().trim();
        try {
            ContactsDB db=new ContactsDB(this);
            db.open();
            db.CreateEntry(name,cell);
            db.close();
            Toast.makeText(MainActivity.this,"Successful",Toast.LENGTH_SHORT).show();
            etName.setText(" ");
            etCell.setText(" ");
        }catch (SQLException e){
            Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }

    }
    public void btnShowData (View v){

        startActivity(new Intent(this,Data.class));
    }
    public void btnEditData (View v){
        try {
            ContactsDB db=new ContactsDB(this);
            db.open();
            db.updateEntry("1","Charuni","0712456893");
            db.close();
            Toast.makeText(MainActivity.this,"Successful",Toast.LENGTH_SHORT).show();
        }catch (SQLException e){
            Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }

    }
    public void btnDeleteData (View v){
        try {
            ContactsDB db=new ContactsDB(this);
            db.open();
            db.deleteEntry("2");
            db.close();
            Toast.makeText(MainActivity.this,"Successful",Toast.LENGTH_SHORT).show();
        }catch (SQLException e){
            Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }
}
