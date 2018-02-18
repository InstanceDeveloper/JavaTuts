class Implementation_demo implements Interface_demo {

	public void m1() {
		System.out.println("This is main method 1");
	} 

	public void m2() {
		System.out.println("This is main method 2");
	} 

	public void m3() {
		System.out.println("This is main method 3");
	} 


	public static void main(String[] args) {
		Implementation_demo id = new Implementation_demo();
		id.m1();
		id.m2();
		id.m3();

		Interface_demo iid = new Implementation_demo();
		iid.m1();
		iid.m2();
		iid.m3();
	}
}