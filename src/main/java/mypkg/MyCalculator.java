package mypkg;

public class MyCalculator {
	
	public int sum(int a, int b) {
		return(a+b);
	}
	public int diff(int a, int b) {
		return(a-b);
	}
	
	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		System.out.println("Sum is: "+calc.sum(50,40));
		System.out.println("diff is: "+calc.diff(20,10));

	}

}
