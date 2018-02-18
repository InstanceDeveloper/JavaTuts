class threemain {
	public static void main(String[] args) {
		System.out.println("Hello three");
	}
}

class one_main {
	public static void main(String[] args) {
		System.out.println("Hello one_main");
	}
}

class two_main {
	public static void main(String[] args) {
		System.out.println("Hello two_main");
	}
}

/*
It is valid to maintain as many as main methods in a file
but the difference only the class with public will execute 
its main method rest of them are not executed.

So in-order to main the code effeciencywe maintain only main
method in a the public class where the file is saved with.

*/