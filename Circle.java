/**
 * Created by 7 on 02.04.2016.
 */
public class Circle {
    private int radius;

    public Circle(){
        this.radius = 10;
    }

    public Circle(int radius){
        this.radius = radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return this.radius;
    }

    public double getArea(){
        return (Math.pow(this.radius, 2) * 3.14);
    }

    public static void main(String[] args){
        Circle circle = new Circle();
        circle.setRadius(9);
        System.out.print("Circle area: " + circle.getArea());
    }
}
