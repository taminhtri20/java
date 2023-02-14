public class bai3 {
    public static void main(String[] args) {
        for (int i =1 ; i<101 ;i++){
            if (checkNumber(i)){
                System.out.print(" "+i);
            }
        }
    }
    public static boolean checkNumber(int n){
        if (n<2){
            return false;
        }
        int squareroot = (int) Math.sqrt(n);
        for (int i = 2 ; i<=squareroot ; i++){
            if (n%i==0){
                return false;
            }
        }return true;
    }
}
