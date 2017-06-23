//THIS IS KNAPSACK PROBLEM YOU CAN HERE ALSO CALL SORT FUNCTION ALSO NOTE THAT THE VALUE OF W1 THE INTENDED
//WEIGHT CANNOT BE 0
//COPYRIGHT YUDHISTHER BHARGAVA

import java.io.*;
import java.util.*;
public class knapsack{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] w= new int[n];
        for(int i=0;i<n;i++)
        w[i]=s.nextInt();
        int w1=s.nextInt();
        int result=0;
      //  Arrays.sort(w);
      for(int i=0;i<n;i++)
      {
          for(int j=i+1;j<n;j++)
          {
              if(w[i]<w[j])
              {
                  int t=w[j];
                  w[j]=w[i];
                  w[i]=t;
              }
          }
      }
        int flag=1;
        while(w1!=result)
        {flag=1;
            if(w1>result)
            {
            for(int j=0;j<n;j++)
            {
                if(result+w[j]<w1+1)
                {
                    flag=0;
                result=result+w[j];
                System.out.println(w[j]);
                break;
                }
                else 
                continue;
            }
            }
            if(w1==result)
            break;
            if(flag==1)
            {
                System.out.println("could not be done" );
                break;
            }

        }
    }
}