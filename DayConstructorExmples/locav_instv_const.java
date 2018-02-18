class locav_instv_const {
	int inst_var;
	int local_var;

	locav_instv_const(int local_var) {
		inst_var = local_var;
		this.local_var = local_var;
	}

	void disp() {
		System.out.println(inst_var);
		System.out.println(local_var);
	}

	public static void main(String[] args) {
		locav_instv_const lvc1 = new locav_instv_const(10);
		lvc1.disp();
	}
}