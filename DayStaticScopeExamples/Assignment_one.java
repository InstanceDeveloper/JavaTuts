class Assignment_one {
	//create 2 Instant Variables
	int a = 10;
	float f = 10.0f;
	// create 2 static methods
	
	static void method1(int a,float f) {
		System.out.println(a);
		System.out.println(f);
	}

	static void method2(int a,float f) {
		System.out.println(a);
		System.out.println(f);
	}


	public static void main(String[] args) {
		Assingment_one a1 = new Assingment_one();
		Assingment_one.method1(a1.a, a1.f);
		Assingment_one.method2(a1.a, a1.f);
		Assingment_one.method1(20, 20.0f);

	}
}


//instance variable calling with object parameters in method
class Assignment_one_method2 {
	int a = 10;
	float f = 10.0f;

	static void method1(Assignment_one_method2 a) {
		System.out.println(a.a);
		System.out.println(a.f);
	}

	static void method2(Assignment_one_method2 a) {
		System.out.println(a.a);
		System.out.println(a.f);
	}

	public static void main(String[] args) {
		Assignment_one_method2 a3 = new Assignment_one_method2();
		a3.method1(a3);
		a3.method2(a3);
	}
}

class Assignment_one_method3 {
	int a = 10;
	float f = 10.f;

	static void method1(int a, float f) {
		Assignment_one_method3 aom3 = new Assignment_one_method3();
		System.out.println(aom3.a);
		System.out.println(aom3.f); 
		
	}

	static void method2(int a, float f) {
		Assignment_one_method3 aom3 = new Assignment_one_method3();
		System.out.println(aom3.a);
		System.out.println(aom3.f);
	}

	public static void main(String[] args) {
		Assignment_one_method3 aom3 = new Assignment_one_method3();
		method1(aom3.a,aom3.f);
		method2(aom3.a,aom3.f);

	}
} 