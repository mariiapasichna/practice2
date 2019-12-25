package com.mariiapasichna;

public class Main {

    public static void main(String[] args) {
        TimeSpan timeSpan1 = new TimeSpan(2, 30);
        TimeSpan timeSpan2 = new TimeSpan(1, 35);
        timeSpan1.add(timeSpan2);
        System.out.println(timeSpan1.toString());
        timeSpan1.sub(timeSpan2);
        System.out.println(timeSpan1.toString());
        timeSpan2.mult(2.5);
        System.out.println(timeSpan2.toString());
    }
}