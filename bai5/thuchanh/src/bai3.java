public class bai3 {
    double radius,area;
    String color;
    public bai3(){
    }
    public bai3(double radius, String color,double area){
        this.color=color;
        this.radius=radius;
        this.area=area;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
