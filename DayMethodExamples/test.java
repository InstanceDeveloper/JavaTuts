class test {
	int a = 100;

	int m1(int a) {
		return this;
	} 

	public static void main(String[] args) {
		test t = new test();
		int x = t.m1(10);

		System.out.println(x);
	}
}