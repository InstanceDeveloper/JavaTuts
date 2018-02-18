interface Interface_extends_Interface_demo extends Interface_demo {
	void m4();
}

interface Intf extends Interface_extends_Interface_demo, Interface_demo {

}
class Interface_extends_Interface implements Intf {
	public void m1() {
		System.out.println("This is main method 1");
	} 

	public void m2() {
		System.out.println("This is main method 2");
	} 

	public void m3() {
		System.out.println("This is main method 3");
	} 
    
    public void m4() {
		System.out.println("This is main method 4");
	} 

	public static void main(String[] args) {
		Implementation_demo id = new Implementation_demo();
		id.m1();
		id.m2();
		id.m3();
//in hadoop level
		Interface_demo iid = new Implementation_demo();
		iid.m1();
		iid.m2();
		iid.m3();
	}
}