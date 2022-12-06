package myLinkedList;

import java.util.ArrayList;

public class MyLinkedList <T> implements IPlussable{

    private ArrayList <Element> elementArrayList;
    private  ArrayList<T> itemList;
    private ArrayList<Integer> refPreList;
    private ArrayList<Integer> refNextList;
    private ArrayList<Integer> placeInItemList;
    private ArrayList<Integer> placeInRefList;
    private T nextItem;
    private T previriosItem;
    private T firstItem;
    private T lastItem;

    public MyLinkedList () {
        elementArrayList = new ArrayList<>();
        itemList = new ArrayList<T>();
        refPreList = new ArrayList<Integer>();
        refNextList = new ArrayList<Integer>();
        placeInItemList = new ArrayList<Integer>();
    }



    @Override
    public void add(Object item) {

        getItemList().add(((T) item));
        if (this.getItemList().size()>1) {
            refPreList.add(getItemList().size()-1);
                    refNextList.add(getItemList().size());
                          placeInItemList.add(getItemList().size()-1);
                          placeInRefList.add(getItemList().size()-1);
        }
    }

    @Override
    public boolean remove(int index) {
        int refPlaceIndex;
        refPlaceIndex = getPlaceInRefList().get(index);
        getItemList().remove(index);
        refPreList.remove(refPlaceIndex);
        refNextList.remove(refPlaceIndex);
        getPlaceInItemList().remove(refPlaceIndex);
        refPreList.set(refPlaceIndex-1,refPlaceIndex+1);
        refNextList.set(refPlaceIndex+1,refPlaceIndex-1);

        return true;
    }

    @Override
    public Object get(int index) {
        return getItemList().get(index);
    }

    @Override
    public boolean input(int index, Object item) {
      if(itemList.size()>1)
        itemList.add((T) item);


        placeInRefList.set(itemList.size()-1, index);
        placeInItemList.set(index, itemList.size()-1);
        // замена ссылок у соседних элементов
        refNextList.set(index-1,index);
        refPreList.set(index+1, index);

        refNextList.set(index-1,index);
        refPreList.set(index+1, index);


        return true;
    }

    public ArrayList<T> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<T> itemList) {
        this.itemList = itemList;
    }

    public ArrayList<Integer> getRefPreList() {
        return refPreList;
    }

    public void setRefPreList(ArrayList<Integer> refPreList) {
        this.refPreList = refPreList;
    }

    public ArrayList<Integer> getRefNextList() {
        return refNextList;
    }

    public void setRefNextList(ArrayList<Integer> refNextList) {
        this.refNextList = refNextList;
    }

    public ArrayList<Integer> getPlaceInItemList() {
        return placeInItemList;
    }

    public void setPlaceInItemList(ArrayList<Integer> placeInItemList) {
        this.placeInItemList = placeInItemList;
    }

    public ArrayList<Integer> getPlaceInRefList() {
        return placeInRefList;
    }

    public void setPlaceInRefList(ArrayList<Integer> placeInRefList) {
        this.placeInRefList = placeInRefList;
    }
}
