package myfirst.isuru.com.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager myLayoutManager;

    ArrayList<Person> people;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);

        myLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(myLayoutManager);

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
}
