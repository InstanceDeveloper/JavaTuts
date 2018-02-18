class Checking_switch {
	public static void main(String[] args) {
		int a = 10;
		switch (a) {
			case 10: System.out.println("This is 10th case"); break;
			case 20: System.out.println("This is 20th case"); break;
			case 30: System.out.println("This is 30th case"); break;			
			case 40: System.out.println("This is 40th case"); break;
			case 50: System.out.println("This is 50th case"); break;
			case 60: System.out.println("This is 60th case"); break;
			default:
			System.out.println("None of the case is matched");
		}	
	}
}

class Checking_switch_case2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		switch (b) {
			case 10+10: System.out.println("Prints out a value:"+a); break;
			case 20/4: System.out.println("Prints out b value:"+b); break;
			case 5/6: System.out.println("Prints out c value:"+c); break;
			default: System.out.println("Prints out nothing");
		}
	}
}

class Checking_switch_case3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		switch (b) {
			case 10+10: System.out.println("Prints out a value:"+a); break;
			//case 20: System.out.println("Prints out b value:"+b); break; //uncomment to see case-3 error
			//case 30-10: System.out.println("Prints out c value:"+c); break; // uncomment to see case-3 error
			default: System.out.println("Prints out nothing");
		}
	}
}

class Checking_switch_case4 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		switch (b) {
			case 10: System.out.println("Prints out a value:"+a); break;
			case 30: System.out.println("Prints out b value:"+b); break;
			case 40: System.out.println("Prints out c value:"+c); break;
			//default: System.out.println("Prints out nothing"); //uncomment to see the case-4 to see output if no default value mentioned
		}
	}
}

class Checking_switch_case5 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		switch (b) {
			//case 10: System.out.println("Prints out a value:"+a); break; //case values need to be commented to see the case-5
			//case 30: System.out.println("Prints out b value:"+b); break; //case values need to be commented to see the case-5
			//case 40: System.out.println("Prints out c value:"+c); break; //case values need to be commented to see the case-5
			default: System.out.println("Prints out nothing"); 
		}
	}
}

class Checking_switch_case6 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		switch (b) {
			//case 10: System.out.println("Prints out a value:"+a); break; //all cases need to be commented to see the case-6 to see output
			//case 30: System.out.println("Prints out b value:"+b); break; //all cases need to be commented to see the case-6 to see output
			//case 40: System.out.println("Prints out c value:"+c); break; //all cases need to be commented to see the case-6 to see output
			//default: System.out.println("Prints out nothing"); //all cases need to be commented to see the case-6 
		}
	}
}

class Checking_switch_case7 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		switch (b) {
			//case 10: System.out.println("Prints out a value:"+a); break; //all cases need to be commented to see the case-6 to see output
			//case 30: System.out.println("Prints out b value:"+b); break; //all cases need to be commented to see the case-6 to see output
			//case 40: System.out.println("Prints out c value:"+c); break; //all cases need to be commented to see the case-6 to see output
			//default: System.out.println("Prints out nothing"); //all cases need to be commented to see the case-6 
			//System.out.println("This pulls out an error"); //uncomment to see the error for case 7
		}
	}
}

class Checking_switch_case8 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		switch (b) {
			case a: System.out.println("Prints out a value:"+a); break;
			case b: System.out.println("Prints out b value:"+b); break;
			case c: System.out.println("Prints out c value:"+c); break;
			default: System.out.println("Prints out nothing");

			/*Throws an error constant expression is required
		}
	}
}


/* to over come the problem with if we have switch
which can have multiple values and if cases are not valid
default value is executed


-switch takes arguments
	types of arguments allowed - byte, short, int, char, enum, string
	types of arguments allowed - long (because of to-much range value)
								 float (because of to-much posibilities)
								 	ex: 0.1,0.2,0.3,0.4,0.5
								 double (-do-)


-cases in switch:
		- case takes argument are byte,short,int,char,enum,string.
		- cases can take operations
		- case can not take duplicate values, they must be unique
		- cases not matched deault executes, but default is optional if not metioned
		  no error, it prints nothing
		- Inside switch cases are also optional, because default is also a case
		- Inside switch no user defined statements are valid, either they
		  should be case or default.
		- Each case should be assigned with only constant expression not ther declerations

*/