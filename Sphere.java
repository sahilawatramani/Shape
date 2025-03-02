class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    // Calculates the surface area of the sphere
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    // Perimeter is not applicable to a sphere, returns 0
    public double calculatePerimeter() {
        return 0;
    }

    // Calculates the volume of the sphere
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }
}
