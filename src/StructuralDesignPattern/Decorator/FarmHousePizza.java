package StructuralDesignPattern.Decorator;

public class FarmHousePizza extends BasePizza {
    // String desc;
    FarmHousePizza(){
        System.out.println("FarmHouse pizza creating !!");
        // this.desc = desc;
    }
    public int cost(){
        return 180;
    }
    // public String getDescription(){
    //     return desc;
    // }
}
