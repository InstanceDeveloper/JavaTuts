class Static_Assignemnt_One {
	String inst_var;

	static {
		Static_Assignemnt_One SAO = new Static_Assignemnt_One();
		SAO.inst_var = "Succed";
		System.out.println(SAO.inst_var);
		System.out.println("This is Static_Assignemnt_One Static Block");
	}

	public static void main(String[] args) {
	/*	Static_Assignemnt_One SAO = new Static_Assignemnt_One();
		Static_Assignment_Class_One SAC1 = new Static_Assignment_Class_One();
		Static_Assignment_Class_Two SAC2 = new Static_Assignment_Class_Two();
		Static_Assignment_Class_Three SAC3 = new Static_Assignment_Class_Three();
		*/

		new Static_Assignemnt_One();
		new Static_Assignment_Class_One();
		new Static_Assignment_Class_Two();
		new Static_Assignment_Class_Three();
	}
}

class Static_Assignment_Class_One {
	static {
		System.out.println("This is Static_Assignment_Class_One");
	}
}


class Static_Assignment_Class_Two {
	static {
		System.out.println("This is Static_Assignment_Class_Two");
	}
}


class Static_Assignment_Class_Three {
	static {
		System.out.println("This is Static_Assignment_Class_Three");
	}
}
