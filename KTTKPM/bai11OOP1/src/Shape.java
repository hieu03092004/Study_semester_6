abstract class Shape {
    protected String color="red";
    protected boolean filled=true;
    public Shape(){

    }
    public Shape(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public  boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double getArea();
    public  abstract double getPerimeter();
}
