package myfirst.isuru.com.myfragmented;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFrag.ItemSelected{
    TextView tvDescription;
    String [] descriptions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDescription=findViewById(R.id.tvDescription);

        descriptions=getResources().getStringArray(R.array.descriptions);

        //the phone is in portrait mode
        if (findViewById(R.id.layout_portrait)!=null){
            FragmentManager manager=this.getSupportFragmentManager();
            manager.beginTransaction()
                    .show(manager.findFragmentById(R.id.listFrag))
                    .hide(manager.findFragmentById(R.id.detailFrag))
                    .commit();

        }
        //the phone is in landscape mode
        if (findViewById(R.id.layout_land)!=null){
            FragmentManager manager=this.getSupportFragmentManager();
            manager.beginTransaction()
                    .show(manager.findFragmentById(R.id.listFrag))
                    .show(manager.findFragmentById(R.id.detailFrag))
                    .commit();

        }

    }
    @Override
    public void onItemSelected(int index){
        tvDescription.setText(descriptions[index]);
        if (findViewById(R.id.layout_portrait)!=null){
            FragmentManager manager=this.getSupportFragmentManager();
            manager.beginTransaction()
                    .show(manager.findFragmentById(R.id.detailFrag))
                    .hide(manager.findFragmentById(R.id.listFrag))
                    .addToBackStack(null)
                    .commit();
        }
    }
}
