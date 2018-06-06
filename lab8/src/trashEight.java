import java.util.Scanner;

public class trashEight implements standartOrNot {

    public static final String help = "-help";
    public static final String h = "-h";
    public static final String debug = "-debug";
    public static final String d = "-d";



    public void someStrSortStuff(Scanner scanner)
    {

        String nextLine = scanner.nextLine();
        nextLine = nextLine.trim();

        if (!nextLine.equals("")) {

            if (nextLine.equals(help) | nextLine.equals(h))
            {
                help();
                someStrSortStuff(scanner);
            }
            else if (nextLine.equals(debug) | nextLine.equals(d))
            {
                debug();
                someStrSortStuff(scanner);
            }
            else {
                String[] strings = nextLine.split(" ");

                int arrLen = midLendth(strings)[0];
                int midStrLen = midLendth(strings)[1];

                String[] shorts = new String[arrLen];
                int shCounter = 0;
                String[] midLongs = new String[arrLen];
                int midLCounter = 0;


                for (String s : strings) {
                    if (s.length() < midStrLen) {
                        shorts[shCounter] = s;
                        shCounter++;
                    } else {
                        midLongs[midLCounter] = s;
                        midLCounter++;
                    }
                }

                System.out.println("short Strings:\n");
                printer(shorts);
                System.out.println("\nmid-long Strings:\n");
                printer(midLongs);

            }
        }
        else
            {
                idiot();
                someStrSortStuff(scanner);
            }

    }



    public void help()
    {
        System.out.println("\n use this shit to sort your strings\n");
    }
    public void debug()
    {
        System.out.println(" \n enter your strings in console line\n");
    }
    public void idiot()
    {
        System.out.println("press \"-h\" for help; or \"-d\" for other debug instructions");
    }

    public int[] midLendth(String[] strings)
    {

        int sum = 0;
        int counter = 0;

        // calculating mid string length(sum)
        for (String s: strings)
        {
            sum+= s.length();
            counter++;
        }
        sum /= counter;

        int [] midPack = {counter, sum};

        return midPack;
    }

    void printer(String[] strings)
    {
        for (String s : strings)
        {
            if (s != null)
            {
                System.out.println(s);
            }

        }
    }
}
