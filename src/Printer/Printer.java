package Printer;

public class Printer<T> {
    T thing;

    public Printer(T thing) {
        this.thing = thing;
    }

    public void print(){
        System.out.println(thing);
    }
}
