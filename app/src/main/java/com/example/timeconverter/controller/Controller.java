package com.example.timeconverter.controller;

import com.example.timeconverter.model.TimeConvert;

public class Controller {
    // attributs de classe
    private static Controller instance;
    public static TimeConvert timeConvert;

    // constructeur

    public static  Controller getInstance(){
        if(instance == null){
            instance = new Controller();
        }
        return instance;
    }
    private Controller(){
        super();
    }

    public void createTimeConvertion(long secondes){
        // à compléter
        timeConvert = new TimeConvert(secondes);
    }
    public String getTemps() {
       // à modifier
        return timeConvert.getTemps();
    }

}
