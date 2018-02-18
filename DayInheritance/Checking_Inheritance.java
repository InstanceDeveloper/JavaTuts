class Inheritance_A {
	void inst_method_A {
		System.out.println("This is Instance method of class A");
	}
}

class Inheritance_B extends Inheritance_A{
	void inst_method_B {
		System.out.println("This is Instance mehod of class B");
	}
}

class Inheritance_C extends Inheritance_B{
	void inst_method_C 
	{
		System.out.println("This is Instance method of class C");
	}
}

class Checking_Inheritance extends Inheritance_C { 
	
}