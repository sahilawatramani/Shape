abstract class Shape {
    protected String shapeName;

    // Constructor to initialize shape name
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Abstract methods to be implemented by subclasses
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    
    // Default implementation for volume (for 2D shapes)
    public double calculateVolume() {
        return 0;
    }
}
