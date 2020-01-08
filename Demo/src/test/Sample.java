package test;
import java.util.*;

public class Sample
{
	public static void main(String[] args) 
	{
		Scanner sin = new Scanner(System.in);
		int a =0 ,b=0,res=0;
		System.out.println("enter the value for a ");
		a = sin.nextInt();
		System.out.println("enter the value for b ");
		b = sin.nextInt();
		res=a+b;
		
		System.out.println("the sample result of addition is "+res);
		sin.close();
		
		
	}

}
