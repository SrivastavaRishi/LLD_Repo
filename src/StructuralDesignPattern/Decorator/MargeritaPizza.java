package StructuralDesignPattern.Decorator;

public class MargeritaPizza extends BasePizza {
    // String desc;
    MargeritaPizza(){
        System.out.println("Margerita pizza creating !!");
        // this.desc = desc;
    }
    public int cost(){
        return 150;
    }
    // public String getDescription(){
    //     return desc;
    // }
}
