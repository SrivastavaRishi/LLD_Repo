package CreationalDesignPattern.FactoryDesingPattern;

public class Square implements Shape {
    float side;

    public void draw() {
        System.out.println("Square is being drawn");
    }

    public float area() {
        float area = side * side;
        System.out.println("Area of circle is " + area);
        return area;
    }
}
