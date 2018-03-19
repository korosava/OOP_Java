package com.company;

public class Main {

    public static void main(String[] args) {
        double a = 0, b = 0, c = 0, x1 = 0, x2 = 0, d = 0;

        //Дискримінант
        d = ( (b*b) - (4*a*c) );
        System.out.println("D = "+ d + " "+ "sqrt(D) = "+ Math.sqrt(d)+ "\n" );


        //Перевірки

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("x1=");
            System.out.println("x2=");
        } else if (a == 0 && b == 0 && c >= 9999999) {
            System.out.println("x1=NaN");
            System.out.println("x2=NaN");
        } else if (a == 0 && b > 0 && c == 0) {
            x1 = 0.0;
            x2 = 0.0;

            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);

        } else if (d < 0) {
            System.out.println("x1=");
            System.out.println("x2=");
        } else {
            x1 = ((-b + Math.sqrt(d)) / (2 * a));
            x2 = ((-b - Math.sqrt(d)) / (2 * a));
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }

    }
}
