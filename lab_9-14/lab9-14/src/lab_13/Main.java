package lab_13;

import company.Listt;

import static lab_13.Timer.*;

public class Main {

    static Listt numbers = new Listt();

    // каунтер кількості двійок, трійок і сімок
    static int count2 = 0;
    static int count3 = 0;
    static int count7 = 0;

    // вміст контейнера
    public static final int N = 100;

    // час паралельного та послідовного виконання(сек)
    static double time1 = 0;
    static double time2 = 0;

    // ліміт часу виконання програми
    static int timeLimit = 100000;


    // для заповнення колекції числами
    static synchronized Listt numListt (Listt listt)
    {
        for (int i = 0; i < N; i++)
        {
            if (i<32)
            {
                listt.addFirst(2);
            }
            else if (i<67)
            {
                listt.addFirst(3);
            }
            else
                {
                    listt.addFirst(7);
                }


        }

        return listt;
    }


    public static void main(String[] args) throws Exception {

        // початок відліку часу роботи програми
        setTimerStart();

        // заповнення колекції числами
        numbers = Main.numListt(numbers);

        /** провірка вмісту колекції */
        //int count = 0;
        //for ( Object o : numbers)
        //{
        //    System.out.println(o);
        //    count++;
        //}


        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();
        Thread7 thread7 = new Thread7();

        thread2.start();
        thread3.start();
        thread7.start();

        thread2.join();
        thread3.join();
        thread7.join();

        //кінець відліку часу роботи програми
        setTimerFinish();

        time1 = getResult()/Math.pow(10,9);

        System.out.println("\nдвійок: "+count2+ "\nтрійок: "+count3 + "\nсімірок: "+ count7);
        System.out.println("Час паралельного виконання: "+getResult()/Math.pow(10,9));
        System.out.println("\n");


        //послідовне виконання
        count2 = 0;
        count3 = 0;
        count7 = 0;

        setTimerStart();
        method237();
        setTimerFinish();

        time2 = getResult()/Math.pow(10,9);

        System.out.println("\nдвійок: "+count2+ "\nтрійок: "+count3 + "\nсімірок: "+ count7);
        System.out.println("Час послідовного виконання: "+getResult()/Math.pow(10,9));
        System.out.println("\n");

        System.out.println("час послідовного виконання більший за паралельного у: "+ time2/time1 + " разів");
    }

    static class Thread2 extends Thread
    {
        @Override
        public void run() {

            method2();
        }
    }

    static class Thread3 extends Thread
    {
        @Override
        public void run() {

            method3();
        }
    }

    static class Thread7 extends Thread
    {
        @Override
        public void run() {

            method7();
        }
    }

    static void method237()
    {
        method2();
        method3();
        method7();
    }

    static void method2()
    {
        //рахуємо кількість двійок у колекції
        for ( Object o : numbers)
        {
            // штучне сповільнення виконання для кожної ітерації циклів обробки контейнерів
            try {
                Thread.sleep(N/2);
            } catch (Exception e) {}

            if (o.equals(2)){
                count2++;
            }
            // перевірка часового ліміту
            setTimerFinish();
            limitChecker(timeLimit);

        }
    }

    static void method3()
    {
        //рахуємо кількість трійок у колекції
        for ( Object o : numbers)
        {
            // штучне сповільнення виконання для кожної ітерації циклів обробки контейнерів
            try {
                Thread.sleep(N/2);
            } catch (Exception e) {}

            if (o.equals(3)){
                count3++;
            }

            // перевірка часового ліміту
            setTimerFinish();
            limitChecker(timeLimit);

        }
    }


    static void method7()
    {
        //рахуємо кількість сімок у колекції
        for ( Object o : numbers)
        {
            // штучне сповільнення виконання для кожної ітерації циклів обробки контейнерів
            try {
                Thread.sleep(N/2);
            } catch (Exception e) {}

            if (o.equals(7)){
                count7++;
            }

            // перевірка часового ліміту
            setTimerFinish();
            limitChecker(timeLimit);

        }
    }

}
