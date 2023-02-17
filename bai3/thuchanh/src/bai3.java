import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int size ;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhap so gia tri: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("khong nhap qua 20");
            }
        }while (size>20);
        array = new int[size];
        int i = 0;
        while (i< array.length){
            System.out.print("nhap gia tri "+(i+1)+": ");
            array[i] =scanner.nextInt();
            i++;
        }
        for (int j=0 ; j< array.length;j++){
            System.out.print(array[j]+" ");
        }
        int max = array[0];
        for (int x =0 ; x<array.length;x++){
            if (array[x]>max){
                max = array[x];
            }
        }
        System.out.println("so lon nhat la: "+max);
    }
}
