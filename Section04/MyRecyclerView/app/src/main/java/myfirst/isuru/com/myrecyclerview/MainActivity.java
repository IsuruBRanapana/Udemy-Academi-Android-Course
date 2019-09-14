package myfirst.isuru.com.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements PersonAdapter.ItemClicked {

    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager myLayoutManager;

    ArrayList<Person> people;

    Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);

        myLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(myLayoutManager);

        btnAdd=findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people.add(new Person("Isuru","Ranapana","plane"));
            }
        });

        people=new ArrayList<Person>();
        people.add(new Person("John","Rambo","bus"));
        people.add(new Person("John1","Rambo","plane"));
        people.add(new Person("John2","Rambo","bus"));
        people.add(new Person("John3","Rambo","bus"));
        people.add(new Person("John4","Rambo","plane"));
        people.add(new Person("John","Rambo","bus"));
        people.add(new Person("John1","Rambo","plane"));
        people.add(new Person("John2","Rambo","bus"));
        people.add(new Person("John3","Rambo","bus"));
        people.add(new Person("John4","Rambo","plane"));
        people.add(new Person("John","Rambo","bus"));
        people.add(new Person("John1","Rambo","plane"));
        people.add(new Person("John2","Rambo","bus"));
        people.add(new Person("John3","Rambo","bus"));
        people.add(new Person("John4","Rambo","plane"));

        myAdapter=new PersonAdapter(this,people);
        recyclerView.setAdapter(myAdapter);
    }

    @Override
    public void onItemClicked(int index) {
        Toast.makeText(this,"Surname : "+people.get(index).getSurname(),Toast.LENGTH_SHORT).show();
    }
}
