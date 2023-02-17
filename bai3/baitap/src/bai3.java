import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = {0,0,0,0,0};
        System.out.println("nhap mang 1: ");
        for (int i=0; i< array1.length;i++){
            array1[i]=scanner.nextInt();
        };
        int[] array2 = {0,0,0,0,0};
        System.out.println("nhap mang 2: ");
        for (int i=0; i< array2.length;i++){
            array2[i]=scanner.nextInt();
        };
        int[] array3 = {0,0,0,0,0,0,0,0,0,0,};
        for (int i=0;i<array1.length;i++){
            array3[i]=array1[i];
        }
        for (int i=(array1.length),j=0;i<array3.length;i++,j++){
            array3[i]=array2[j];
        }
        System.out.print("mang 3 gom: ");
        for (int i=0; i<10;i++) {
            System.out.print(array3[i]+" ");
        }
    }
}
