boolean main() {
	int a = 6;					
		//Assign 6 to the variable a
	int b = 2;					
		//Assign 2 to the variable b
	int c = a + b;				
		//Assign the sum of a and b to c; c = 8
	int d = a * c / b - b;		
		//Assign the calculation result to d; d = ((6 * 8)/2)-2 = 22
	boolean e = true;			
		//Assign boolean value true to e
	boolean f = e && false;		
		//Assign e AND false; f = false
	
	println(d);					
		//Print 22 to stdout
	println(e);					
		//Print true to stdout
	println(f);					
		//Print false to stdout
	
	return true;				
		//Returns true (successful execution)
}