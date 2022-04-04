package com.phoenix;

public class Ship {
    Ship(int maxPass, boolean typeOst){
//        this.maxPass = maxPass;
//        this.isAm = isAm;
        this.sec = sec;
        this.typeOst = typeOst;
    }

    int maxPass;
    boolean typeOst; //Тип остановки true - конечная, false - промежуточная
    boolean isAm; //Время am (0:00 - 12:00) ?
    int sec; //Кол-во сек с 00:00 или 12:00
}
