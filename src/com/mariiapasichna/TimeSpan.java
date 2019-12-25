package com.mariiapasichna;

public class TimeSpan {

    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        if (minutes > 60) {
            throw new IllegalArgumentException("Error");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public void add(TimeSpan timeSpan) {
        hours = hours + timeSpan.hours;
        minutes = minutes + timeSpan.minutes;
        if (minutes >= 60) {
            hours++;
            minutes = minutes % 60;
        }
    }

    public void sub(TimeSpan timeSpan) {
        if (timeSpan.hours * 60 + timeSpan.minutes > hours * 60 + minutes) {
            System.out.println("Error");
        } else {
            int hours1 = ((hours * 60 + minutes) - (timeSpan.hours * 60 + timeSpan.minutes)) / 60;
            int minutes1 = ((hours * 60 + minutes) - (timeSpan.hours * 60 + timeSpan.minutes)) % 60;
            hours = hours1;
            minutes = minutes1;
        }
    }

    public void mult(double times) {
        double time = ((hours * 60 + minutes) * times) / 60;
        minutes = (int) ((hours * 60 + minutes) * times) % 60;
        hours = (int) time;
    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}