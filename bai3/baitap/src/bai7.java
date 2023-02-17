import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        System.out.println("nhap ma tran vuong: ");
        for (int row=0; row<array.length;row++){
            for (int colum=0; colum<array[row].length;colum++){
                array[row][colum]=scanner.nextInt();
            }
        }
        int sum =0;
        for (int i=0;i<array.length;i++){
            sum+=array[i][i];
        }
        System.out.println("tong ma tran duong cheo la: "+sum);
    }
}
