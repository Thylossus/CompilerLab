boolean main() {
	boolean i = false;			
		//Assign false to i
	int j;						
		//Declare variable j
	
	do {						
		//Start (outer) doWhile loop
		j = 0;					
			//Assign 0 to j
		do {					
			//Start (inner) doWhile loop
			println(j);			
				//Print j to stdout
			j = j + 1;			
				//Assign the sum j + 1 to j
		} while(j < 5);			
			//(Inner) loop condition; Repeat if j is smaller than 5
	} while(i);					
		//(Outer) Loop condition; Repeat if i is true
	
	//Output:
	//0
	//1
	//2
	//3
	//4
	
	
	return true;				
		//Returns true (successful execution)
}