import java.util.*;
class UserInput{
    int[] arrayInput(){
        Scanner scanner = new Scanner(System.in); //Object of Scanner Class
        int[] array = new int[5]; // Declaring a Array of Size 5
        System.out.println("Enter 5 Numbers");
        for(int i = 0; i<array.length;i++){
            array[i] = scanner.nextInt();

        }
        return array;
    }
}