package ru.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 172;
        double man = Fit.manWeight(height);
        System.out.println(man);
        short oneHeight = 160;
        double woman = Fit.womanWeight(oneHeight);
        System.out.println(woman);

    }

}