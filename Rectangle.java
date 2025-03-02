class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    // Calculates the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Calculates the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}