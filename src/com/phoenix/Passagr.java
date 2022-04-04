package com.phoenix;

public class Passagr { //Пассажир
    Passagr(boolean isAm, int sec){
        this.isAm = isAm;
        this.sec = sec;
    }

    boolean isAm; //Время am (0:00 - 12:00) ?
    int sec; //Кол-во сек с 00:00 или 12:00
}