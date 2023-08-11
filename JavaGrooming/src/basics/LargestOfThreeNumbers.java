package basics;

public class LargestOfThreeNumbers {
	public static void main(String[] args) {
		int a=510;
		int b=244;
		int c=34;
		int res=a>b?a:b;
		int fres=res>c?res:c;
		System.out.println(fres+ " is the largest number");
	}
}
