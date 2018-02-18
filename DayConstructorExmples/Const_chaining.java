class Const_chaining {
	Const_chaining() {
		System.out.println("This is 0 args Constructor");
	}

	Const_chaining(String Const_arg) {
		this();
		System.out.println("This is 1 args Constructor");
	}

	Const_chaining(String arg_one, String arg_two) {
		this("argument one");
		System.out.println("This is 2 args Constructor");
	}

	public static void main(String[] args) {
		Const_chaining cc = new Const_chaining("argument one","argument two");
	}
}