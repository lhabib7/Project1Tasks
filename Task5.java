package Project1Tasks;

public class Task5 {
    //Create a 2D array of integers. Develop a program which will
    // calculate the sum of  even and odd numbers for that array.
    public static void main(String[] args) {
        int[][] values = {{5, 11, 66}, {33, 88, 94, 120}};
        int even = 0;
        int odd = 0;

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j] % 2 == 0) {
                    even = even + values[i][j];
                } else {
                    odd = odd + values[i][j];
                }
            }
        }
        System.out.println("Sum of odd numbers is : "+odd);
        System.out.println("Sum of  even  numbers is : "+even);
    }}
