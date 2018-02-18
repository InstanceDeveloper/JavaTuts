class method_return_values {
	void method_noreturn_value() {
		System.out.println("The method returns no value");
	}

	int method_return_int_value() {
		System.out.println("This method returns int value");
		return 10; //hide this line to get error
	}

	float method_return_float_value() {
		System.out.println("This method returns float value");
		return 10.5f; //hide this line to get error
	}

	static char method_return_char_value() {
		System.out.println("This method returns char value");
		return 'c'; //hide this line to get error
	}

	public static void main(String[] args) {
		method_return_values mrv = new method_return_values();
		mrv.method_noreturn_value();
		mrv.method_return_int_value();
		mrv.method_return_float_value();
		method_return_values.method_return_char_value();

		/*
		Till here we are returning the value which is mandatory 
		but holding it is optional.

		But in project level holding the value is important
		below we can see how to hold it. 
		*/

		int a = mrv.method_return_int_value();
		float f = mrv.method_return_float_value();
		char c = method_return_values.method_return_char_value();

		System.out.println("The int method returns :"+a);
		System.out.println("The float method returns :"+f);
		System.out.println("The Char method returns :"+c);
	}


}