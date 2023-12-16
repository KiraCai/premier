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
        int[] myArray1 = {0, 2, 2};
        int[] myArray2 = {1, 3};
        System.out.println(mergeArrays(myArray1, myArray2));
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {

        int lenA1 = a1.length;
        int lenA2 = a2.length;
        int[] myArraySort = new int[lenA1 + lenA2];

        int k = 0;
        int i = 0;
        int j = 0;
        while(i< lenA1 | j < lenA2){
            if(a1[i] <= a2[j]){
                myArraySort[k] = a1[i];
                i++;
                if (i == lenA1){
                    i--;
                } else if (i>lenA1) {
                    break;
                }
                else{
                    System.out.println("ничего не произошло");
                }
            }
            else {
                myArraySort[k] = a2[j];
                j++;
                if (j == lenA2){
                    j--;
                } else if (j>lenA2) {
                    break;
                }
                else {
                    System.out.println("ничего не произошло 2");
                }
            }
            k++;

        }


        /*int i = 0;
        int a = i;
        int b = i;
        while (i <= myArraySort.length/2) {

            if (a1[a] <= a2[b]) {
                myArraySort[i] = a1[a];
                a = a +1;
                b = i;
            } else {
                myArraySort[i] = a2[b];
                b = b +1;
                a = i;
            }
            i++;
        }
        var indexMidi =  (myArraySort.length/2)+1;
        int k = 0;
        a = k;
        b = k;
        while (k <= myArraySort.length/2-1) {

            if (a1[a] <= a2[b]) {
                myArraySort[indexMidi] = a1[a];
                a = a +1;
                b = k;
            } else {
                myArraySort[indexMidi] = a2[b];
                b = b +1;
                a = k;
            }
            indexMidi++;
            k++;
            }
         */

        System.out.println(Arrays.toString(myArraySort));
        return myArraySort;
    }

}

//Kira è scema :P
//Ti amo