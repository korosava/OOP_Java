package com.company;

public class Main {

    public static void main(String[] args) {

        int array[] = {3,5,20,7,1,8};
        int length = array.length;
        int x = 0;

        //виведення масиву
        for (int i = 0; i<length; i++)
        {
            System.out.print(array[i]);
        }
        System.out.print("\n");

        //сортування масиву
        for (int a = 0; a < length; a++ )
        {
            for (int i = 0; i < (length - 1); i++) {
                if (array[i] > array[i + 1]) {
                    x = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = x;
                }
            }
        }
        //виведення посортованого масиву
        for (int i = 0; i<length; i++)
        {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\n");




    }
}
