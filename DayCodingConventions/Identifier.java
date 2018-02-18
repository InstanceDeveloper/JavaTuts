class Identifier {
	public static void main(String[] args) {
		String contact_name = "Srikanth"; //contact_name is called identifier.
		System.out.println(contact_name);
	}
}

/*Throws an error not applicable*/
class Identifier_keyowrd {
	public static void main(String[] args) {
		int if = 123;
		System.out.println(if);
	}
}

/*Can be applied but not at all recommended*/
class Identifier_Predefined_Class {
	public static void main(String[] args) {
		int String = 111;
		System.out.println(String);
	}
}

/*Every identifier is case sensitive - everything results in different o/p */
class Identifier_CS {
	public static void main(String[] args) {
		int number = 123;
		int Number = 124;
		int numBer = 125;
		System.out.println(number);
	}
}
/* Identifier is nothing but every naming convention in the code is called Identifier.

Rules for mentioning identifiers:
1. Identifier contains a-z,A-z,0-9,_,$.
2. Shoudl not strat with number.
3. keywords are not allowed to be identifier
4. predefined class and interfaces are allowed but not recommended.
5. No length limit for identifier but recommended <= 16 characters
6. identifier is also case sensitive , each identifier is different


ex: int a = 10;
	int a123 = 10;
	int _$ab1 = 10;
	int _$ = 300;

	int 123abc = 100; not valid
	int abc.123 = 123; not valid 
		Special charaacters are not allowed.
  	
  	int if  = 124; // keyowrds in identifier are not allowes

  	int String = 111; // pre-defined classes are allowed as identifiers but not at all recommended.


 */