import java.util.Arrays;

class ArrayFunctions{
    public void display(int[] array){
        System.out.println("Array is : " + Arrays.toString(array));
    }
	
	public void oddEven(int[] array){
		int[] odd = new int[5];
		int[] even = new int[5];
		int ODD_INDEX = 0;
		int EVEN_INDEX = 0;
		for(int i = 0; i< array.length; i++){
			if(array[i]%2 ==0){
				even[EVEN_INDEX] = array[i];
				EVEN_INDEX++;
			}else{
				if(array[i]%2 ==0){
				odd[ODD_INDEX] = array[i];
				ODD_INDEX++;
			}
		}
		
	}
	display(odd);
	display(even);
}