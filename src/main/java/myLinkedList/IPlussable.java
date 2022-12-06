package myLinkedList;

public interface IPlussable <T>{
    void add(T item);
    boolean remove(int index);
    T get(int index);
    boolean input(int index, T item);


}
