/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utopiantree;

import java.util.Scanner;

/**
 *
 * @author Ramesh
 */
public class Utopiantree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n;
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int h=1;
            n=in.nextInt();
            if(n>1){
                for(int j=1;j<=n;j++){
                if(j%2==0)
                h=h+1;
                else
                    h=h*2;
                }
            }
            if(n==1){
                h=h*2;
            }
            System.out.println(h);
        }
    }
    
}
