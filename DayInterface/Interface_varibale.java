interface interface_var {
	int a = 10; //public static final
	void m1(); //public abstract
}

interface interface_var_2 {
	int a = 100;
}
class Interface_varibale implements interface_var {
	public void m1() {
//		a = a + 10; //uncomment this to see compilation error
		System.out.println(a);
	}	

	public static void main(String[] args) {
		new Interface_varibale().m1();
	}
}

/*Interface_varibale.java:8: error: cannot assign a value to final variable a
		a = a + 10;
		^
1 error */


class Interface_var_case1 implements interface_var, interface_var_2 {
	public void m1() {
		/*System.out.println(a);  uncommment this to see compilation error
		/*Interface_varibale.java:28: error: reference to a is ambiguous
		System.out.println(a);
		                   ^
  both variable a in interface_var and variable a in interface_var_2 match*/
  System.out.println(interface_var.a);
  System.out.println(interface_var_2.a);

	}

	public static void main(String[] args) {
		new Interface_var_case1().m1();
	}
}