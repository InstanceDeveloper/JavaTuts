class Method_Access {
	void inst_method() { //instance method
		System.out.println("Instant Method");
	}

	static void stat_method() { // static method
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		Method_Access ma1 = new Method_Access();
		ma1.inst_method();
		Method_Access.stat_method();
	}
}