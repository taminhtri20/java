import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as ' a * x + b = c ' , please enter constants :  ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a : ");
        double a = scanner.nextDouble();

        System.out.print("b : ");
        double b = scanner.nextDouble();

        System.out.print("c : ");
        double c = scanner.nextDouble();

        if(a != 0){
            double answer = (c - b)/a;
            System.out.printf("phuong trinh co nghiem x = " +answer);}
        else{
            if(b==c){
                System.out.print("x co vo so nghiem");
            }else{
                System.out.print("khong co nghiem");
            }
        }

    }
}
