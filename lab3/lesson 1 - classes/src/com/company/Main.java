package com.company;

public class Main {

    public static void main(String[] args) {
	    int a = 10;
	    System.out.println(a);

	    a = increasing(a);
        System.out.println(a);
    }

     static int increasing(int x)
    {
        x+=100;
        return x;
    }

}
