package com.udacity.gradle.builditbigger.backend;

import com.h2m.jokesjavalib.MyClass;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {

        myData = new MyClass().getJoke();
        return myData;

    }
}