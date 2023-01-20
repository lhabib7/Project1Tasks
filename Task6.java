package Project1Tasks;

public class Task6 {
    //Write a program to swap 2 numbers without a temporary variable?
    public static void main(String[] args) {
        int x = 36;
        int y = 17;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:"
                + " x = " + x + ", y = " + y);
    }}
