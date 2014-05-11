boolean main() {
	int r;									
		//Declare variable r
	
	r = faculty(5);							
		//Call faculty with the parameter 5 										
		//and assign return value to r
		
	println(r);								
		//Print r to stdout; output: 120
	emptyLine();							
		//Print empty line to stdout
	
	return true;							
		//Return true (successful execution)
}

int faculty(int n) {						
	//Declare function faculty
	//faculty returns an int and takes
	//one int parameter
	
	if (n == 0 || n == 1) {					
		//Check if n is equal to 0 OR n is equal to 1
		return 1;							
			//Return 1
	} else {								
		//Execute body if n is neither 0 nor 1
		return n * faculty(n-1);			
			//Return the product of n and the faculty of n-1
	}										
		//End of else body
	return 0;
}											
	//End of function body

void emptyLine() {							
	//Declare function emptyLine
	//emptyLine has no return value and
	//does not take any parameters
	println();								
		//Print an empty line
	return;									
		//Return from function
}											
	//End of function body

