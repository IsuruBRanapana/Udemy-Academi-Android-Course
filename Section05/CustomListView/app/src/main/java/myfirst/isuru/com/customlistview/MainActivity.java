package myfirst.isuru.com.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvProducts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvProducts=(ListView) findViewById(R.id.lvProducts);

        ArrayList<Products> products=new ArrayList<Products>();
        Products products1=new Products("Dell inspiron 15","this is a laptop","Laptop",120000,true);
        Products products2=new Products("Kingston","This is a lap ram in 8GB","Memory",12000,false);
        Products products3=new Products("Kinsgston","This is a hard Disk","HDD",15000,true);
        Products products4=new Products("HP","this is a screen","Screen",3000,true);
        Products products5=new Products("ASUS", "This is a laptop", "Laptop",100000,false);

        products.add(products1);
        products.add(products2);
        products.add(products3);
        products.add(products4);
        products.add(products5);

        ListAdapter adapter=new ListAdapter(this, products);
        lvProducts.setAdapter(adapter);

    }
}
