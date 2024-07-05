// 1)static method
/*public class method {

    public static void sayhello()
    {
        System.out.println("Hello Friends");
    }

    public static void main(String[] args) {
       // System.out.println("Hello Friends");
       sayhello();
    }
}*/

// 2) non-static method
public class method {

    public  void sayhello()
    {
        System.out.println("Hello Friends");
    }

    public static void main(String[] args) {
       // System.out.println("Hello Friends");
       method m1 = new method();
       m1.sayhello();
    }
}