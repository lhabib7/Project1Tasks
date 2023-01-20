package Project1Tasks;

import java.util.Scanner;

public class Task2 {
    //Using Scanner create an array of countries. When an array is created,
    //retrieve all values from it and while retrieving those values print
    // capital for each country. (use 2 different loops).
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String [] country=new String[6];
        String [] capital=new String[6];
        for (int i = 0; i <6 ; i++) {
            System.out.println("please enter a country");
            country[i]=input.nextLine();
            System.out.println("please enter the capital of "+country[i]);
            capital[i]=input.nextLine();
        }
        for (int j = 0; j <6 ; j++) {
            System.out.println("The capital of "+country[j]+" is "+capital[j]);

        }
    }
}
