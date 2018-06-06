package company;


public interface LinkedRealize<E> {

    void  addFirst(E e);
    void  addLast(E e);
    void delEl(int counter);
    int getSize();
    E getElementByIndex(int counter);

    // lab 9 specials

    String toStringg(Listt listt);
    void clear(Listt listt);
    Object[] toArray();
    boolean contains(String string);
    boolean containsAll(Listt listt);
}
