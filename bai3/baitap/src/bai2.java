import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] value ={1,2,3,4,5,6,7,8,9,10};
        System.out.print("nhap gia tri muon them: ");
        int x = scanner.nextInt();
        System.out.print("vi tri them: ");
        int index = scanner.nextInt();
        if (index<0 || index >value.length){
            System.out.println("try again");
        }
        int[] arrNew = new int[value.length + 1];
        for (int i=0, j=0 ; i<arrNew.length;i++, j++){
            if (index==i+1){
                arrNew[i] = x;
                j--;
            } else {
                arrNew[i] = value[j];
            }
            System.out.print(arrNew[i]+" ");
        }
    }
}
