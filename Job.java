//* THIS ALGORITHM IS BASED ON JOB SEQUENCING PROBLEM IN GREEDY THIS HAS BEEN MADE BY YUDHISTHER BHARGAVA
//COPYRIGHT
import java.io.*;
import java.util.*;
public class Job{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int[] time= new int[n];
        int[] profit= new int[n];
        boolean[] times= new boolean[n];
        int[] seq= new int[n];
        int i=0;
        int[] result = new int[n];
        for( i=0;i<n;i++)
        times[i]=false;
        for(i=0;i<n;i++)
        seq[i]=i;
        for(i=0;i<n;i++)
        time[i]=s.nextInt();
        for(i=0;i<n;i++)
        profit[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(profit[i]<profit[j])
                {
                    int t=profit[j];
                    profit[j]=profit[i];
                    profit[i]=t;
                    t=seq[i];
                    seq[i]=seq[j];
                    seq[j]=t;
                    t=time[i];
                    time[i]=time[j];
                    time[j]=t;
                }
            }
        } System.out.println("\n\n\n");
        for(int k=0;k<n;k++)
        {
            for(int h=time[k]-1;h>-1;h--)
            {
                if(times[h]==false)
                {
                    result[k]=profit[k];
                    times[h]=true;
                    int r=h+1;
                    System.out.println(h+" to "+r+" "+seq[k]+" "+profit[k]);
                    //System.out.println(h);
                    break;
                }
                else 
                continue;
            }
        }
        System.out.println("\n\n\n");
        for(int j=0;j<n;j++)
        {
            System.out.println(result[j]);
        }
    }
}