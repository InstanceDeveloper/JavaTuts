/*
//method_args_refer - with constructors
class Student {
	String Student_name;
	Student(String name){
		Student_name = name;
	}
}

class Marks{
	int marks;
	Marks(int m) {
		marks = m;
	}
}

class Class_room {
	String cl_room;
	Class_room(String room) {
		cl_room = room;
	}
}
class Teacher {
	String cl_teacher;
	Teacher(String teach_name) {
		cl_teacher = teach_name;
	}
}


class method_args_refer {

	void inst_method(Student std, Marks std_marks) {
		System.out.println(std.Student_name);
		System.out.println(std_marks.marks);
	}

	static void stat_method(Class_room c_room, Teacher c_teacher) {
		System.out.println(c_room.cl_room);
		System.out.println(c_teacher.cl_teacher);
	}

	public static void main(String[] args) {
		method_args_refer mar1 = new method_args_refer();
		
		Student std = new Student("Sri");
		Marks m1 = new Marks(100);
		mar1.inst_method(std,m1);

		Class_room c_room = new Class_room("10C");
		Teacher c_teacher = new Teacher("Srikanth");
		method_args_refer.stat_method(c_room, c_teacher);
	}
}



//method_args_refer - with methods
class Student {
	String Student_name;
	void Student(String name){
		Student_name = name;
	}
}

class Marks{
	int marks;
	void Marks(int m) {
		marks = m;
	}
}

class Class_room {
	String cl_room;
	static void class_room(String room) {
		Class_room c1 = new Class_room();
		c1.cl_room = room;
		System.out.println(c1.cl_room);
	}
}

class Teacher {
	String cl_teacher;
	static void teacher(String teach_name) {
		Teacher t1= new Teacher();
		t1.cl_teacher = teach_name;
	}
}


class method_args_refer {

	void inst_method(Student std, Marks std_marks) {
		System.out.println(std.Student_name);
		System.out.println(std_marks.marks);
	}

	static void stat_method(Class_room c_room, Teacher c_teacher) {
		System.out.println(c_room.cl_room);
		System.out.println(c_teacher.cl_teacher);
	}

	public static void main(String[] args) {
		method_args_refer mar1 = new method_args_refer();
		
		Student std = new Student();
		Marks m1 = new Marks();
		std.Student("Sri");
		m1.Marks(100);
		mar1.inst_method(std,m1);

		Class_room c_room = new Class_room();
		Teacher c_teacher = new Teacher();
		Class_room.class_room("10C");
		Teacher.teacher("Srikanth");
		method_args_refer.stat_method(c_room, c_teacher);
	}
}

*/


class Student{

}

class Marks {

}

class Room {

}

class Teacher {

}


class method_args_refer {
	void inst_method(Student std_name, Marks std_marks) {
		System.out.println("This is instant method");
		System.out.println(std_name);
		System.out.println(std_marks);
	}	

	static void stat_method(Romm cl_room, Teacher cl_teacher) {
		System.out.println("This is static method");
		System.out.println(cl_room);
		System.out.println(cl_teacher);
	}

	public static void main(String[] args) {
		method_args_refer ma1 = new method_args_refer();
		Student std_name = new Student();
		Marks std_marks = new Marks();
		ma1.inst_method(std_name,std_marks);

		Room cl_room = new Class_room();
		Teacher cl_teacher = new Teacher();
		method_args_refer.stat_method(cl_room,cl_teacher);
	}
}