class Checking_if {
	public static void main(String[] args) {
		int a =10;
		if (a == 10) {
			System.out.println("True Body");
		} else {
			System.out.println("Flase Body");
		}
	}
}

class Checking_if_true {
	public static void main(String[] args) {
		if (true) {
			System.out.println("True Body");
		} else {
			System.out.println("Flase Body");
		}
	}
}

class Checking_if_withoutbraces{
	public static void main(String[] args) {
		int a =10;
		if (a == 10)
			System.out.println("True Body");
		else
			System.out.println("Flase Body");
		
	}
}

/* If-else condition

	if (condition) {
	
	} else  {
	
	}
	
cases:
	- in the above code always condition should be
	  boolean oeration not an assignment operation 
	- we can pass boolean value directly
	- brakcets are optional not manditory but only works with
	  only one statement
	- should not pass 0 or 1 instead of boolean values
	  because it takes only true or false
