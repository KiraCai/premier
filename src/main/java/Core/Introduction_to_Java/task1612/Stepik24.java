package src.main.java.Core.Introduction_to_Java.task1612;
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
        int[] myArray1 = {0, 1};
        int[] myArray2 = {1, 3, 5};

        int[] myArray3 = {1, 1, 2, 5};
        int[] myArray4 = {0, 4, 7, 8, 9};

        int[] myArray5 = { };
        int[] myArray6 = { };

        int[] myArray7 = {1};
        int[] myArray8 = { };

        int[] myArray9 = {2, 2, 2};
        int[] myArray10 = {2, 2, 2};

        int[] myArray11 = {0, 4, 7, 8, 9};
        int[] myArray12 = {1, 1, 2, 5};

        System.out.println(Arrays.toString(mergeArrays(myArray1, myArray2)));
        System.out.println(Arrays.toString(mergeArrays(myArray3, myArray4)));
        System.out.println(Arrays.toString(mergeArrays(myArray5, myArray6)));
        System.out.println(Arrays.toString(mergeArrays(myArray7, myArray8)));
        System.out.println(Arrays.toString(mergeArrays(myArray9, myArray10)));
        System.out.println(Arrays.toString(mergeArrays(myArray11, myArray12)));

    }
    public static int[] mergeArrays(int[] a1, int[] a2) {

        int lenA1 = a1.length;
        int lenA2 = a2.length;
        int[] myArraySort = new int[lenA1 + lenA2];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < lenA1 && j < lenA2){
            if ((a1[i] < a2[j]) & (i < lenA1)){
                myArraySort[k] = a1[i];
                i++;
                k++;
            } else {
                myArraySort[k] = a2[j];
                j++;
                k++;
            }
        }

        if (k < myArraySort.length-1){
            int lenTail = myArraySort.length-k;
            if (i == lenA1) {
                System.arraycopy(a2, j, myArraySort, k, lenTail);
            } else{
                System.arraycopy(a1, i, myArraySort, k, lenTail);
            }
        }
        return myArraySort;
    }
}

//Kira è scema :P
//Ti amo