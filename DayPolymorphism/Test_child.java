class Test_Parent {
	 private void inst_m1() {
		System.out.println("This is Instance method of parent class");
	}
}

class Test_child extends Test_Parent {
	 void inst_m1() {
		System.out.println("This is Instance method of child class");
	}

	public static void main(String[] args) {
		Test_Parent TP = new Test_Parent();
		TP.inst_m1();

	}
}