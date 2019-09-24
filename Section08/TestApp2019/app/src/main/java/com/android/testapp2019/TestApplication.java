package com.android.testapp2019;

import android.app.Application;

import com.backendless.Backendless;

public class TestApplication extends Application {
    public static final String APPLICATION_ID = "9A943887-9FC6-9421-FFF4-E7296B1D8D00";
    public static final String API_KEY = "C52772E1-042F-8797-FF6D-8298C8B3F900";
    public static final String SERVER_URL = "https://api.backendless.com";
    @Override
    public void onCreate() {
        super.onCreate();
        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );
    }
}
