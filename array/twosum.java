import java.util.Scanner;

public class twosum
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter elements of the arrray:");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target value:");
        int target=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.print("pair found at index:"+i +"and "+j+"\n");
                   return;
                }
                
            }

        }
        sc.close();
    }
}
