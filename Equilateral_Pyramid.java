class EquilateralPyramid extends Shape {
    private double baseSide, height;

    public EquilateralPyramid(double baseSide, double height) {
        super("Equilateral Pyramid");
        this.baseSide = baseSide;
        this.height = height;
    }

    // Calculates the surface area of the equilateral pyramid
    public double calculateArea() {
        double baseArea = baseSide * baseSide;
        double slantHeight = Math.sqrt((baseSide / 2) * (baseSide / 2) + height * height);
        double lateralArea = 2 * baseSide * slantHeight;
        return baseArea + lateralArea;
    }

    // Calculates the perimeter of the base of the pyramid
    public double calculatePerimeter() {
        return 4 * baseSide;
    }

    // Calculates the volume of the equilateral pyramid
    public double calculateVolume() {
        return (1.0 / 3) * (baseSide * baseSide) * height;
    }
}