package myfirst.isuru.com.savedatausingtextfile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    EditText etName,etSurname;
    Button btnAdd, btnSave;
    TextView tvResult;
    ArrayList<Person> persons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName=(EditText) findViewById(R.id.etName);
        etSurname=(EditText) findViewById(R.id.etSurname);
        tvResult=(TextView) findViewById(R.id.tvResult);

        persons=new ArrayList<Person>();
        loadData();
    }

    public void loadData(){
        persons.clear();
        File file=getApplicationContext().getFileStreamPath("Data.txt");
        String lineFromFile;
        if (file.exists()){
            try {
                BufferedReader reader=new BufferedReader(new InputStreamReader(openFileInput("Data.txt")));
                while ((lineFromFile=reader.readLine())!=null){
                    StringTokenizer tokenizer=new StringTokenizer(lineFromFile," , ");
                    Person person=new Person(tokenizer.nextToken(),tokenizer.nextToken());
                    persons.add(person);
                }
                reader.close();
                setTextToTextView();
            }catch (IOException e){
                Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void btnAddData(View v){

        String name=etName.getText().toString().trim();
        String surname=etSurname.getText().toString().trim();

        Person person=new Person(name,surname);
        persons.add(person);

        setTextToTextView();
    }

    private void setTextToTextView() {
        String text="";
        for (int i=0;i<persons.size();i++){
            text=text+persons.get(i).getName()+" "+persons.get(i).getSurname()+" \n";
        }
        tvResult.setText(text);
    }

    public void btnSaveData(View v){
        try {
            FileOutputStream file=openFileOutput("Data.txt",MODE_PRIVATE);
            OutputStreamWriter ouputfile=new OutputStreamWriter(file);

            for (int i=0;i<persons.size();i++){
                ouputfile.write(persons.get(i).getName()+" , "+persons.get(i).getSurname()+" \n");
            }
            ouputfile.flush();
            ouputfile.close();
            Toast.makeText(MainActivity.this,"Successful",Toast.LENGTH_SHORT).show();
        }catch (IOException e){
            Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }

    }
}
