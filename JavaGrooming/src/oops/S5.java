package oops;

public class S5 {
public static void main(String[] args) {
	System.out.println(S6.a);
}
}

class S6
{
	static int a;
	
	static {
		a=300;
	}
	
	public static void main(String[] args) {
		a=4000;
		System.out.println(a);
	}
}