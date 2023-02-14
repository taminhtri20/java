import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = scanner.nextInt();
        System.out.println(n + " so nguyen to dau tien la:");
        int dem = 0;
        int i = 2;
        while (dem<n){
            if (checkNumber(i)){
                System.out.print(i+" ");
                dem++;
            }
            i++;
        }
    }
    public static boolean checkNumber(int n){
        if (n<2){
            return false;
        }
        int squareroot =(int) Math.sqrt(n);
        for (int i = 2 ; i<=squareroot ; i++){
            if (n%i==0){
                return false;
            }
        }return true;
    }
}

