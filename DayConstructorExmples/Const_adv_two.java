class Const_adv_two {
	int const_adv_value;
	String const_adv_name;

	void inst_variable_dispalay() {
		System.out.println("The value of Constructor advantage is: "+const_adv_value);
		System.out.println("The name of Cosntructor advantage is: "+const_adv_name);
	}

	public static void main(String[] args) {
		Const_adv_two cat = new Const_adv_two();
		cat.inst_variable_dispalay();
	}
}

class Const_adv_two_case2 {
	int const_adv_value;
	String const_adv_name;

	Const_adv_two_case2() {
		const_adv_value = 1;
		const_adv_name = "case2";
	}

	void inst_variable_dispalay() {
		System.out.println("The value of Constructor advantage is: "+const_adv_value);
		System.out.println("The name of Cosntructor advantage is: "+const_adv_name);
	}

	public static void main(String[] args) {
		Const_adv_two_case2 catc = new Const_adv_two_case2();
		catc.inst_variable_dispalay();
	}
}

class Const_adv_two_case3 {
	int const_adv_value;
	String const_adv_name;

	Const_adv_two_case3(int value, String name) {
		this.const_adv_value = value;
		this.const_adv_name = name;
	}

	void inst_variable_dispalay() {
		System.out.println("The value of Constructor advantage is: "+const_adv_value);
		System.out.println("The name of Cosntructor advantage is: "+const_adv_name);
	}

	public static void main(String[] args) {
		Const_adv_two_case3 catc = new Const_adv_two_case3(2,"case3");
		catc.inst_variable_dispalay();
	}
}