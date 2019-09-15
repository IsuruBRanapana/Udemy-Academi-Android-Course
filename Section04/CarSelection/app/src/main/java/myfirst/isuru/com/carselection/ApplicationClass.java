package myfirst.isuru.com.carselection;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList<Car> cars;

    @Override
    public void onCreate() {
        super.onCreate();
        cars=new ArrayList<Car>();
        cars.add(new Car("Volkswagen","Polo","Isuru","0713586640"));
        cars.add(new Car("Mercedes","E200","Isuru1","0713586641"));
        cars.add(new Car("Nissan","Almera","Isuru2","0713586642"));
        cars.add(new Car("Nissan","Navara","Isuru3","0713586643"));
        cars.add(new Car("Volkswagen","Kombi","Isuru4","0713586644"));
        cars.add(new Car("Mercedes","E180","Isuru5","0713586645"));


    }
}
