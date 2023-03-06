public class bai1 {
    int width,height,area,perimeter;
    public bai1(){}
    public bai1(int width, int height, int area, int perimeter){
        this.width=width;
        this.height=height;
        this.area=area;
        this.perimeter=perimeter;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public int getArea() {
        return width*height;
    }
    public int getPerimeter() {
        return (width+height)*2;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
    public static void main(String[] args) {
        bai1 rectangle = new bai1();
        rectangle.setWidth(20);
        rectangle.setHeight(10);
        System.out.println("chieu rong: "+rectangle.getWidth()+" chieu dai: "+rectangle.getHeight());
        System.out.print("chu vi: "+rectangle.getPerimeter()+" dien tich: "+rectangle.getArea());
    }
}
