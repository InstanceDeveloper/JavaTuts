class x implements Interface_demo {
	public void m1() {}
	public void m2() {}
	public void m3() {}
}

class Checking_Adapter extends x {
	public void m3() {
		System.out.println("This is the 3 method");
	}

	public static void main(String[] args) {
		new Checking_Adapter().m3();
	}
}