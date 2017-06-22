/* MY PRIMS ALGO BASIC BY ADJACENCY MATRIX
WHAT YOU NEED TO DO IS ASSUME A HIGHEST NUMBER THAT YOU PLACE FOR NO EDGE FOR IT TO WORK PROPERLY AND PLACE THE SAME NUMBER IN PLACE OF 9999 AT ALL PLACES IN CODE
NOTE : THE NUMBER USED MUST BE HIGHEST */
//COPYRIGHT TO YUDHISTHER BHARGAVA 

import java.io.*;
import java.util.*;
public class Prim{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();//NUMBER OF VERTICES
        //ADJACENCY MATRIX
        int[][] a= new int[n][n];
        //ENTER THE WEIGHTS
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        prims(a); 
         
    }
    public static void prims(int[][] a )
    {
        int n=a.length;
        int[] b= new int[n];
        for(int i=0;i<n;i++)
        b[i]=i;
        int[] c= new int[n];
        for(int j=0;j<n;j++)
        c[j]=-1;
        c[0]=0;
        b[0]=-1;
        int cost=0;
        System.out.print(0+" ");
       while(!isempty(b))
       {
           
           int pos=0,posto=0;
           int min=9999;
           for(int k=0;k<n;k++)
           {
               if(c[k]!=-1)
               {
                   for(int m=0;m<n;m++)
                   {
                       
                       if(a[k][m]<min)
                       {
                           pos=k;
                           posto=m;
                           min=a[k][m];
                           a[k][m]=9999;
                           a[m][k]=9999;
                       }
                   }
               }
           }
           c[posto]=posto;
           b[posto]=-1;
           System.out.print(posto+" ");
           cost=cost+min;
       }
       System.out.println();
       System.out.println(cost);
    }
    public static boolean isempty(int[] a)
    {
        int l=a.length;
        int flag=0;
        for(int i=0;i<l;i++)
        {
            if(a[i]==-1)
            {
                flag=1;
                continue;
            }
            else
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
        return true;
        else 
        return false;
    }
}