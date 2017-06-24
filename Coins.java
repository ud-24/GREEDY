//TO CALCULATE THE DENOMINATIONS REQUIRED FOR A  GIVEN AMOUNT OF MONEY 
//COPYRIGHT YUDHISTHER BHARGAVA
import java.io.*;
import java.util.*;
public class Coins{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();//NUMBER OF DENOMINATIONS YOU HAVE
        if(n<1)
        {
            System.out.println("enter a valid range and try again ");
            System.exit(0);
        }
        int[] a=new int[n];//{1000,500,100,50,20,10,5,2,1};
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int m=s.nextInt();
        if(m<=0)
        System.out.println("Please enter a valid range");
        else
        {
        Arrays.sort(a);
        //for(int i=0;i<n;i++)
        //System.out.println(a[i]);
        int r=0;
        int flag=1;
        while(r!=m)
        {
            flag=1;
            for(int i=n-1;i>-1;i--)
            {
                if(m>=r+a[i])
                {
                    System.out.println(a[i]);
                    r=r+a[i];
                    flag=0;
                    break;
                }
                else
                continue;
            }
            if(flag==1)
{            System.out.println("The amount is smaller than all currencies ");
break;}

        }
        }      //  System.out.println(m);
       
    }
}