import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        String[] name = {"","abc","bca","bcd","acb","bdc","tri"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten hoc sinh:");
        String nhapten = scanner.nextLine();
        boolean isExit = false;
        for (int i = 1 ; i< name.length ; i++){
            if (name[i].equals(nhapten)){
                System.out.println("so thu tu hoc sinh "+nhapten+" la: "+i);
                isExit = true;
                break;
            }
        }
            if (!isExit){
                System.out.println("khong ton tai hoc sinh "+nhapten);
            }
    }
}
