class Scope_Static_Var {
	static int a = 100;
	static float f = 100.00f;
	public static void main(String[] args) {
		System.out.println(Scope_Static_Var.a);
		System.out.println(Scope_Static_Var.f);
		Scope_Static_Var s1 = new Scope_Static_Var();
		s1.Inst_method();
	}

	void Inst_method() {
		System.out.println(Scope_Static_Var.a);
		System.out.println(Scope_Static_Var.f);
	}
}