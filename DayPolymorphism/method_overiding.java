class overiding_parent_r1 {
	void inst_method() {
		System.out.println("This is parent class instance method");
	} //if the child class method is commented parent class method
	//executes
}

class overiding_child_r1 extends overiding_parent_r1{
	void inst_method() {
		System.out.println("This is child class instance method");
	}

	public static void main(String[] args) {
		new overiding_child_r1().inst_method();
	}
}