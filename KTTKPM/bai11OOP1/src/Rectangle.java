public class Rectangle extends Shape{
    protected double width,length;

    public Rectangle(boolean filled, String color, double width, double length) {
        super(filled, color);
        this.width = width;
        this.length = length;
    }


    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }
    public  String toString(){
        return "-----------------------\n" +"Width : "+String.format("%.2f",this.width)+"\n"+"Length : "+String.format("%.2f",this.length)+"\nColor : "+this.color
                +"\nFiller : "+this.filled+"\nPerimeter : "+String.format("%.2f",this.getPerimeter())+"\nArea : "+String.format("%.2f",this.getArea())+
                "\n-----------------------\n";
    }
}
