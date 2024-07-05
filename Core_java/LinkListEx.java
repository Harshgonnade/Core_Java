import java.util.LinkedList;

public class LinkListEx 
{
    public static void main(String[] args) {
        
   
    LinkedList<Integer> ll= new LinkedList<>();

    ll.add(10);
    ll.add(20);
    ll.add(30);
    ll.add(40);
    ll.add(50);

    System.out.println("Given element");
    System.out.println(ll);

    // Delete element by using different way
    ll.removeLast();
    System.out.println("After remove last element");
    System.out.println(ll);

    ll.removeFirst();
    System.out.println("After remove first element");
    System.out.println(ll);

    ll.remove(0);
    System.out.println("After remove by using index element");
    System.out.println(ll);

    // Add element by using different way
    ll.add(0,20);
    System.out.println("After add by using index element");
    System.out.println(ll);

    ll.add(0,10);
    System.out.println("After add first by using index element");
    System.out.println(ll);

    ll.add(3, 50);
    System.out.println("After add  last by using index element");
    System.out.println(ll);

    // Update element by using different way
    ll.set(0,100);
    System.out.println("After update first by using index element");
    System.out.println(ll);

    ll.set(2,300);
    System.out.println("After update middle by using index element");
    System.out.println(ll);

    ll.set(4, 500);
    System.out.println("After update last by using index element");
    System.out.println(ll);

}
}
