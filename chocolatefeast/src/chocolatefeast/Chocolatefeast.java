/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chocolatefeast;

import java.util.Scanner;

/**
 *
 * @author Ramesh
 */
public class Chocolatefeast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int p,c,wo,cc,r=0,aw,fc;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            p=in.nextInt();
            c=in.nextInt();
            wo=in.nextInt();
           cc=p/c;
           aw=cc;
           while(aw>=wo)
           {  
               r++;
               aw=aw-wo+1;
           }
           fc=cc+r;
            System.out.println(fc);
            r=0;
        }
    }
    
}
