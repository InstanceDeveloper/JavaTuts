class Registration_Bean {

	public static void main(String[] args) {
		Student_Bean Student_Registration = new Student_Bean();

		Student_Registration.setStudent_id(10);
		Student_Registration.setStudent_name("Sri");

		int Student_id = Student_Registration.getStudent_id();
		String Student_name = Student_Registration.getStudent_name();

		System.out.println("This is student id:"+Student_id);
		System.out.println("This is student name:"+Student_name);


		Student_Bean Student_Registration_one = new Student_Bean();

		Student_Registration_one.setStudent_id(11);
		Student_Registration_one.setStudent_name("Srikanth");

		System.out.println("This is student id:"+Student_Registration_one.getStudent_id());
		System.out.println("This is student name:"+Student_Registration_one.getStudent_name());

	}
}