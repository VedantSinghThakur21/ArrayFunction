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

	public int findSmallestDistance(int[] array){
		int minDistance = Math.abs(array[1]-array[0]);
		int index = 0;
		for(int i = 1 ; i < array.length -1; i++){
			int distance = Math.abs(array[i]-array[i+1]);
			if(distance<minDistance){
				minDistance = distance;
				index = i;
			}
		}
		return index;
	}
}
