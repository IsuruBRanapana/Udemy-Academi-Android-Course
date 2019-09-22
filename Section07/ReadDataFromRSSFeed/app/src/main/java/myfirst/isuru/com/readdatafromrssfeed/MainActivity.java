package myfirst.isuru.com.readdatafromrssfeed;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvRss;
    ArrayList <String> titles;
    ArrayList <String> links;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvRss=(ListView) findViewById(R.id.lvRss);
        titles=new ArrayList<String>();
        links=new ArrayList<String>();
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
                XmlPullParserFactory factory=XmlPullParserFactory.newInstance();
                factory.setNamespaceAware(false);
                XmlPullParser xpp=factory.newPullParser();
                xpp.setInput(getInputStream(url),"UTF_8");
                boolean insideItem=false;
                int eventType=xpp.getEventType();
                while (eventType!=XmlPullParser.END_DOCUMENT){
                    if (eventType==XmlPullParser.START_TAG){
                        if (xpp.getName().equalsIgnoreCase("Item")){
                            insideItem=true;
                        }else if (xpp.getName().equalsIgnoreCase("title")){
                            titles.add(xpp.nextText());
                        }else if (xpp.getName().equalsIgnoreCase("link")){
                            links.add(xpp.nextText());
                        }
                    }else if (eventType==XmlPullParser.END_TAG && xpp.getName().equalsIgnoreCase("Item")){
                        insideItem=false;
                    }
                    eventType=xpp.next();
                }
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
