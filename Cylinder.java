class Cylinder extends Shape {
    private double radius, height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    // Calculates the surface area of the cylinder
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Calculates the perimeter (circumference of the base) of the cylinder
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Calculates the volume of the cylinder
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}