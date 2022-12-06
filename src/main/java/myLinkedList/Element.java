package myLinkedList;

public class Element <T>{

    private T element;
    private int preverios;
    private int next;

     int getPreverios() {
       return this.preverios;
    }

    void setPreverios(int i) {
         this.preverios = i;
    }

    int getNext() {
        return this.next;
    }

    void setNext(int i) {
        this.next = i;
    }

    T getElement() {
        return this.element;
    }

    void setElement(T element) {
        this.element = element;
    }
}
