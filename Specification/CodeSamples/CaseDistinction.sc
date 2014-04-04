boolean main() {
	int a = 1;					
		//Assign 1 to variable a
	boolean b = true;			
		//Assign true to variable b
	
	if (b) {					
		//Check if b is true
		if (a == 1) {			
			//Check if a is equal to 1
			if (a > 2 || b) {	
				//Check if a is greater than two OR b is true
				println(b);		
					//Print b to stdout
			}					
				//End of if body
			
			if (a < 1) {		
				//Check if a is smaller than 1
				println(a);		
					//Unreachable statement
			} else {			
				//Body is executed if a is not smaller than 1
				println(a);		
					//Print a to stdout
				println(b);		
					//Print b to stdout
			}					
				//End of else body
		} else {				
			//Body is executed if a is not equal to 1
			println(a);			
				//Unreachable statement
		}						
			//End of else body
	}							
		//End of if body
	
	//Output:
	//true
	//1
	//true
	
	return true;				
		//Return true (successful execution)
}