package com.company;

public class Main {

    public static void main(String[] args) {
        //оголошення змінних
        int a = 1;
        int n = 5;

        //вивід матриці
        for(int i = 0; i<n; i++)
        {
            for (int j = 0; j<n; j++)
            {
                if(a<10)
                {
                    if (i == j || (j + 1) == (n - i)) {
                        if( (j+1) == n )
                        {
                            System.out.print(" *");
                        }
                        else
                        {
                            System.out.print(" * ");
                        }
                    }
                    else
                    {
                        if ( (j+1) == n )
                        {
                            System.out.print(" "+ a);
                        }
                        else
                        {
                            System.out.print(" " + a + " ");
                        }
                    }
                    a++;
                }
                else
                {
                    if (i == j || (j + 1) == (n - i)) {
                        if ( (j+1) == n )
                        {
                            System.out.print(" *");
                        }
                        else
                        {
                            System.out.print(" * ");
                        }
                    }
                    else
                    {
                        if ( (j+1) == n )
                        {
                            System.out.print(a);
                        }
                        else
                        {
                            System.out.print(a + " ");
                        }
                    }
                    a++;
                }
            }
            System.out.println(" ");
        }

    }
}
