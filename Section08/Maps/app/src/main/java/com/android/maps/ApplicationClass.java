package com.android.maps;

import android.app.Application;

import com.backendless.Backendless;

public class ApplicationClass extends Application {

    public static final String APPLICATION_ID = "9A943887-9FC6-9421-FFF4-E7296B1D8D00";
    public static final String API_KEY = "D11A1605-DCE3-474D-80D1-6379581F1E3B";
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
