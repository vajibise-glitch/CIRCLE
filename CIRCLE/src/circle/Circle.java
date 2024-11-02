package circle;

public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
        this.radius = 1.0; // Default radius
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Circle) {
            Circle otherCircle = (Circle) obj;
            return this.radius == otherCircle.radius;
        }
        return false;
    }

    @Override
    public int compareTo(Circle otherCircle) {
        return Double.compare(this.radius, otherCircle.radius);
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }

    // Main method for testing
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(5.0);
        Circle circle3 = new Circle(3.0);

        // Testing equals method
        System.out.println("circle1 equals circle2: " + circle1.equals(circle2)); // true
        System.out.println("circle1 equals circle3: " + circle1.equals(circle3)); // false

        // Testing compareTo method
        System.out.println("circle1 compareTo circle3: " + circle1.compareTo(circle3)); // > 0
        System.out.println("circle3 compareTo circle1: " + circle3.compareTo(circle1)); // < 0
    }
}