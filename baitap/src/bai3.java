import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so:");
        int number = scanner.nextInt();
        int lastnumber = number % 10;
        int n = number / 10;
        int secondnumber = n % 10;
        int firstnumber = number / 100;
        if(number<0 || number>999){
            System.out.println("try again");
        }else {
            String first[] = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
            String second[] = {"","ten","twenty","thirdty","fourty","fifty","sixty","seventy","eighty","ninety"};
            String last [] = {"hundred"};
            if (number<20){
                System.out.println(first[number]);
            } else if (number<100) {
                System.out.println(second[secondnumber] +" "+ first[lastnumber] );
            } else if (number<1000) {
                System.out.println(first[firstnumber] +" "+ last[0] +" "+ second[secondnumber] +" "+ first[lastnumber]);
            }
        }
    }
}
