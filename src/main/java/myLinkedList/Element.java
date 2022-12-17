package myLinkedList;

public class Element <T>{

    private T element;
    private Element <T> preverios;
    private Element <T> next;

    public Element(){}

    public Element(T element) { this.element = element; }

    Element<T> getPreverios() {
       return this.preverios;
    }

    void setPreverios(Element element) {
         this.preverios = element;
    }

    Element<T> getNext() {
        return this.next;
    }

    void setNext(Element element) {
        this.next = element;
    }

    T getElement() {
        return this.element;
    }

    void setElement(T element) {
        this.element = element;
    }
}
