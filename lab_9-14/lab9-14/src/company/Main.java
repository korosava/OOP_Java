package company;

import com.sun.xml.internal.ws.developer.Serialization;

import java.io.Serializable;
import java.util.Iterator;

public class Main implements Serializable {


    public static void main(String[] args) {

        Listt stringList = new Listt<>();

        stringList.addLast(1341);
        stringList.addLast("I'm yura");
        stringList.addLast("it's");
        stringList.addLast("my first working list");


       // for (Object o : stringList)
       // {
       //     System.out.println(o);
       // }
       // System.out.println(stringList.getSize());


        Iterator iterator = stringList.iterator();
        Iterator descIterator = stringList.descendingIterator();
        while (descIterator.hasNext())
        {
            System.out.println(descIterator.next());
        }

    }
}
