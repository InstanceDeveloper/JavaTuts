class method_this {
	int x = 300,y = 300;
	void inst_method_add(int a, int b) {
		System.out.println(x+y);
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		method_this mt1 = new method_this();
		mt1.inst_method_add(3000,3000);
	}
}

class method_this_one {
	int x = 300,y = 300;
	void inst_method_add(int x,int y) {
		System.out.println(x+y);
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		method_this_one mto = new method_this_one();
		mto.inst_method_add(3000,3000);
	}
}

class method_this_two {
	int x = 300, y = 300;
	void inst_method_add(int x,int y) {
		System.out.println(x+y);
		System.out.println(this.x+this.y);
	}
	public static void main(String[] args) {
		method_this_two mtt = new method_this_two();
		mtt.inst_method_add(3000,3000);
	}
}

class method_this_three {
	static int x = 300,y = 300;
	static void inst_method_add(int a,int b) {
		System.out.println(x+y);
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		method_this_three.inst_method_add(3000,3000);
	}
}

class method_this_four {
	static int x=300,y = 300;
	void inst_method_add(int x,int y) {
		System.out.println(x+y);
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		method_this_four mtf = new method_this_four();
		mtf.inst_method_add(3000,3000);
	}
}

class method_this_five {
	static int x=300,y = 300;
	//int x = 200,y = 200;
	void inst_method_add(int x,int y) {
		System.out.println(x+y);
		System.out.println(method_this_five.x+method_this_five.y);
	}
	public static void main(String[] args) {
		method_this_five mtf = new method_this_five();
		mtf.inst_method_add(3000,3000);
	}
}

class method_this_six {
	static int x = 300, y = 300;
	int a = 200, b = 200;
	void inst_method_add(int x,int y) {
		System.out.println(x+y);
		System.out.println(this.x+this.y);
		System.out.println(a + b);
	}
	public static void main(String[] args) {
		method_this_six mts = new method_this_six();
		mts.inst_method_add(3000,3000);
	}
}
