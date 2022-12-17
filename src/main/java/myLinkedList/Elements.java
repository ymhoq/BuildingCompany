package myLinkedList;

public class Elements {

    private Elements() {
    }

    public static <T> Element<T> create(T element) {
        return new Element<>(element);
    }

    public static <T> void link(Element<T> first, Element<T> second) {
        first.setNext(second);
    }

    public static <T> Element<T> pairOf(T first, T second) {
        Element<T> firstElement = new Element<>(first);
        Element<T> secondElement = new Element<>(second);
        firstElement.setNext(secondElement);
        return firstElement;
    }

    public static <T> Element<T> chainOf(T... elements) {
         Element<T> first = new Element<>(elements[0]);
         Element<T> current = first;
        for (int i = 1; i< elements.length; i++) {
            current.setNext(new Element<>(elements[i]));
        }
        return first;
    }
}
