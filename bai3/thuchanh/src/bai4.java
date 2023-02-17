import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int size;
        int[] array;
        int count=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhap so hoc sinh: ");
            size=scanner.nextInt();
            if (size>30){
                System.out.print("khong dc vuot qua 30");
            }
        }while (size>30);
        array = new int[size];
        int i = 0;
        while (i< array.length){
            System.out.print("dien so diem cua hoc sinh "+(i+1)+": ");
            array[i]=scanner.nextInt();
            i++;
        }
        for (i=0;i< array.length;i++){
            if (array[i]>=5 && array[i]<=10){
                count++;
            }
        }
        System.out.print("so hoc sinh do la: "+count);
    }
}
