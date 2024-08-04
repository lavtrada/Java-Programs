//Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle
class Circle{
    double radius;
    public void setradius(double radius){
        this.radius=radius;
    }
    public double getradius()
    {
        return 3.14*radius;
    }
}
public class P5
{
    public static void main(String[] args) {
        Circle sc=new Circle();
        sc.setradius(5);
        System.out.println(sc.getradius());
    }
}