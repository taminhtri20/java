import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        phuongTrinhBac2 quadraticequation = new phuongTrinhBac2(a,b,c);
        if (quadraticequation.getDiscriminant()>0){
            System.out.println("The equetion has two roots "+quadraticequation.getRoot1()+" and "+quadraticequation.getRoot2());
        } else if (quadraticequation.getDiscriminant()==0) {
            System.out.println("The equetion has one root "+quadraticequation.getRoot1());
        } else if (quadraticequation.getDiscriminant()<0) {
            System.out.println("The equetion has no real root");
        }
    }
}
class phuongTrinhBac2{
   private double a,b,c;
   public phuongTrinhBac2(){}
   public phuongTrinhBac2(double a,double b,double c){
       this.a=a;
       this.b=b;
       this.c=c;
   }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
       return (b*b)-(4*a*c);
    }
    public double getRoot1(){
       return (-b+Math.pow((b*b)-(4*a*c),0.5))/(2*a);
    }
    public double getRoot2(){
        return (-b-Math.pow((b*b)-(4*a*c),0.5))/(2*a);
    }
}
