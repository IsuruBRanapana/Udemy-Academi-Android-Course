package myfirst.isuru.com.asynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText etNrOfTimes;
    Button btnSubmit;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNrOfTimes=(EditText) findViewById(R.id.etNrOfTimes);
        tvResult=(TextView) findViewById(R.id.tvResult);
        btnSubmit=(Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ones=0,twos=0,threes=0,fours=0,fives=0,sixs=0,randomNumber;
                int nrOfTimes=Integer.parseInt(etNrOfTimes.getText().toString().trim());
                Random random=new Random();
                String result;
                for (int i=0;i<nrOfTimes;i++){
                    randomNumber=random.nextInt(6)+1;
                    switch (randomNumber){
                        case 1:
                            ones++;
                            break;
                        case 2:
                            twos++;
                            break;
                        case 3:
                            threes++;
                            break;
                        case 4:
                            fours++;
                            break;
                        case 5:
                            fives++;
                            break;
                        default:
                            sixs++;
                    }
                }
                result="1: "+ones+"\n2: "+twos+"\n3: "+threes+"\n4: "+fours+"\n5: "+fives+"\n6: "+sixs;
                tvResult.setText(result);
                Toast.makeText(MainActivity.this,"Successful",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
