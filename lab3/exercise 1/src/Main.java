
public class Main {

    public static void main(String[] args) {
        final byte N = 10;
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);


        System.out.println("size: "+ linkedList.size());

        System.out.println("\ndel1:"+linkedList.delete(1));
        System.out.println("del2: "+ linkedList.delete(2));
        System.out.println("del3: "+ linkedList.delete(3));

        System.out.println("\nget1: "+ linkedList.get(1));
        System.out.println("get2: "+ linkedList.get(2));
        System.out.println("get3: "+ linkedList.get(3));

        System.out.println("\nsize: "+ linkedList.size());



    }
}
