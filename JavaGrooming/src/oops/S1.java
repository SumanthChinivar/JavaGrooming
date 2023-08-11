package oops;

public class S1 {

	static int a=10;
	static int b=test();
	
	public static int test()
	{
		a=234;
		return 10;
	}
	
	public static void main(String[] args) {
		System.out.println("Main Begins");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("Main Ends");
	}
	
	
}
