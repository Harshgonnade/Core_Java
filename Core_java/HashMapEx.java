import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx 
{
    HashMap<Integer,Student> CreateObj()
    {
    HashMap<Integer,Student> hm=new HashMap<>();
        
        Student s1 = new Student(1001, "Harsh", 100);
        Student s2 = new Student(1002, "Ritesh", 90);
        Student s3 = new Student(1003, "Abhijit", 80);
        Student s4 = new Student(1004, "Sourab", 70);
        Student s5 = new Student(1005, "Aman", 60);

        hm.put(1, s1);
        hm.put(2, s2);
        hm.put(3, s3);
        hm.put(4, s4);
        hm.put(5, s5);

        return hm;
    }

    // Display 
    void DisplayDetail(HashMap<Integer,Student> hm)
    {
        for(Map.Entry<Integer,Student> m:hm.entrySet())
       {
        System.out.print(m.getKey()+" ");
        m.getValue().Diaplay();
        System.out.println(" ");
       }
    }

    // Delete
    void DeleteObj(HashMap<Integer,Student> hm)
    {
        System.out.println("Enter key to delete");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        hm.remove(k);

    }

    // Update
    void UpdateObj(HashMap<Integer,Student> hm)
    {
        System.out.println("Enter key to update");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        Student s=hm.get(k);
        s.mark=100;
    }
    public static void main(String[] args) 
    {
       HashMapEx st=new HashMapEx();
       HashMap<Integer,Student> a = st.CreateObj();
       System.out.println("Student Detail");
       st.DisplayDetail(a);

       System.out.println("After delete");
       st.DeleteObj(a);
       st.DisplayDetail(a);

       System.out.println("After update");
       st.UpdateObj(a);
       st.DisplayDetail(a);
    }    
}
