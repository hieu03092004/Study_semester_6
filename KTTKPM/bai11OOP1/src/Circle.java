public class Circle extends Shape{
    private double radius;

    public Circle(boolean filled, String color, double radius) {
        super(filled, color);
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }
    public String toString(){
        return "-----------------------\n"+"Radius : "+String.format("%.2f",this.radius)+"\nColor : "+this.color+"\nfilled : "+this.filled+"\nPerimeter : "+String.format("%.2f",getPerimeter())+"\nArea : "+String.format("%.2f",getArea())+"\n-----------------------\n";
    }
}
