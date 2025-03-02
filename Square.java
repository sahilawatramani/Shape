class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    // Calculates the area of the square
    public double calculateArea() {
        return side * side;
    }

    // Calculates the perimeter of the square
    public double calculatePerimeter() {
        return 4 * side;
    }
}