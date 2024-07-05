public class Array 
{
    public static void Show(int[] num)
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(num[i]);
        }
        for(int ele:num)
        {
            System.out.println(ele);
        }
    }

    public static void Findsum(int[] per)
    {
        int sum=0;
        for(int i=0;i<per.length;i++)
        {
            sum=sum+per[i];
            System.out.println(per[i]);
        }
        System.out.println("-------");
        System.out.println("sum: "+sum);
    }
    public static void main(String[] args) 
    {
         // By using for type :-
        // int[] num={1,2,3,4,5};
        // for(int i=0;i<5;i++)
        // {
        //     System.out.println(num[i]);
        // }
        // Show(num);

        // By using for each type :-
        // int[] mark=new int[5];
        // mark[0]=6;
        // mark[1]=7;
        // mark[2]=8;
        // mark[3]=9;
        // mark[4]=10;
        // for(int ele:mark)
        // {
        //     System.out.println(ele);
        // }

int[] per={11,12,13,14,15};
        // int sum=0;
        // for(int i=0;i<per.length;i++)
        // {
        //     sum=sum+per[i];
        // }
        // System.out.println(sum);

        Findsum(per);
    }    
}
