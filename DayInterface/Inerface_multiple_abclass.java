abstract class Interface_multiple_abclass1 implements Interface_demo {
	public void m1() {
		System.out.println("This is method1");
	}
}

abstract class Interface_multiple_abclass2 extends Interface_multiple_abclass1 {
	public void m2() {
		System.out.println("This is method2");
	}
}

class Inerface_multiple_abclass extends Interface_multiple_abclass2 {
	public void m3() {
		System.out.println("This is method3");
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