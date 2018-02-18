class Coding_conventions {
	public static void main(String[] args) {
		System.out.println("Displaying Coding_conventions");
	}
}

class Coding_Conventions {
	public static void main(String[] args) {
		System.out.println("Displaying Coding_Conventions");
	}
}

class coding_Conventions {
	public static void main(string[] args) {
		System.out.println("Displaying coding_Conventions");
	}
}

/* The coding convetions works fine with any of the above decleration 
as they are user defined classes
but the movement we change the predefined classes like
String and System, the compiler throws an error.


ex: class coding_Conventions {
	public static void main(string[] args) {
		System.out.println("Displaying coding_Conventions");
	}
}

error: error: cannot find symbol
	public static void main(string[] args) {
	                        ^
  symbol:   class string
  location: class coding_Conventions
1 error

*/