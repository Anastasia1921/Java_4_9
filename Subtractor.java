package ru.myHome;

public class Subtractor implements Operation {
    @Override
    public double getResult(double a, double b) {
        return a - b;
    }
}