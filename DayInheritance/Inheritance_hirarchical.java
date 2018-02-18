class A {
	void inst_m1() {
		System.out.println("This is instance method 1");
	}
	void inst_m2() {
		System.out.println("This is instance method 2");
	}
}

class B extends A {
	void inst_m3() {
		System.out.println("This is instance method 3");
	}
	void inst_m4() {
		System.out.println("This is instance method 4");
	}

	public static void main(String[] args) {
		A a = new A();
		a.inst_m1();
		a.inst_m2();

		B b = new B();
		b.inst_m1();
		b.inst_m2();
		b.inst_m3();
		b.inst_m4();
	}
}

class C extends A {
	void inst_m5() {
		System.out.println("This is instance method 5");
	}
	void inst_m6() {
		System.out.println("This is instance method 6");
	}

	public static void main(String[] args) {
		A a = new A();
		a.inst_m1();
		a.inst_m2();

		C c = new C();
		c.inst_m1();
		c.inst_m2();
		c.inst_m5();
		c.inst_m6();
	}
}