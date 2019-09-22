package myfirst.isuru.com.readdatafromrssfeed;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    ListView lvRss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvRss=(ListView) findViewById(R.id.lvRss);
        lvRss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public InputStream getInputStream(URL url){
        try {
            return url.openConnection().getInputStream();
        }catch (IOException e){
            return null;
        }
    }

    public class ProcessInBackground extends AsyncTask<Integer,Void,String>{

        ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
        Exception exception;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog.setMessage("Loading RSS feed... Please Wait..");
            progressDialog.show();
        }

        @Override
        protected String doInBackground(Integer... integers) {
            try {
                URL url=new URL("http://feeds.news24.com/articles/fin24/tech/rss");
            }catch (MalformedURLException e){
                exception=e;
            }catch (XmlPullParserException e){
                exception=e;
            }catch (IOException e){
                exception=e;
            }

            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            progressDialog.dismiss();
        }
    }
}
