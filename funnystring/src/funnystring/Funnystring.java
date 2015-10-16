/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package funnystring;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Ramesh
 */
public class Funnystring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int t;
        t=in.nextInt();
        String str;
        String rstr;
        int c=0;
        for(int i=0;i<t;i++){
          str=in.next();
          int l=str.length();
          StringBuffer sb=new StringBuffer(str);
          rstr=sb.reverse().toString();
          for(int j=1;j<l;j++)
          {
           int s1=str.charAt(j);
           int s2=str.charAt(j-1);
           int s3=rstr.charAt(j);
           int s4=rstr.charAt(j-1);
              //System.out.println(s1+" "+s2+" "+s3+" "+s4);
           if(abs(s1-s2)==abs(s3-s4)){
                c++;
           //System.out.println(c);
          }
          }
           if(c==(str.length()-1))
                  System.out.println("Funny");
           else
                  System.out.println("Not Funny");
           c=0;
        }
}
}