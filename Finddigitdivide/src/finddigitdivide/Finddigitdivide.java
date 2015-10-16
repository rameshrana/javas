/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finddigitdivide;

import java.util.Scanner;

/**
 *
 * @author Ramesh
 */
public class Finddigitdivide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int count=0;
        int r;
        for(int i=0;i<t;i++){
            int n=in.nextInt();
            int temp=n;
            while(n!=0)
{
r=n%10;
if(r!=0 && temp%r==0)
    count++;
n=n/10;

}
            System.out.println(count);
            count=0;
    }
   
}
}
