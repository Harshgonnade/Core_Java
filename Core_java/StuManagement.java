import java.util.LinkedList;
import java.util.Scanner;

public class StuManagement 
{
    LinkedList<Student> CreatestuObj()
    {
        LinkedList<Student> ll=new LinkedList<>();

        Student s1=new Student(1001, "Harsh", 90);
        Student s2=new Student(1002, "Ritesh", 80);
        Student s3=new Student(1003, "Abhijit", 60);
        Student s4=new Student(1004, "Sourab", 70);
        Student s5=new Student(1005, "Anvi", 50);

        ll.add(s1);
        ll.add(s2);
        ll.add(s3);
        ll.add(s4);
        ll.add(s5);

        return ll;
    }

    void DispStuObj(LinkedList<Student> ll)
    {
        for(Student obj:ll)
        {
            obj.Diaplay();
        }
    }
   
    void UpdateStu(LinkedList<Student> ll)
    {
        System.out.println("Enter id and mark for update mark");
        Scanner sc=new Scanner(System.in);
        int sid=sc.nextInt();
        int smark=sc.nextInt();
        for(Student obj:ll)
        {
            if(obj.id==sid)
            {
                obj.mark=smark;
            }
            
        }
    }

    // void DeleteStu(LinkedList<Student> ll)
    // {
    //     System.out.println("Enter id for delete detail student");
    //     Scanner sc=new Scanner(System.in);
    //     int sid=sc.nextInt();
    //     for(Student obj:ll)
    //     {
    //         if(obj.id==sid)
    //         {
    //             ll.remove(obj);
    //         }
            
    //     }
    // }

    void DeleteStuObj(LinkedList<Student> ll)
    {
        System.out.println("Enter id for delete detail student");
        Scanner sc=new Scanner(System.in);
        int sid=sc.nextInt();
        int pos=0;
        for(Student obj:ll)
        {
            if(obj.id==sid)
            {
                pos=ll.indexOf(obj);
            }
            
        }ll.remove(pos);
    }

    
}