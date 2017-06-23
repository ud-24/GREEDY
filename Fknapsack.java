import java.io.*;
import java.util.*;
public class Fknapsack{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        float[] w= new float[n];
        float[] v=new float[n];
        for(int i=0;i<n;i++)
        {
            w[i]=s.nextFloat();
            
        }
        for(int i=0;i<n;i++)
        {
            v[i]=s.nextFloat();
            
        }
        float w1=s.nextFloat();
        float[] rat= new float[n];
        for(int i=0;i<n;i++)
        {
            rat[i]=v[i]/w[i];
        }
        for(int i=0;i<n;i++)
        {
             for(int j=i+1;j<n;j++)
             {
                 if(rat[i]<rat[j])
                 {
                     float t=rat[i];
                     rat[i]=rat[j];
                     rat[j]=t;
                     t=w[i];
                     w[i]=w[j];
                     w[j]=t;
                     t=v[i];
                     v[i]=v[j];
                     v[j]=t;
                 }
             }
        }
        float result=0;
        int flag=1;
       int r=1;
      float val=0;
       while(w1!=result)
        {
            flag=1;
            if(result<w1)
            {
                for(int i=0;i<n;i++)
                {
                    if(result+w[i]<=w1)
                    {
                        result=result+w[i];
                        flag=1;
                        r=i;
                        System.out.println(w[i]+" "+i);
                       val=val+v[i];
                    }
                   else
                    {
                        continue;
                       
                    }
                }
            }
          
           if(flag==1)
            {
               r++;
                if((w1-result)<w[r] && result <w1) {
                
            float m = w1-result;
             m=m/w[r];
            result=result+m*w[r];
            System.out.println(m+" "+w[r]);
           val=val+m*v[r];
            }
            
            }
        }
        System.out.println("\n\n "+val);
        
    }}
