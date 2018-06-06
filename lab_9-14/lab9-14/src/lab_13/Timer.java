package lab_13;

public class Timer {


    private static long timerStart;
    private static long timerFinish;
    private static long timerWorkingLimit;


    public static void setTimerStart() {
        Timer.timerStart = System.nanoTime();
    }
    public static void setTimerFinish() {
        Timer.timerFinish = System.nanoTime();
    }
    public static void setTimerWorkingLimit(long timerWorkingLimit) {
        Timer.timerWorkingLimit = timerWorkingLimit*(long)Math.pow(10,6);
    }

    public static long getTimerStart() {
        return timerStart;
    }
    public static long getTimerFinish() {
        return timerFinish;
    }
    public static long getTimerWorkingLimit() {
        return timerWorkingLimit;
    }

    public static long getResult()
    {

        return timerFinish-timerStart;
    }

    public static void limitChecker(long timerWorkingLimit)
    {

        if (getResult() > timerWorkingLimit*(long)Math.pow(10,6))
        {
            System.out.println("Program time Limit");
            System.exit(0);
        }
    }


}
