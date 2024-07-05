// simple program
import java.util.Scanner;

public class Operators 
{
    // Method for addition two number 
    /*public static void addnumber(int a, int b)
    {
        int sum = a + b;
        System.out.println(sum);
    }

    // Method for subctraction two number 
    public static void subnumber(int a, int b)
    {
        int sum = a - b;
        System.out.println(sum);
    }

    // Method for multiplication two number 
    public static void mulnumber(int a, int b)
    {
        int sum = a * b;
        System.out.println(sum);
    }

    // Method for division two number 
    public static void divnumber(int a, int b)
    {
        int sum = a / b;
        System.out.println(sum);
    }

    // main method
    public static void main(String[] args) {
        int a;       // variable decleration of int data type
        int b;
        a=10;        // Value initialization to variable
        b=20;

        addnumber(a, b);        // Call method addition

        subnumber(a, b);       // call method substraction

        mulnumber(a, b);      // call method multiplication

        divnumber(a, b);     // call method division
        
    }
}  */

 // Take inpute from user
	// Method for addition two number
	public static void addnumber(int a,int b) 
	{
		System.out.println("addition of two numbers");
		int tot = a + b;
        System.out.println(tot);
	}
    
    // Main method
    public static void main(String[] args) 
	{
		int num1;         // variable decleration of int data type
		int num2;
		// Scanner sc = new Scanner(System.in);    // take inpute from user
		// System.out.println("enter the value of num1 ,num2");    // show output to user

		// num1 = sc.nextInt();     // Initialization value to num variable
		// num2 = sc.nextInt();
        //  addnumber(num1, num2);  // Call addition method 

    for (int i=0;i<=3;i++)          // Use loop for run same ststement multiple times
    {
        Scanner sc = new Scanner(System.in);    // take inpute from user
		System.out.println("enter the value of num1 ,num2"); 
        num1 = sc.nextInt();     
		num2 = sc.nextInt();
        addnumber(num1, num2);
    }
		
	}
}