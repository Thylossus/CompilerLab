int i = 5;				
	//Assign 5 to (global) variable i

boolean main() {
	println(i);			
		//Print (global) variable i to stdout; output = 5
	
	int i = 1;			
		//Assign 1 to (local) variable i
	
	println(i);			
		//Print (local) variable i to stdout; output = 1
	
	return true;		
		//Returns true (successful execution)
}