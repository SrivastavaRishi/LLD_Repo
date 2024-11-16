class Demo{
    int a;
    Demo(int a){
        this.a = a;
    }
}

public class Main {
    public static void main(String[] args) {
        Demo v1 = new Demo(5);
        Demo v2 = new Demo(3);

        System.out.println(v1.a);
        System.out.println(v2.a);

        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}