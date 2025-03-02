class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Calculates the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Calculates the perimeter (circumference) of the circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}