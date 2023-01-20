package Project1Tasks;

public class Task4 {
    //Create a 2D array or integer type where you will store odd and even numbers.
    //Develop a program which will identify/print the even numbers only.
    public static void main(String[] args) {
        int[][] values={{9,21,48},{55,74,90,100}};

        for (int i = 0; i <values.length ; i++) {
            for (int j = 0; j <values[i].length ; j++) {
                if (values[i][j]%2==0){
                System.out.println(values[i][j]);}
            }
        }
    }
}
