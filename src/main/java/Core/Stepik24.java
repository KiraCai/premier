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

        int[] myArray3 = {1, 1, 1, 1};
        int[] myArray4 = {3 , 3, 3, 3};
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
        if (myArraySort.length % 2 != 0) {
            while (i < lenA1 | j < lenA2) {
                if (a1[i] <= a2[j]) {
                    myArraySort[k] = a1[i];
                    i++;
                    if (i == lenA1) {
                        myArraySort[k + 1] = a2[j];
                        break;
                    } else if (i > lenA1) {
                        break;
                    } else {
                    }
                } else {
                    myArraySort[k] = a2[j];
                    j++;

                    if (j == lenA2) {
                        myArraySort[k + 1] = a1[i];
                        break;
                    } else if (j > lenA2) {
                        break;
                    } else {
                    }
                }
                k++;
            }
        } else {
            while (i < lenA1 | j < lenA2) {
                if (a1[i] <= a2[j]) {
                    if(myArraySort.length ==2){
                        myArraySort[k] = a1[i];
                        myArraySort[k+1] = a2[j];
                    }

                    if (k == myArraySort.length - 2) {
                        myArraySort[k + 1] = a2[j];
                        break;
                    }
                    if (k == i && i == a1.length-1){
                        myArraySort[k] = a1[i];
                        i = a1.length-2;
                        k++;
                        continue;
                    }
                    if (a1.length == i+1 && k < myArraySort.length - 2){
                        myArraySort[k+1] = a2[j];
                        j++;
                        k++;
                        continue;
                    }
                    myArraySort[k] = a1[i];
                    i++;
                    if (i == lenA1) {

                        if (k == myArraySort.length - 2) {
                            myArraySort[k + 1] = a2[j];
                            break;
                        } else {
                            myArraySort[k + 1] = a2[j];
                            i--;
                            k++;
                            j++;
                            continue;

                        }
                    }
                } else {
                    if(myArraySort.length ==2){
                        myArraySort[k] = a2[j];
                        myArraySort[k+1] = a1[i];
                        break;
                    }
                    if (k == myArraySort.length - 2) {
                        myArraySort[k + 1] = a1[i];
                        break;
                    }
                    myArraySort[k] = a2[j];
                    j++;
                    if (j == lenA2) {

                        if (k == myArraySort.length - 2) {
                            myArraySort[k + 1] = a1[i];
                            break;
                        } else {
                            myArraySort[k + 1] = a1[i];
                            j--;
                            k++;
                            i++;
                            continue;
                        }
                    } else if (j > lenA2) {
                        break;
                    }
                }
                k++;
            }
        }
        System.out.println(Arrays.toString(myArraySort));
        return myArraySort;
    }
}

//Kira è scema :P
//Ti amo