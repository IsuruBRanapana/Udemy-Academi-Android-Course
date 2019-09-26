package com.android.contact2018;

import android.app.Application;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;

import java.util.List;

public class ApplicationClass extends Application {
    public static final String APPLICATION_ID = "E47985CA-5E5F-FC1B-FFB2-467080055400";
    public static final String API_KEY = "5605C574-8F84-B303-FF18-8EF844967500";
    public static final String SERVER_URL = "https://api.backendless.com";

    public static BackendlessUser user;
    public static List<Contacts> contacts;

    @Override
    public void onCreate() {
        super.onCreate();
        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );
    }

}
