package Project1Tasks;

public class Task11 {
    //Write a program to print out duplicate elements from an Array of Strings?
    public static void main(String[] args) {
        String [] arr = new String [] {"Naima","Salva","Lhabib","Nassim","Naima","Adam","Aicha","Nassim","Lhabib"};
        System.out.println("Duplicate elements in given array: ");
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);

            }

        }

    }
}

