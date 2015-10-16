/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package angryprofessor;

import java.util.*;

public class Angryprofessor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner in=new Scanner(System.in);
    int t=in.nextInt();
    int a[]=new int[1000];
    String ans[]=new String[1000];
    if(t>=1 && t<=10)
    for(int i=0;i<t;i++)
    {
        int c=0;
       int n=in.nextInt();
       int k=in.nextInt();
       if(n>=1 && n<=1000 && k<=n && k>=1)
       {
       for(int j=0;j<n;j++)
       {
           a[j]=in.nextInt();
       }
       for(int j=0;j<n;j++)
       {
           if(a[j]<=0 && a[j]>=-100 && a[j]<=100)
           {
          c++;
           }
       }
       if(c>=k)
       {
          ans[i]="NO";
       }
       else
           ans[i]="YES";
    }
    }
    for(int i=0;i<t;i++)
    {
        System.out.println(ans[i]);
    }
    }
}