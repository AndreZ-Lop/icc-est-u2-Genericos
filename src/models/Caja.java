package models;

public class Caja <T>  {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    } 

    public boolean isEmpty(){
        return this.t == null;
    }
    @Override
    public String toString(){
        return "" + t;
    }
}
