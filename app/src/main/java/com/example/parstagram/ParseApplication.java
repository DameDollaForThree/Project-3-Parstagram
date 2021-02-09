package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("o8oK5bEo4Hl7pMVFMaa7FtwuMTu4nbsKdJ0fsy93")
                .clientKey("fBbuPAl3kUtzcHFM0X3V4tPnUVSOaMqk9NXqSLIw")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
