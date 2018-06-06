package com.serialization0;

import company.Listt;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        Listt listt = new Listt();

        User user = new User();
        user.life = 133321;

        listt.addFirst(user);


        FileOutputStream fileOut = new FileOutputStream("File"+".text");
        ObjectOutputStream objectOutput = new ObjectOutputStream(fileOut);

        objectOutput.writeObject(user);
        objectOutput.close();

        FileInputStream fileIn = new FileInputStream("tempFile");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        User newUser = (User) objectIn.readObject();
        objectIn.close();

        System.out.println(newUser.life);
    }
}
