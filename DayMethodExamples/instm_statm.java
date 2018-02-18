class instm_statm {
	int x = 10;
	int y = 20;
	

	void inst_method(int x, int y)  {
		System.out.println(this.x + this.y);
		System.out.println(x+y);
	}

	static void stat_method(int x, int y) {
		instm_statm stat1 = new instm_statm();
		System.out.println(stat1.x+stat1.y);
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		instm_statm inst_stat1 = new instm_statm();
		inst_stat1.inst_method(10,30);

		instm_statm.stat_method(10,40);
	}
}