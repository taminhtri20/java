import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] value ={1,2,3,4,5,6,7,8,9,10};
        System.out.print("nhap gia tri muon xoa: ");
        int x = scanner.nextInt();
        for (int i=0;i<value.length;i++){
            if (value[i]==x){
                System.out.println("gia tri can xoa "+value[i]+" o vi tri thu: "+(i+1));
            }
        }
        for (int j=0;j< value.length;j++){
            if (value[j]!=x){
                System.out.print(value[j]+" ");
            }
        }
    }
}
