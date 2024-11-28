package StructuralDesignPattern.Decorator;

public class PaneerDecorator extends PizzaDecorator{
    BasePizza basePizza;
    public PaneerDecorator(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    public int cost(){
        return basePizza.cost() + 50;
    }
}
