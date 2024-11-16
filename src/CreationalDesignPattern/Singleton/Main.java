package CreationalDesignPattern.Singleton;


class SingletonClass{
    int a;
    SingletonClass(){
        System.out.println("Singleton class created !!");
    }
    public void print(){
        System.out.println("Value of a is " + a);
    }
}

public class Main {
    public static void main(String[] args) {
        SingletonClass sc = new SingletonClass();
        sc.print();
    }
}
