class method_args {
	void inst_method(char ch, int roll_no) {
		System.out.println("this is instance method");
		System.out.println("The character is: "+ ch);
		System.out.println("The roll no is:"+ roll_no);
	}

	static void stat_method(String name, double salary) {
		System.out.println("this is static method");
		System.out.println("the name is: "+name);
		System.out.println("the salary is: "+salary);
	}

	public static void main(String[] args) {
		method_args ma1 = new method_args();
		ma1.inst_method('s',101);
		method_args.stat_method("sri",1000.00);

	}
}