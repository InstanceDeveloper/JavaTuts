class find_line_length {
	int x1,x2,y1,y2;

	static void printLength() {
		double length;
		length = Math.sqrt((x2-x1)*(x2-x1));
		System.out.println("legnth of the line is: "+length);
	}

	public static void main(String[] args) {
		find_line_length find_l1 = new find_line_length();
		find_l1.x1 = 5;
		find_l1.y1 = 10;
		find_l1.x2 = 45;
		find_l1.y2 = 40;
		find_l1.printLength();
	}
}