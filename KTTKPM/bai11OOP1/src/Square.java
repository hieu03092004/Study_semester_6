public class Square extends Rectangle {

    public Square(boolean filled, String color, double width, double length) {
        super(filled, color, width, length);
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
        return "-----------------------\n" +"Side : "+String.format("%.2f",this.width)+"\nColor : "+this.color
                +"\nFiller : "+this.filled+"\nPerimeter : "+String.format("%.2f",this.getPerimeter())+"\nArea : "+String.format("%.2f",this.getArea())+
                "\n-----------------------\n";
    }
}
