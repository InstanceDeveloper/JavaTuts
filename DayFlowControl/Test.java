class Test {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		switch (b) {
			case a: System.out.println("Prints out a value:"+a); break;
			case b: System.out.println("Prints out b value:"+b); break;
			case c: System.out.println("Prints out c value:"+c); break;
			default: System.out.println("Prints out nothing");
		}
	}
}