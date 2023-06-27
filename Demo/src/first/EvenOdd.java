package first;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		if (a%2!=0)
		{
			System.out.println("Wierd");
		}
		else if(a%2==0 && a>=2 && a<=5)
		{
			System.out.println(" Not Wierd");
		}
		else if(a%2==0 && a>20)
		{
			System.out.println("Not Wierd");
		}
		else 
			System.out.println("Wierd");
		sc.close();
	}

}
