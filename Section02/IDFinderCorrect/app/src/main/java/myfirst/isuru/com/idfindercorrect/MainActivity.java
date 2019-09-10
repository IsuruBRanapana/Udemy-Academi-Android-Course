package myfirst.isuru.com.idfindercorrect;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etId;
    Button btnSubmit;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etId=findViewById(R.id.etId);
        btnSubmit=findViewById(R.id.btnSubmit);
        tvResult=findViewById(R.id.tvResult);
        tvResult.setVisibility(View.GONE);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String idNumber=etId.getText().toString().trim();
                String birthYear=idNumber.substring(0,2);
                int Gender=Integer.parseInt(Character.toString(idNumber.charAt(2)));
                String cGender;

                if (Gender<5){
                    cGender=getString(R.string.Male);
                }else {
                    cGender=getString(R.string.Female);
                }
                String txt=getString(R.string.bYearTxt)+birthYear+"\n"+getString(R.string.GenderTxt)+cGender;
                tvResult.setText(txt);
                tvResult.setVisibility(View.VISIBLE);
            }
        });
    }
}
