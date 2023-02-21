public class bai2 {
    public static void main(String[] args) {
        int[] array = {8,6,123,33,65};
        int index = minValue(array);
        System.out.println("The smallest element in the array is: "+array[index]);
    }
    public static int minValue(int[] array){
        int index= 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
