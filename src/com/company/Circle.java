package com.company;

public class Circle {
    static final double PI = 3.14;
    private static int radius;

    public void setRadius(int radius) {
        Circle.radius = radius;
    }

    public Circle() {
    }

    public static void area(){
        double v = PI * (radius * radius);
        System.out.println(v);

    }

    public static void circumference(){
        double v = PI * 2 * radius;
        System.out.println(v);
    }

}
