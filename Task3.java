package Project1Tasks;

import java.util.Scanner;

public class Task3 {
    //3) Create a 2D array of integer values.
    // Print the sum of all numbers.
    public static void main(String[] args) {
        int[][] values={{7,23,34},{72,36,12,43}};
        int sum=0;
        for (int i = 0; i <values.length ; i++) {
            for (int j = 0; j <values[i].length ; j++) {
                System.out.println(values[i][j]);
                sum=sum+values[i][j];
            }
        }
       System.out.println("The sum of all numbers is : "+sum);
    }
}
