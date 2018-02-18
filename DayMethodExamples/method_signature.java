class method_signature {
	void inst_method() {
		System.out.println("This is instance method");
	}
	/* unlock this to see the value of duplicate method or 
	duplicate method signature
	void inst_method() {
		System.out.println("This is another instance method");
	}
	*/
	/*Even though one is static and another is instance it doesn't
	work
	static void inst_method() {
		System.out.println("This is static method");
	}
	*/
	public static void main(String[] args) {
		method_signature ms = new method_signature();
		ms.inst_method();
	}
}