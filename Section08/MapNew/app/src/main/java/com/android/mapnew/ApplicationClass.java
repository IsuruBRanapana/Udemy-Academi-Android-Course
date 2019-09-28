package com.android.mapnew;

import android.app.Application;

import com.backendless.Backendless;

public class ApplicationClass extends Application {
    public static final String APPLICATION_ID = "E15373A2-6451-9A15-FF7B-7F9315C04100";
    public static final String API_KEY = "840F2CDE-223A-D3C2-FF32-DAD289EBAC00";
    public static final String SERVER_URL = "http://api.backendless.com";
    @Override
    public void onCreate() {
        super.onCreate();
        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );
    }
}
