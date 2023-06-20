package Zajecia3.Generic;

public class Pair<T,E> {

    private T first;
    private E second;

    public Pair(T first, E second) {
        this.first = first;
        this.second = second;
    }

    public T first(){
        return first;
    }

    public E second(){
        return second;
    }
}
