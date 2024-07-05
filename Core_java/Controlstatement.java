import java.util.Scanner;

public class Controlstatement 
{
    // Method for addition two number 
    public static void addnumber(int a, int b)
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
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter your choice :");
        System.out.println("1) Addition ");
        System.out.println("2) Substraction ");
        System.out.println("3) Multiplicatio ");
        System.out.println("4) Division ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addnumber(a,b);
                break;
            case 2:
                subnumber(a, b);
                break;
            case 3:
                mulnumber(a, b);
                break;
            case 4:
                divnumber(a, b);
                break;
            default:
            System.out.println("Invalid input");
                break;
        }
    }
}
