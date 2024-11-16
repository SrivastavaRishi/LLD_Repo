package CreationalDesignPattern.FactoryDesingPattern;

public class Circle implements Shape {
    float radius;

    public void draw() {
        System.out.println("Circle is being drawn");
    }

    public float area() {
        float area = 22 / 7 * radius * radius;
        System.out.println("Area of circle is " + area);
        return area;
    }
}
