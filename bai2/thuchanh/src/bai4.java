import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("so tien vay: ");
        int tien = scanner.nextInt();
        System.out.print("ti le lai(%/nam): ");
        Double lai = scanner.nextDouble();
        System.out.print("so thang vay: ");
        int thang = scanner.nextInt();
        Double tienlai;

        tienlai = tien * (lai/100)/12 *thang;
        System.out.println("so tien tra sau "+thang+"thang la: "+tienlai);
    }
}
