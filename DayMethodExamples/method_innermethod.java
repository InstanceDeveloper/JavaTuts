class method_innermethod {
	void inst_method() {
		System.out.println("This is inst_method");
		void inst_method2() {
			System.out.println("This is inst_method2");
		}
	}
	public static void main(String[] args) {
		method_innermethod mim = new method_innermethod();
		mim.inst_method();
	} 
}