package myfirst.isuru.com.contactbook;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList<Person> people;
    @Override
    public void onCreate() {
        super.onCreate();

        people=new ArrayList<Person>();
        people.add(new Person("isuru","0712345678"));
        people.add(new Person("isuru1","000712345678"));
        people.add(new Person("isuru2","0712345678"));
        people.add(new Person("isuru3","0712345678"));
        people.add(new Person("isuru4","0712345678"));
    }
}
