import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        String chuoi = "truong dai hoc thanh do";
        char kyTu ;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ky tu: ");
//        chuoi = scanner.nextLine();
        kyTu = scanner.next().charAt(0);
        // duyệt từ đầu đến cuối chuỗi
        for (int i = 0; i < chuoi.length(); i++) {
            // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
            if (kyTu == chuoi.charAt(i)) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                " trong chuỗi " + chuoi + " = " + count);
    }
}
