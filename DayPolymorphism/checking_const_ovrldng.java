class checking_const_ovrldng {
	//one form of constructor overloading

	checking_const_ovrldng(int a) {
		System.out.println("This is constructor with one argument");
	}

	checking_const_ovrldng(int a, int b) {
		System.out.println("This is constructor with two arguments");
	}

	//Another form of constructor overloading

	checking_const_ovrldng(int b) {
		System.out.println("This is constructor with Integer argument");
	}

	checking_const_ovrldng(String s) {
		System.out.println("This is constructor with String argument");
	}

	public static void main(String[] args) {
		new checking_const_ovrldng(10);
		new checking_const_ovrldng(10,20);

		new checking_const_ovrldng(10);
		new checking_const_ovrldng("String param");
	}
}