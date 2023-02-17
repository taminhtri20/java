import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] number = {
                          {0,0,0,0,0},
                          {0,0,0,0,0},
                         };
        int max = number[0][0];
        int x=0;
        int y=0;
        System.out.println("nhap ma tran: ");
        for (int row=0; row<number.length ; row++){
            for (int colum=0; colum<number[row].length;colum++){
                number[row][colum]=scanner.nextInt();
            }
        }
        for (int row=0; row<number.length ; row++){
            for (int colum=0; colum<number[row].length;colum++){
                if (number[row][colum]>max){
                    max=number[row][colum];
                    x=row+1;
                    y=colum+1;
                }
            }
        }
        System.out.println("phan tu lon nhat la: "+max+" o toa do x: "+x+" va toa do: "+y);
    }
}
