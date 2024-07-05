import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx 
{

    public static void main(String[] args) 
    {
        // Integer ArrayList
    //     ArrayList<Integer> al=new ArrayList<>();

    //     al.add(10);
    //     al.add(20);
    //     al.add(30);
    //     al.add(40);
    //     al.add(50);
    //     //display
    //     for(Integer ele:al)
    //     {
    //         System.out.println(ele);
    //     }
    //     // delete
    //     al.remove(4);
    //    // update
    //     al.set(0,5);
    //     //display
    //     System.out.println();
    //     for(Integer ele:al)
    //     {
    //         System.out.println(ele);
    //     }

    //     System.out.println();
    //     // display by using iterator
    //     Iterator it=al.iterator();
    //     while (it.hasNext())
    //     {
    //         System.out.println(it.next());
    //     }

    //     System.out.println();
    //    // remove by using value at position
    //     int pos=al.indexOf(20);
    //     al.remove(pos);
    //     for(Integer ele : al)
    //     {
    //         System.out.println(ele);
    //     }
    //     System.out.println("List is empty "+al.isEmpty());



    // String ArrayLIst
    ArrayList<String> al=new ArrayList<>();

    al.add("Harsh ");
    al.add("Is ");
    al.add("Running ");

    System.out.println(al);
    System.out.println();
    // Diaplay given string
    System.out.println("Diaplay given string");
    for(String a:al)
    {
        System.out.print(a);
    }
    System.out.println();
    // After add String
    al.add("On ");
    al.add("Road");
    System.out.println();
    System.out.println("After add String");
    for(String a:al)
    {
        System.out.print(a);
    }
    System.out.println();
    // After remove string
    al.remove(0);
    System.out.println();
    System.out.println("After remove string");
    for(String a:al)
    {
        System.out.print(a);
    }
    System.out.println();
    // After add string in 0 index
    al.addFirst("Harsh ");
    System.out.println();
    System.out.println("After add string in 0 index");
    for(String a:al)
    {
        System.out.print(a);
    }
    }
}
