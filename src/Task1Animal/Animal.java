package Task1Animal;

public abstract class Animal {
    public void breath() {
        System.out.println("I need oxygen");
    }
    public void sleep() {
        System.out.println("I need to sleep");
    }
    public void eat() {
        System.out.println("I need to eat");
    }
    public abstract void voice();
    public abstract void move();
    public abstract void fun();


}
