package myLinkedList;

import java.io.Serializable;
import java.util.*;

public class LinkedElements<T> implements List<T> {

    Element<T> element;
    private Element<T> first;
    private Element<T> last;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        Element<T> newElement = new Element<>(t);
        if (first == null) {
            first = last = newElement;
        } else {
            last.setNext((Element) t);
            last = newElement;
        }
        size++;
        return true;

    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        Element<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return (T) current.getElement();
    }

    @Override
    public T set(int index, T element) {
        Objects.checkIndex(index, size);
        Element<T> setElement = (Element<T>) get(index);
        setElement.setElement(element);
        return setElement.getElement();
    }

    @Override
    public void add(int index, T element) {
        Objects.checkIndex(index, size + 1);
        Element<T> newElement = new Element<>(element);
        if (first == null) {
            first = last = newElement;
        } else if (index == 0) {
            newElement.setNext(first);
            first.setElement((T) newElement);
        } else if (index == size - 1) {
            last.setNext(newElement);
            last.setElement((T) newElement);
        } else {
            Element<T> current = first;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            newElement.setNext(current.getNext());
            current.setNext(newElement);
        }
        size++;
    }

    @Override
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T removedElement;
        if (index == 0) {
            removedElement = first.getElement();
            first = first.getNext();
            if (first == null) last = null;
        } else {
            Element<T> prev = (Element<T>) get(index - 1);
            removedElement = prev.getNext().getElement();
            prev.setNext(prev.getNext().getNext());

            if (index == size - 1) {
                last = prev;

            }
        }
        size--;
        return removedElement;

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
