class Const_advantage {
	int inst_var = 1;
	static int stat_var = 1;
	static int counter = 1;

	Const_advantage() {
		stat_var = stat_var + 1;
		inst_var = stat_var;
		System.out.println("The value of instance variable: "+inst_var);
	}

	public static void main(String[] args) {
		Const_advantage ca = new Const_advantage();
		Const_advantage ca1 = new Const_advantage();
		Const_advantage ca2 = new Const_advantage();
		System.out.println("The value of instance variable is: "+ca.inst_var);
		System.out.println("The value of instance variable is: "+ca1.inst_var);
		System.out.println("The value of instance variable is: "+ca2.inst_var);

		System.out.println("the value of instance variable is: "+ca.inst_var );
	}
}