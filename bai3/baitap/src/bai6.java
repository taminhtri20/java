import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = {
                {0,0,0,0,0,},
                {0,0,0,0,0,}
        };
        System.out.println("nhap mang gia tri: ");
        for (int row = 0 ; row<array.length;row++){
            for (int colum = 0;colum<array[row].length;colum++){
                array[row][colum]=scanner.nextInt();
            }
        }
        System.out.print("nhap cot muon tinh (tinh tu 0): ");
        int x=scanner.nextInt();
        int sum=0;
        for (int row = 0 ; row<array.length;row++){
            for (int colum = 0;colum<array[row].length;colum++){
                if (x==colum){
                    sum+=array[row][colum];
                }
            }
        }
        System.out.println(sum);
    }
}
