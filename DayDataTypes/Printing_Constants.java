class Printing_Constants {
	public static void main(String[] args) {
		//float f = 10.5; // to show error uncomment this
		float f = 10.5f;
		System.out.println(f);

		double d = 20.5;
		System.out.println(d);
	}
}


/*

Leads to an error because by deafult java takes decimal values
as double, so by seeing float allocation to float it shows an
error. 

inorder to over come this error we use two methods
		1. constant assignment in the end
		2. Assigning data-type infront in paranethesis.


1. constants at the end of literal decleration
ex: float f = 10.5f; 

2. Assignign data-type infront
ex: float f = (float) 10.5;
*/