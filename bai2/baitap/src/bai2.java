import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int choice = -1;
        int k =0;
        Scanner scanner = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle ");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i=1 ; i<4 ; i++){
                        for (int j=1 ; j<8 ; j++){
                            System.out.print("* ");
                        }
                        System.out.println("*");
                    }
                    break;
                case 2:
                    System.out.println("botton-left: ");
                    for (int i =1 ; i<6 ; i++){
                        for (int j = 1 ; j<=i ; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    System.out.println("top-left: ");
                    for (int i=1 ; i<6;i++){
                        for (int j=5;j>=i;j--){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    System.out.println("botton-right: ");
                    for (int i=1 ; i<6 ;i++,k=0){
                        for (int j=5;j>=i;j--){
                            System.out.print("  ");
                        }
                        for (int z=1;z<i+1;z++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    System.out.println("top-right: ");
                    for (int i =1 ;i<6;i++){
                        for(int j=2;j<i+1;j++){
                            System.out.print("  ");
                        }
                        for (int z=6;z>i;z--){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i=1 ; i<=5 ; i++){
                        for (int j=5 ; j>i ; j--){
                            System.out.print("  ");
                        }
                        for (int z=1;z<i+1;z++){
                            System.out.print(" *  ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }

}
