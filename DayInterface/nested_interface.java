interface Interface {
	interface Interface_second {
		void m1();
	}
}
									//Map.Entry		
class nested_interface implements Interface.Interface_second {
	public void m1() {
		System.out.println("This is method 1");
	}

	public static void main(String[] args) {
		new nested_interface().m1();
	}
}