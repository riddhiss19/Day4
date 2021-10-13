import java.util.*;

public class GreedyFlorist 
{

    public static void main(String args[]) 
    {

        Scanner s = new Scanner(System.in);
        int n,k,i;
        n = s.nextInt();
        k = s.nextInt();

        int arr[] = new int[n];
        for (i = 0; i < n; i++)
         {
            arr[i] = s.nextInt();
         }

        Arrays.sort(arr);
        
        int total = 0;
        
        if(k >= n)
        {
            for(i=0;i<n;i++)
            {
                total +=  arr[i];
            }
            System.out.println(total);
        }
        else
        {
            int x = 0;            
            while(n > 0)
            {                
                for(i=0;i<k;i++)
                {
                    total += arr[n-1]*(x+1);
                    n--;
                    if(n == 0)
                        break;
                }                
                x++;
            }
            System.out.println(total);
        }        
    }
}