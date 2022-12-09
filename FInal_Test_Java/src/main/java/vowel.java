import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		int count =0;
		String vowel="";
		
		//String str=new String("Welcome to Automaion Testing");
     for (int i=0;i<str.length();i++)
     {
    	 if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
           {
    		 vowel+=str.charAt(i);
    		 
    		 
         count++;

           }}
    	 if (count>0)
    	 {
    		 System.out.println("give string "+str+" has vowel "+vowel);
    	 }
    	 else
    	 {
    		 System.out.println("Given string  does not conatin vowel"); 
    	 }
     }
	}


