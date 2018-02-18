class Assignment_two {
	// create two instance variables
	int a =10;
	float f = 10.0f;

	//create two static variables
	static int b = 20;
	static float g = 20.0f;

	void method1() {
		//print 4 variables
		System.out.println(a);
		System.out.println(f);
		System.out.println(Assignment_two.b);
		System.out.println(Assignment_two.g);
	}

	static void method2(int a, float f) {
		//print 4 variables 
		System.out.println(a);
		System.out.println(f);
		System.out.println(Assignment_two.b);
		System.out.println(Assignment_two.g);
	}

	public static void main(String[] args) {
		Assignment_two a1 = new Assignment_two();
		a1.method1();
		Assignment_two.method2(a1.a, a1.f);
		a1.a = 100;
		a1.f = 100.0f;
		a1.g = 40.0f;
		a1.method1();
		Assignment_two.method2(a1.a, a1.f);
	}
}