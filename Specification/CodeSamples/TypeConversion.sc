boolean main() {
	int a = 2;				
		//Assign 2 to a
	boolean b = (boolean)a;	
		//Convert a to boolean; b = true
	
	a = (int)b;				
		//Convert b to int; a = 1
	
	println(a);				
		//Print 1 to stdout
	println(b);				
		//Print true to stdout
	
	return true;			
		//Returns true (successful execution)
}