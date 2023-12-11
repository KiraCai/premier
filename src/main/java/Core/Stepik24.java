package src.main.java.Core;
import java.util.Arrays;

/*
 * Merges two given sorted arrays into one
 *
 * @param a1 first sorted array
 * @param a2 second sorted array
 * @return new array containing all elements from a1 and a2, sorted
 */
public class Stepik24 {

    public static void main(String[] args){
        int[] myArray1 = {0, 2, 2};
        int[] myArray2 = {1, 3};
        System.out.println(mergeArrays(myArray1, myArray2));
    }
    public static int[] mergeArrays(int[] a1, int[] a2){
        int[] myArray3 = new int[a1.length+a2.length];
        myArray3 = Arrays.copyOf(a1, a1.length + a2.length);
        System.arraycopy(a1, 0, myArray3, 0, a1.length);
        System.arraycopy(a2, 0, myArray3, a1.length, a2.length);
        //String.join("", myArray3);
        for (int j = 1; j<myArray3.length; j++){
            if myArray3[j]
        }
        System.out.println(Arrays.toString(myArray3));

        return myArray3;
    }
}