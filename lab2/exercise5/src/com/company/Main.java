package com.company;

public class Main {

    public static void main(String[] args) {
        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 3;

        //мої змінні
        int length = data.length;
        int mid = length/2;
        int max = length;
        int min = 0;
        int fuse = 0;

        //Перевірка
        if (numberToFind > data[max-1] || numberToFind< data[min])
        {
            fuse = -1;
            System.out.println("didn't find your number in the haystack");
        }


        //Сортування
        if (fuse != -1)
        {
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    if (data[mid] > numberToFind) {
                        max = (mid - 1);
                        mid = (max) / 2;
                    } else if (data[mid] < numberToFind) {
                        min = (mid + 1);
                        mid = (max - min) / 2 + min;
                    } else if (data[mid] == numberToFind) {
                        System.out.println("number found: data[" + mid + "] ");
                        fuse = 1;
                        break;
                    }

                }

                if (fuse == 1) {
                    break;
                }

            }
            if (fuse == 0) {
                System.out.println("didn't find your number in the haystack");
            }
        }
    }
}
