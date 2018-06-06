
public class Fibonacci {

        public long getNumber(int position)
        {
            if (position == 1)
        {
            return 1;
        }
        else if (position > 0) {
            long x = 0;
            long prevX = 1;
            long prev2X = 0;

            for (int i = 1; i < position; i++) {
                x = prevX + prev2X;
                prev2X = prevX;
                prevX = x;
            }

            return x;
        }
        else
        {
            return -1;
        }
        }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();

        System.out.println(f.getNumber(9));

    }

}
