boolean main() {
	int i = 3;					
		//Assign 3 to variable i
	int j;						
		//Declare variable j
	
	while (i != 0) {			
		//Start while loop; repeat if i is not equal to 0
		j = 2;					
			//Assign 2 to j
		while (j > 0) {			
			//Start while loop; repeat if j is greater than 0
			j = j - 1;			
				//Assign difference j - 1 to j
			println(i);			
				//Print i to stdout
			println(j);			
				//Print j to stdout
		}						
			//Body of inner loop ends
		i = i - 1;				
			//Assign difference i - 1 to i
	}							
		//Body of outer loop ends
	
	//Output:
	//3
	//1
	//3
	//0
	//2
	//1
	//2
	//0
	//1
	//1
	//1
	//0
	
	return true;				
		//Returns true (successful execution)
}