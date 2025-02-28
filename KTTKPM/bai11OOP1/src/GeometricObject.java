abstract class GeometricObject {
    private  String color;
    private boolean filled;

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract  double getArea();
    public abstract  double getPerimeter();

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
}
