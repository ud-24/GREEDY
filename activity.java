/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class activity
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int start[]= new int[n];
		int finish[]= new int[n];
		for(int i=0;i<n;i++)
		start[i]=s.nextInt();
		for(int j=0;j<n;j++)
		finish[j]=s.nextInt();
		int seq[]= new int[n];
		for(int k=0,m=1;k<n;k++,m++)
		{
		    seq[k]=m;
		}
		for(int l=0;l<n;l++)
		{
		    for(int p=l+1;p<n;p++)
		    {
		        if(finish[l]>finish[p])
		        {
		            int t=finish[l];
		            finish[l]=finish[p];
		            finish[p]=t;
		             t=start[l];
		            start[l]=start[p];
		            start[p]=t;
		             t=seq[l];
		            seq[l]=seq[p];
		            seq[p]=t;
		        }
		    }
		}
	//	boolean b[] = new boolean[n];
		int m=finish[0];
		System.out.println(start[0]+" "+finish[0]+" "+seq[0]);
		for( int q=1;q<n;q++)
		{
		    if(start[q]>=m)
		    {
		        System.out.println(start[q]+" "+finish[q]+" "+seq[q]);
		        m=finish[q];
		    }
		}
	
	}
}
