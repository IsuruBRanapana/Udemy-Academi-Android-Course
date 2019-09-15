package myfirst.isuru.com.carselection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CarAdapter.ItemClicked {

    Button btnCarInfo,btnOwnerInfo;
    ImageView ivMake;
    TextView tvCarType,tvOwnerName,tvOwnerTel;
    FragmentManager fragmentManager;
    Fragment infoFrag,listFrag,carInfoFrag,ownerInfoFrag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCarInfo=findViewById(R.id.btnCarInfo);
        btnOwnerInfo=findViewById(R.id.btnOwnerInfo);
        ivMake=findViewById(R.id.ivMake);
        tvCarType=findViewById(R.id.tvCarType);
        tvOwnerName=findViewById(R.id.tvOwnerName);
        tvOwnerTel=findViewById(R.id.tvOwnerTel);

        fragmentManager=getSupportFragmentManager();
        listFrag=fragmentManager.findFragmentById(R.id.listFrag);
        infoFrag=fragmentManager.findFragmentById(R.id.infoFrag);
        carInfoFrag=fragmentManager.findFragmentById(R.id.carInfoFrag);
        ownerInfoFrag=fragmentManager.findFragmentById(R.id.ownerInfoFrag);

        fragmentManager.beginTransaction()
                .show(infoFrag)
                .show(listFrag)
                .show(carInfoFrag)
                .hide(ownerInfoFrag).commit();

        btnOwnerInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .show(infoFrag)
                        .show(listFrag)
                        .hide(carInfoFrag)
                        .show(ownerInfoFrag).commit();

            }
        });

        btnCarInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction()
                        .show(infoFrag)
                        .show(listFrag)
                        .show(carInfoFrag)
                        .hide(ownerInfoFrag).commit();

            }
        });
        onItemClicked(0);
    }

    @Override
    public void onItemClicked(int index) {
        tvOwnerName.setText(ApplicationClass.cars.get(index).getOwnerName());
        tvOwnerTel.setText(ApplicationClass.cars.get(index).getOwnerTel());
        tvCarType.setText(ApplicationClass.cars.get(index).getModel());

        if (ApplicationClass.cars.get(index).getMake().equals("Volkswagen")){
            ivMake.setImageResource(R.drawable.volkswagen);
        }else if (ApplicationClass.cars.get(index).getMake().equals("Nissan")){
            ivMake.setImageResource(R.drawable.nissan);
        }else
            ivMake.setImageResource(R.drawable.nissan);
    }
}
