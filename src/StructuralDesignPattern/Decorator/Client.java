package StructuralDesignPattern.Decorator;

public class Client {
    public static void main(String[] args) {
        BasePizza myPizza = new MargeritaPizza();
        System.out.println(myPizza.cost());
        BasePizza firstToppping = new PaneerDecorator(myPizza);
        System.out.println(firstToppping.cost());
        BasePizza secondTopping = new MushroomDecorator(firstToppping);
        System.out.println(secondTopping.cost());
    }

}
