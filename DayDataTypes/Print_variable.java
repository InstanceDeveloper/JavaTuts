class data_type {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
	}
}


/* int a = 10;

if we devide everything in this statmenet

int - data type
a - variable name
= -  assignment operator
10 - constant value or literal
; - statement terminator

valid print statement - 
	- System.out.println(a);

invalid print statements - 
	- System.out.println('a'); invalid
	- System.out.println("a"); valid but doesnt print the variable value
								it print outs "a" value. so it doesnt 
								meet our requirement.


Default values:
	- if we dont assign any value for variable JVM prints out default values
		let us see them
		byte, short, int and long - 0
		float and double - 0.0
		char - ' ' (space)
		boolean - false


int a; sop(a); prints o  
doubel d; sop(d); prints 0.0
Char c; sop(c) print " "(space)

Range of variable: 
lets take about Range of "byte"
Byte - 1 Byte = 8 Bits
Range = -128 to 127

1 Byte = 8 Bits = |_|_|_|_|_|_|_|_|
 				   7 6 5 4 3 2 1 0
				   |
 			7th place is Sign  | 2^6,2^5,2^4,2^3,2^2,2^1,2^0
 				  holder 		 ---------------------------
 				only for            sum of all these place
 				   +/-				values is 127
 				   	--------------------
 				   	The formulae to find the range is
 				   	-2^n to +(2^n)-1



