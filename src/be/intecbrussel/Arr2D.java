package be.intecbrussel;

import java.util.Arrays;

public class Arr2D {

    public static void main(String[] args) {


        int [][] myFirst2D = new int[3][3];
        for (int indexouter = 0; indexouter < myFirst2D.length; indexouter++) {
            for (int indexinner = 0; indexinner < myFirst2D[indexouter].length; indexinner++) {
                System.out.print(myFirst2D[indexouter][indexinner]);
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(myFirst2D));
        
        
        double[][] myDoubArr = new double[3][];
        myDoubArr[0] = new double[5];
        myDoubArr[1] = new double[10];
        myDoubArr[2] = new double[7];
        
        for (int indexOut = 0; indexOut < myDoubArr.length; indexOut++) {
            for (int indexIn = 0; indexIn < myDoubArr[indexOut].length; indexIn++) {
                System.out.print(myDoubArr[indexOut][indexIn] + "  ");
            }
            System.out.println();
        }
        
        



    }
}
