import java.util.*;

class ArrayFunctions {
    public void display(ArrayList<Integer> array) {
        System.out.println("Array is: " + array);
    }
    
    public void oddEven(int[] array) {
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even.add(array[i]);
            } else {
                odd.add(array[i]); // Corrected this line
            }
        }
        
        display(odd);
        display(even);
    }
}
