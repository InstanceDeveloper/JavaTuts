/*class error_try_catch {
			public static void main(String[] args) {
				System.out.println("Hello");
				System.out.println("Hello");
				System.out.println(10/0);
				System.out.println("Hello");
				System.out.println("Hello");
			}
	}

/*O/P:  Exception in Thread "main" :java.lang.ArithmeticException: /by zero.*/


class error_try_catch {
		public static void main(String[] args) {
			System.out.println("Hello");
			System.out.println("hello");
			try {
				System.out.println(10/0);
			}
			catch (ArithmeticException e) {
				System.out.println("We have an exception:"+e);
			}
			System.out.println("Hello");
		}
}