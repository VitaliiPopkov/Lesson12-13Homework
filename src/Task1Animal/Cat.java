package Task1Animal;

public class Cat extends Animal{
    public void voice(){
        System.out.println("I sey meow");
    }

    @Override
    public void move() {
        System.out.println("I walk on cat paws");
    }

    @Override
    public void fun() {
        System.out.println("I chase mice");

    }

}
