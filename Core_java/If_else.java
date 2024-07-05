import java.util.Scanner;

public class If_else 
{
    public static void percentage(float per)
    {
        if(per>=70 || per<=99)
        {
            System.out.println("Your are pass with A++ grade:" + per + "Percentage");
        }
        else if(per>=56 || per<=69)
        {
            System.out.println("Your are pass with A+ grade :" + per + " Percentage");
        }
        else if(per>=45 || per<=55)
        {
            System.out.println("Your are pass with B grade:" + per + " Percentage");
        }
        else
        {
            System.out.println("Your are Fail  :" + per + " Percentage");
        }
    }
    public static void main(String[] args) 
    {
        // find the percentage of stiudent
        int maths,eng,hindi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your maths marks");
        maths = sc.nextInt();
        System.out.println("Enter your english marks");
        eng = sc.nextInt();
        System.out.println("Enter your hindi marks");
        hindi = sc.nextInt();
        float total = (maths+hindi+eng);
        float per = ((total/300)*100);
        System.out.println("Percentage :" + per);
        
        // percentage(per);

    }    
}
