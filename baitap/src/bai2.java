import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so tien muon doi(USD):");
        double money = scanner.nextDouble();
        double changemoney = money * 23000;
        System.out.println("so tien doi duoc la:" +changemoney);
    }
}
