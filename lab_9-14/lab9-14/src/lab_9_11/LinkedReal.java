package lab_9_11;

public interface LinkedReal<E> {

    void  addFirst(E e);
    void  addLast(E e);
    void delEl(int counter);
    int getSize();
    E getElementByIndex(int counter);

    // lab 9 specials

    String toStringg(MyList myList);
    void clear(MyList myList);
    Object[] toArray();
    boolean contains(String string);
    boolean containsAll(MyList myList);
}
