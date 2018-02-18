class Checking_for {
	public static void main(String[] args) {
		for (int i=0; i<10 ; i++) {
			System.out.println("Prints the increment value of i: "+i);
		}
	}
}

class Checking_for_case1 {
	public static void main(String[] args) {
		int i=0;
		for (; i<10 ; i++) {
			System.out.println("Prints the increment value of i: "+i);
		}
	}
}

class Checking_for_case2 {
	public static void main(String[] args) {
		int i=0;
		for (System.out.println("Prints the increment value of i: "+i); i<10 ; i++) {
			System.out.println("let us see what prints here");
		}
	}
}

class Checking_for_case3 {
	public static void main(String[] args) {
		int i=0;
		for (System.out.println("Prints the increment value of i: "+i),System.out.println("Another sop with comma"); i<10 ; i++) {
			System.out.println("let us see what prints here");
		}
	}
}

class Checking_for_case4 {
	public static void main(String[] args) {
		
		for (int i=0/*,double d = 10.5 (uncomment here to see the error)*/; i<10 ; i++) {
			System.out.println("Prints the increment value of i: "+i);
		}
	}
}

class Checking_for_case5 {
	public static void main(String[] args) {
		
		for (int i=0, j=0; i<10 ; i++) {
			System.out.println("Prints the increment value of i: "+i);
		}
	}
}

/* 

Understanding the for-loop:

	for loop consists of three important statements:
		1. Initialization
		2. Boolean condition
		3. Incrementation or Decrementation

cases:
initialization cases:
	- initialization is not mandetory inside for loop
	- initialziation can be replaced with sop statement
	- initialization part can be replaced with multiple sop's with commma (',')
	- intialization with two different data types are not possible
	- Multiple initialization with single data types are possible
conditional cases:
	- conditions are optional but conditionals can't replaced with sop
	  because conditinals are only for booleans
increment/decrement cases:
	- increment/ decrement part are always optional
	- increment/ decrement can be replaced with sop
	- multiple sops can be written in increment/ decrement part
	- for with two semicolons will give infiinte loop for(;;)
unreachable cases:
	- conditional is replaced with true
	- oncidtional is replaced with false because control is not reaching body
not recchable case: 

*/