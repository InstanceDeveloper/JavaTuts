class checking_method_overloading {

	//one form of method overloadng 
	void inst_method1(int a) {
		System.out.println("This is instance method with one param");
	}

	void inst_method1(int a, int b) {
		System.out.println("This is instance method with two parameters");
	}

	//another form of method overloading
	void inst_method2(int a) {
		System.out.println("This is instance method with Integer parameter");
	}

	void inst_method2(String S) {
		System.out.println("THis is instance method with String Parameter");
	}

	public static void main(String[] args) {
		new checking_method_overloading().inst_method1(10);
		new checking_method_overloading().inst_method1(10,20);

		new checking_method_overloading().inst_method2(10);
		new checking_method_overloading().inst_method2("param");
	}
}