import java.util.*;

//import org.w3c.dom.ls.LSException;
public class UniqueEle {
    public static  void PrintUniqEle(int arr[],int size)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<size;i++)
        {
            if(hm.containsKey(arr[i]))
                hm.put(arr[i],hm.get(arr[i])+1);
            else 
                hm.put(arr[i],1);
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet())
        {
            if(entry.getValue()>=1)
                System.out.print(" "+entry.getKey());
        }
    }
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        PrintUniqEle(x,n);

        sc.close();
    }
}