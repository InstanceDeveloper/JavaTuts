public class two_public {
	public static void main(String[] args) {
		System.out.println("two_public");
	}
}

public class one_public {
	public static void main(String[] args) {
		System.out.println("one_public");
	}
}

/*
This leads to compilation error because each java file should
contain only public class and n no. of non public classes because
each file should contain one public class with class name as file name for
generating class file. which doesn't happen in this scenario.

The error is mentioned below
Two_public.java:1: error: class two_public is public, should be declared in a file named two_public.java
public class two_public {
       ^
Two_public.java:7: error: class one_public is public, should be declared in a file named one_public.java
public class one_public {
       ^
2 errors

*/