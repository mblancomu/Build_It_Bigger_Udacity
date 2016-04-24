package com.example.manuel.myapplication.backend;

import com.example.Joker;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private Joker myJoke;

    public MyBean(){
        myJoke = new Joker();
    }

    public String getJoke() {
        return myJoke.getJoke();
    }

}