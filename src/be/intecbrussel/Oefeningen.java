package be.intecbrussel;

import java.util.Arrays;

public class Oefeningen {

    public static void main(String[] args) {


        // 1 - Zoek vergelijkbare elementen in deze arrays
        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
        System.out.print("vergelijkbare nummers: ");
        for (int index1 = 0; index1 < array1.length; index1++) {
            for (int index2 = 0; index2 < array2.length; index2++) {
                if (array1[index1] == (array2[index2])) {
                    System.out.print(array1[index1] + " ");
                }

            }
        }
        System.out.println();



        // 2 - String to String array
        //Schrijf een programma om deze string in een array te plaatsen:
        String str = "Java is the best";
        String[] strArr = str.split("  ");
        System.out.println(str);
        for (String element : strArr) {
            System.out.print(element);
        }
        System.out.println();



        // 3 - Array grid uitprinten
        //Schrijf een programma dat deze grid uitprint. Gebruik een 2d array.
//        0 0 0 0 0 0 0 0 0 0
//        0 0 0 0 0 0 0 0 0 0
//        0 0 0 0 0 0 0 0 0 0
//        0 0 0 0 0 0 0 0 0 0
//        0 0 0 0 0 0 0 0 0 0
//        0 0 0 0 0 0 0 0 0 0
//        0 0 0 0 0 0 0 0 0 0
//        0 0 0 0 0 0 0 0 0 0
//        0 0 0 0 0 0 0 0 0 0

        int[][] myArr = new int[9][10];
        for (int outerIndex = 0; outerIndex < myArr.length; outerIndex++) {
            for (int innerIndex = 0; innerIndex < myArr[outerIndex].length; innerIndex++) {
                System.out.print(myArr[outerIndex][innerIndex] + " ");
            }
            System.out.println();
        }

        int[][] myArr1 = new int[9][10];
        for (int[] elem : myArr1) {
            for (int element : elem) {
                System.out.print(element + " ");
            }
            System.out.println();
        }


        // 4 - Optelling arrays
        // Schrijf een programma die de volgende arrays bij elkaar optelt.
        int a[][] = {{1, 3, 4}, {3, 4, 5}};
        int b[][] = {{1, 3, 4}, {3, 4, 5}};

        int c[][] = new int[2][3];

        for (int outerIndex = 0; outerIndex < c.length; outerIndex++) {
            for (int innerIndex = 0; innerIndex < c[outerIndex].length; innerIndex++) {

                c[outerIndex][innerIndex] = a[outerIndex][innerIndex] + b[outerIndex][innerIndex];
                System.out.print(c[outerIndex][innerIndex]);
            }
            System.out.println();
        }


        int a1[][] = {{1, 3, 4}, {3, 4, 5}};
        int b1[][] = {{1, 3, 4}, {3, 4, 5}};
        int[][] sum = new int[a1.length][a1[0].length];
        for (int line = 0; line < a1.length; line++) {
            // cannot use foreach need indexes for third array
            // a[line].length gives the number of columns on that line
            for (int column = 0; column < a1[line].length; column++) {
                sum[line][column] = a1[line][column] + b1[line][column];
            }
        }
        System.out.println("Array 1   : " + Arrays.deepToString(a1));
        System.out.println("Array 2   : " + Arrays.deepToString(b1));
        System.out.println("Array sum : " + Arrays.deepToString(sum));




    }
}
