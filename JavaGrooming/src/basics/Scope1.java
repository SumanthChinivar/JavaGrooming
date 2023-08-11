package basics;

public class Scope1 {
public static void main(String[] args) {
	int a=10;
	{
		int b=20;
		a=a+b;
		System.out.println(a);//30
		System.out.println(b);//20
	}
	System.out.println(a);//30
}
}
