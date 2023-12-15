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

        Integer [] integerArray1 = IntStream.of(a1).boxed().toArray(Integer []::new);
        Integer [] integerArray2 = IntStream.of(a2).boxed().toArray(Integer []::new);
        List<Integer> listA1 = Arrays.asList(integerArray1);
        List<Integer> listA2 = Arrays.asList(integerArray2);
        System.out.println(listA2 instanceof List);

        int i = 0;
        while (i <= myArraySort.length){
            int a11 = listA1.get(i);
            int a22 = listA2.get(i);
            System.out.println("итерация"+ i);
            System.out.println(a11);
            System.out.println(a22);
            ////////////////////////////

            int myInt = 7;
            List<Integer> list = new ArrayList<Integer>();
            list.add(myInt);

            System.out.println(list.get(0)); //prints 7
            ///////////////////////////////////
            if(a11 <= a22){
                System.out.println("первое условие");
                myArraySort[i] = a11;
                System.out.println(myArraySort[i]);
                int adAdd = 9;
                listA2.add(adAdd);
                System.out.println("идёт дальше");
                System.out.println(listA2.get(0));
            }
            else {
                myArraySort[i] = a22;
                listA1.add(0,0);
            }
            i++;
        }

        System.out.println(Arrays.toString(myArraySort));

        return myArraySort;
    }

}

//Kira è scema :P
//Ti amo