import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so");
        int number = scanner.nextInt();
        if(number<2){
            System.out.println("try again");
        }else {
            boolean check = true;
            int i =2;
            while (i<=Math.sqrt(number)){
                if (number % i==0) {
                    check = false;
                    break;
                }i++;
            }
            if (check){
                System.out.println("la so nguyen to");
            }else {
                System.out.println("khong phai la so nguyen to");
            }
        }
    }
}
