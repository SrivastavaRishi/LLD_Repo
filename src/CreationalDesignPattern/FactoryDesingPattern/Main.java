package CreationalDesignPattern.FactoryDesingPattern;

public class Main {
public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();
    Shape sqShape = shapeFactory.getShape("SQUARE");
    Shape cirShape = shapeFactory.getShape("CIRCLE");
    sqShape.draw();
    cirShape.draw();
}
}
