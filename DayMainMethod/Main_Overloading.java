class Main_Overloading {
	public static void main(String[] args) {
		System.out.println("Main method with String args");
	}
	public static void main(int a) {
		System.out.println("Main method int var");
	}
	public static void main(char c) {
		System.out.println("Main method char var");
	}
}

class Main_Overloading_Case1 {
	public static void main(String[] args) {
		main(10);
		System.out.println("Main method with String args");
	}
	public static void main(int a) {
		main('x');
		System.out.println("Main method int var");
	}
	public static void main(char c) {
		System.out.println("Main method char var");
	}
}