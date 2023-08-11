package basics;

public class LogicalAND {
	public static void main(String[] args) {
		int a=10;
		int b=23;
		boolean res=a++<10 && ++b>10 ;
		System.out.println(res);
		System.out.println(a);
		System.out.println(b);
	}
}
