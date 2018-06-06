
public class LinkedList {
    public Node first;

    public void add(Integer data) {
        Node newNode = new Node();
        newNode.setData(data);

        newNode.setNext(first);
        first = newNode;

    }

    public Integer get(int index) {
        Node current = first;

        while (!current.getData().equals(index))
        {
            if (current.getNext() == null)
            {
                return null;
            }
            else
            {
                current = current.getNext();
            }
        }
        return current.getData();
    }

    public boolean delete(int index) {
        Node current = first;
        Node previous = first;

        while(current.getNext()!= null)
        {
            if (current.getNext() == null)
            {
                System.out.println("next element == null, false");
                return false;
            }
            else
            {
                previous = current;
                current = current.getNext();
            }
            if (current.getData().equals(index) )
            {
                System.out.println("element " + current.getData() + " deleting ...");
                if (current == first)
                {
                    first = first.getNext();
                } else
                {
                    previous.setNext(current.getNext());
                }
                System.out.println("element " + current.getData() + " deleted");
                return true;
            }
        }
        return false;
    }

    public int size() {
        Node current = first;
        int size = 1;
        if (current!=null)
        {
            while (current.getNext() != null) {
                size++;
                current = current.getNext();
            }
        }
        else
        {
            return 0;
        }

        return size;
    }
}

class Node{
    private Node next;
    private Integer data;

    public Node() {
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Integer getData() {
        return data;
    }
    public void setData(Integer data) {
        this.data = data;
    }
}