package myfirst.isuru.com.learnfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFrag.ItemSelected {

    TextView tvDescription;
    ArrayList<String> description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDescription=findViewById(R.id.tvDescription);
        description=new ArrayList<String>();
        description.add("This is the description for item 1");
        description.add("This is the description for item 2");
        description.add("This is the description for item 3");
    }

    @Override
    public void onItemSelected(int index) {
        tvDescription.setText(description.get(index));

    }
}
