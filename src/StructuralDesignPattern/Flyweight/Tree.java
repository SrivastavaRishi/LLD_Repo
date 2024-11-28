package StructuralDesignPattern.Flyweight;

public class Tree {
    //Flyweight object 
    // intrinsic
    private final String color;
    private final int height;

    public Tree(String color) {
        this.color = color;
        this.height = 6;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }
}

