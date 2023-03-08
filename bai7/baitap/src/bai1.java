public class bai1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getRadius();
        circle.getArea();
    }
}
class Circle{
    private double radius = 1.0;
    private String color = "red";
    public Circle(){}
    public Circle(double radius){
        this.radius=radius;
    }
    protected void getRadius(){
        System.out.println("Radius: "+radius);
    }
    public void getArea(){
        System.out.println("Area: "+(Math.PI*radius*radius));
    }
}
