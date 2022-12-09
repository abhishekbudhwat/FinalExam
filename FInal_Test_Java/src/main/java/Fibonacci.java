
import java.util.Scanner;

public class Fibonacci {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the count");
	
	int count=sc.nextInt();
	int FirstNumber=0;
	int SecondNumber=1;
	int ThirdNumber;
	//int count=11;
	System.out.print(FirstNumber+" "+SecondNumber);
	for(int i=2;i<count ;++i)
	{
		 ThirdNumber=FirstNumber+SecondNumber;
		System.out.print(" "+ThirdNumber);
		FirstNumber=SecondNumber;
		SecondNumber=ThirdNumber;
		
	}

}
	
}
