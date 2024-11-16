package CreationalDesignPattern.FactoryDesingPattern;

public class ShapeFactory {
    Shape getShape(String input) {
        switch (input) {
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
        }
        return new Circle();
    }
}
