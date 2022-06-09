abstract class Figure{
    double dim1;
    double dim2;
    Figure(double d1, double d2){
        dim1 = d1;
        dim2 = d2;
    }
    abstract double area();
}
class Rectangle extends Figure{
    Rectangle(double d1, double d2){
        super(d1,d2);
    }
    double area(){
        return dim1*dim2;
    }
}
class Triangle extends Figure{
    Triangle(double d1, double d2){
        super(d1, d2);
    }
    double area(){
        double d = 0.5*dim1*dim2;
        return d;
    }
}
public class Exp10 {
    public static void main(String arg[]){
        // Figure f = new Figure(10,10); // Error bcoz Figure class is abstract class
        Rectangle r = new Rectangle(9.0, 5.0);
        Triangle t = new Triangle(5.0, 6.0);
        Figure fref;
        fref = r;
        System.out.println("Area of Rectangle is : "+fref.area());
        fref = t;
        System.out.println("Area of Triangle is : "+fref.area());
    }
}
