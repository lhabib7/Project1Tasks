package Project1Tasks;

public class Task9 {
    //9)Maximum and minimum number in the array?
    public static void main(String[] args) {
        int[] values = {88, 11, 66, 33, 5, 94, 120};
        int max = values[0];
        int min = values[0];
        for (int i = 0; i < values.length; i++) {

            if (values[i] > max) max = values[i];
            if (values[i] < min) min = values[i];
        }
            System.out.println("The minimum value is : "+min);
            System.out.println("The maximum value is : "+max);


    }
}

