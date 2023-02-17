import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array ={0,0,0,0,0,0};
        System.out.println("Nhap mang so nguyen: ");
        for (int i=0 ; i< array.length;i++){
            array[i]=scanner.nextInt();
        }
        int min = array[0];
        for (int i =0; i< array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("gia tri nho nhat trong mang la: "+min);
    }
}
