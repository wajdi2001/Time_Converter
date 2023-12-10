package com.example.timeconverter.model;

public class TimeConvert {
    // attributs de classe
    private long secondes;
    private String temps;

    // constructeur

    public TimeConvert(long secondes) {
        this.secondes = secondes;
        setReponse();
    }
    // getter(s)


    public String getTemps() {
        return temps;
    }

    public long getSecs() {
        return secondes;
    }

    public void setReponse() {

        long heurs = secondes / 3600;
        long reste = secondes % 3600;
        long minutes = reste / 60;
        long secs = reste % 60;

        //temps : l'attribut qui content le résultat
        temps =  String.format("%02d:%02d:%02d", heurs, minutes, secs);



    }


}
