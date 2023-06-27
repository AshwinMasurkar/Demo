package first;

import java.util.Scanner;

public class Fortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number");
		int num=sc.nextInt();
		int i;
		for(i=0;i<=num;i++)
		{
			System.out.println(num*i);
		}

	}

}
