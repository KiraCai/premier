package src.main.java.Core;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/*
 * Merges two given sorted arrays into one
 *
 * @param a1 first sorted array
 * @param a2 second sorted array
 * @return new array containing all elements from a1 and a2, sorted
 */
public class Stepik24 {

    public static void main(String[] args){
        int[] myArray1 = {0, 1};
        int[] myArray2 = {1, 3, 5};

        int[] myArray3 = {1, 1, 2, 5};
        int[] myArray4 = {0, 4, 7, 8, 9};
        System.out.println(mergeArrays(myArray1, myArray2));
        System.out.println(mergeArrays(myArray3, myArray4));
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {

        int lenA1 = a1.length;
        int lenA2 = a2.length;
        int[] myArraySort = new int[lenA1 + lenA2];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i< a1.length+1 || j < a2.length+1){
            if ((a1[i]<a2[j]) & (i<a1.length)){
                myArraySort[k] = a1[i];
                i++;
                k++;
            }
            else {
                myArraySort[k] = a2[j];
                j++;
                k++;
            }
        }




        System.out.println(Arrays.toString(myArraySort));
        return myArraySort;
    }
}

//Kira è scema :P
//Ti amo