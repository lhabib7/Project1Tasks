package Project1Tasks;

public class Task8 {
    //Write a Java Program to print the first 10 numbers of Fibonacci series.
    // term = first(o) + second(1) Output: 0 1 1 2 3 5 8 13 21 34
    public static void main(String[] args) {

        int  num1 = 0, num2 = 1;
        System.out.println("The first 10 numbers of Fibonacci series");

        for (int i = 1; i <= 10; ++i) {
            System.out.print(num1 + " ");

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }}
