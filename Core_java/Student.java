public class Student 
{
    int id;
    String name;
    int mark;

    public Student(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    void Diaplay()
    {
        System.out.println(id+" "+name+" "+mark);
    }
    
    
}
