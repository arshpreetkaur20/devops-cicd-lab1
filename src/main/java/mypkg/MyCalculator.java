package mypkg;

public class MyCalculator {
	
	public int sum(int a, int b) {
		return(a+b);
	}
	public int diff(int a, int b) {
		return(a-b);
	}
	public int mul(int a, int b) {
		return(a*b);
	}
	public int div(int a, int b) {
		return(a/b);
	}
	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		System.out.println("Sum is: "+calc.sum(50,40));
		System.out.println("diff is: "+calc.diff(20,10));
		System.out.println("mul is: "+calc.mul(20,10));
		System.out.println("div is: "+calc.div(20,10));


	}

}
