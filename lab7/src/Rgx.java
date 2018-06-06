

public class Rgx {

    public static void main(String[] args) {

        String chString = " ABCabc ";
        String numString = " 3 ";



        System.out.println(chString.matches("\\s[A-Za-z]{1,20}\\s"));
        System.out.println(numString.matches("\\s\\d{3}\\s"));


    }
}
