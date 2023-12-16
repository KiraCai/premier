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

        /*
        другой способ который не работает спижен
        Integer [] integerArray1 = IntStream.of(a1).boxed().toArray(Integer []::new);
        Integer [] integerArray2 = IntStream.of(a2).boxed().toArray(Integer []::new);
        List<Integer> listA1 = Arrays.asList(integerArray1);
        List<Integer> listA2 = Arrays.asList(integerArray2);
        System.out.println(listA2 instanceof List);
         */
        List<Integer> listA1 = new ArrayList<Integer>();

        for (int g = 0; g < a1.length; g++) {
            listA1.add(a1[g]);
        }
        List<Integer> listA2 = new ArrayList<Integer>();
        for (int f = 0; f < a2.length; f++) {
            listA2.add(a2[f]);
        }

        int i = 0;
        while (i <= myArraySort.length - 2) {
            System.out.println("итерация" + i);
            int a11 = listA1.get(i);
            int a22 = listA2.get(i);
            int limit = (myArraySort.length) - 2;
            //System.out.println(limit);
            if ( i == limit){
                if (a11 > a22) {
                    myArraySort[i] = a11;
                } else {
                    System.out.println("вошло");
                    myArraySort[i] = a22;
                    System.out.println(myArraySort[i]);
                }

            }

            if (a11 <= a22) {
                myArraySort[i] = a11;
                listA2.add(0, 0);
            } else {
                myArraySort[i] = a22;
                listA1.add(0, 0);
            }
            i++;
        }

        //myArraySort[myArraySort.length -1] = 3;
        System.out.println(Arrays.toString(myArraySort) + "lljmbvgfhjkl,lmknjbjvcvbhnjmklkjbvcvb");

        return myArraySort;
    }

}

//Kira è scema :P
//Ti amo