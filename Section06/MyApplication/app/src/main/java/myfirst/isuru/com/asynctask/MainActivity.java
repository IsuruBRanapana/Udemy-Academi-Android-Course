package myfirst.isuru.com.asynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.AsyncTask;
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
        tvResult.setVisibility(View.GONE);
        btnSubmit=(Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int nrOfTimes=Integer.parseInt(etNrOfTimes.getText().toString().trim());
                new ProcessDiceInBackground().execute(nrOfTimes);
            }
        });
    }

    public class ProcessDiceInBackground extends AsyncTask<Integer,Integer,String>{

        ProgressDialog dialog;
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            dialog=new ProgressDialog(MainActivity.this);
            dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            dialog.setMax(Integer.parseInt(etNrOfTimes.getText().toString().trim()));
            dialog.show();
        }

        @Override
        protected String doInBackground(Integer... integers) {
            int ones=0,twos=0,threes=0,fours=0,fives=0,sixs=0,randomNumber;
            Random random=new Random();
            String result;
            double currentProgress=0;
            double previousProgess=0;
            for (int i=0;i<integers[0];i++){
                currentProgress=(double) i/integers[0];
                if ((currentProgress-previousProgess)>=0.02){
                    publishProgress(i);
                    previousProgess=currentProgress;
                }
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
            return result;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            dialog.setProgress(values[0]);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            dialog.dismiss();
            tvResult.setText(s);
            tvResult.setVisibility(View.VISIBLE);

        }

    }
}
