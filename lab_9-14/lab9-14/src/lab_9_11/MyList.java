package lab_9_11;

import java.io.Serializable;
import java.util.Iterator;

import static java.lang.String.valueOf;

public class MyList<E> implements LinkedReal<E>,Iterable<E>,DescIter<E>,Serializable {

    private int size = 0;
    private Node<E> firstNode;
    private Node<E> lastNode;

    public MyList()
    {
         lastNode = new Node<>(null,firstNode,null);
         firstNode = new Node<>(null,null,lastNode);
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = firstNode;
        next.setCurrentElement(e);
        firstNode = new Node<>(null,null,next);
        next.setPrevElement(firstNode);
        size++;

    }

    @Override
    public void addLast(E e) {
        Node<E> prev = lastNode;
        prev.setCurrentElement(e);
        lastNode = new Node<>(null,prev,null);
        prev.setNextElement(lastNode);
        size++;

    }

    @Override
    public void delEl(int counter) {
        Node<E> target = firstNode.getNextElement();
        Node<E> preTarget = firstNode.getNextElement();
        Node<E> nextTarget = firstNode.getNextElement();

        //finding
        for (int i = 0; i < counter; i++)
        {
            target = getElement(target);
        }
        preTarget = target.getPrevElement();
        nextTarget = target.getNextElement();

        //deleting
        preTarget.setNextElement(nextTarget);
        nextTarget.setPrevElement(preTarget);

        size--;
    }

    @Override
    public int getSize() {
        return size;
    }


    @Override
    public E getElementByIndex(int counter) {
        Node<E> target = firstNode.getNextElement();

        for (int i = 0; i < counter; i++)
        {
            target = getElement(target);
        }

        return target.getCurrentElement();
    }
    private Node<E> getElement(Node<E> current)
    {

        return current.getNextElement();
    }


    @Override
    public String toStringg(MyList listt) {

        String sum = "";

        for (int i=0; i<size; i++)
        {
            sum = sum.concat(valueOf(listt.getElementByIndex(i)));
        }

        return sum;
    }

    @Override
    public void clear(MyList listt) {

        firstNode.nextElement = lastNode;
        lastNode.prevElement = firstNode;

        size = 0;
    }

    @Override
    public Object[] toArray() {

        Node<E> target = firstNode.getNextElement();

        Object[] listElements = new Object[size];
        for (int i = 0; i < size; i++)
        {
            listElements[i] = target.getCurrentElement();
            target = getElement(target);
        }

        return listElements;
    }

    @Override
    public boolean contains(String string) {

        Node<E> target = firstNode.getNextElement();

        for (int i = 0; i < size; i++)
        {
           if ( valueOf(target.getCurrentElement()).equals(string) )
           {
                return true;
           }

            target = getElement(target);
        }

        return false;
    }

    @Override
    public boolean containsAll(MyList listt) {

        Node<E> target = firstNode.getNextElement();

        for (int i = 0; i < size; i++)
        {
            if ( !target.getCurrentElement().equals(listt.getElementByIndex(i)) )
            {
                return false;
            }

            target = getElement(target);
        }


        return true;
    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;
            @Override
            public boolean hasNext() {
                return (counter<size);
            }

            @Override
            public E next() {
                return getElementByIndex(counter++);
            }

        };
    }

    @Override
    public Iterator<E> descendingIterator() {
        return new Iterator<E>() {
            int counter = size -1;

            @Override
            public boolean hasNext() {
                return (counter >= 0);
            }

            @Override
            public E next() {
                return getElementByIndex(counter--);
            }
        };
    }


    /**
     * NODE
     */
    private class Node<E> implements Serializable {

        private E currentElement;
        private Node<E> nextElement;
        private Node<E> prevElement;

        private Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.prevElement = prevElement;
            this.nextElement = nextElement;

        }


        /**
         * getters
         */
        public E getCurrentElement() {
            return currentElement;
        }

        public Node<E> getPrevElement() {
            return prevElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        /**
         * setters
         */
        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public void setPrevElement(Node<E> prevElement) {
            this.prevElement = prevElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }
    }

}
