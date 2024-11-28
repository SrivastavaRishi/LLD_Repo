package StructuralDesignPattern.Decorator;

public class MushroomDecorator extends PizzaDecorator{
    BasePizza basePizza;
    public MushroomDecorator(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    public int cost(){
        return basePizza.cost() + 70;
    }
}