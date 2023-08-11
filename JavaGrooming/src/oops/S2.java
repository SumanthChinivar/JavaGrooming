package oops;
public class S2 {
	static int a=10+test1();
	static int b=a+test2();
	
	public static int test1() {
		return 10+test2();
	}
	
	public static int test2() {
		return a;
	}
	
	static 
	{
		b=23;
	}
	
	public static void main(String[] args) {
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}
