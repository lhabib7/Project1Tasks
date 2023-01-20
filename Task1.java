package Project1Tasks;

import java.util.Scanner;

public class Task1 {
    //Using Scanner create an array of integer values.
    // After the array is created,
    // calculate the sum of all stored elements in that array.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] numbers=new int[5];
        int sum=0;
        System.out.println("Please enter 5 numbers");
        for (int i = 0; i <5 ; i++) {
            numbers[i]=input.nextInt();
          sum=sum+numbers[i];
        }
        System.out.println("The sum of all entred element is : "+sum);
    }
}
