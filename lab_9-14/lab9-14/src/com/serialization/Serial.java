package com.serialization;

import company.*;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;


public class Serial {

    public static void main  (String[] args) {

    }


    public static Object deserialize(String filename) {

        Object returnObject = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(filename + ".txt"); // ridding file
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream); // reduce bytes to object type, need casting

            returnObject = objectInputStream.readObject();

            fileInputStream.close();
            objectInputStream.close();

        }catch (FileNotFoundException f)
        {
            System.out.println("file not found");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("IOException");
            System.exit(2);
        } catch (ClassNotFoundException e) {
            System.out.println("class not fount");
            System.exit(3);
        }

        return returnObject;
    }

    public static void serialize(String filename, Listt object) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename+".txt");   // ridding file
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);   // making appropriate byte code

            objectOutputStream.writeObject(object);

            fileOutputStream.close();
            objectOutputStream.close();

        }catch (FileNotFoundException f)
        {
            System.out.println("file not found");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("IOException "+e.fillInStackTrace());
            System.exit(2);
        }

    }

}
