class Main{
    public static void main(String[] args) {
        UserInput in = new UserInput(); //Object of UserInput 
        ArrayFunctions functions = new ArrayFunctions(); //Object of ArrayFunctions
        //functions.display(in.arrayInput());
		functions.oddEven(in.arrayInput());
    }
}