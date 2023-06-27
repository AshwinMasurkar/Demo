package first;
import java.util.*;
public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		if(a>b)
		{
			System.out.println("a is the maximum between a and b with value"+a);
		}
		else
		{
			System.out.println("b is the maximum between a and b with value"+b);
		}
	sc.close();
	}

}
