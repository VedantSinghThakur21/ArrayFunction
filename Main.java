class Main {
    public static void main(String[] args) {
        UserInput in = new UserInput(); // Object of UserInput 
        ArrayFunctions functions = new ArrayFunctions(); // Object of ArrayFunctions
        
        // functions.display(in.arrayInput());
        functions.oddEven(in.arrayInput());
        
        int index = functions.findSmallestDistance(in.arrayInput()); // Call to findSmallestDistance
        System.out.println("Index of the first number with the smallest distance: " + index);
    }
}
