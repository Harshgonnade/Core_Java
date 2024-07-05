import java.util.LinkedList;

public class StuMain 
{
    public static void main(String[] args) 
    {
        StuManagement st=new StuManagement();
         LinkedList<Student> ll=st.CreatestuObj();

         System.out.println("Given Object");
         st.DispStuObj(ll);

         st.UpdateStu(ll);
         System.out.println("After update marks");
         st.DispStuObj(ll);

        //  st.DeleteStu(ll);
        //  System.out.println("After delete student object");
        //  st.DispStuObj(ll);

         st.DeleteStuObj(ll);
         System.out.println("After delete student object by using position");
         st.DispStuObj(ll);
    }    
}
