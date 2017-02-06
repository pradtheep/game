/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

/**
 *
 * @author Pradeep
 */
public class Mygame {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception 
    {
        int test=0,cc = 0;
        // TODO code application logic here
       String name1,name2;
       
       InputStreamReader r=new InputStreamReader (System.in);
       
       BufferedReader br=new BufferedReader(r);  
       
        System.out.println("Enter the First Name ");
        name1=br.readLine();
        System.out.println("Enter the Second Name ");
        name2=br.readLine();
        int d=name1.length()+name2.length();
      //  System.out.println("total "+d);
        char []name12=name1.toCharArray();
        char []name22=name2.toCharArray();
        Arrays.sort(name12);
        Arrays.sort(name22);
         name1=new String(name12);
         name2=new String (name22);
         int c=0,count=0,k=0;
         String flag="";
           
       char same='\0';
        
        for(int i=0;i<name1.length();i++)
        {
             if(same==name1.charAt(i))
             
             {
               k++ ;
             continue;
             }
             else
             {
             
               
            for (int j=0;j<name2.length();j++)
            {
                // System.out.println("for J ");             
               
                if (name1.charAt(i)== name2.charAt(j))
                {
                    same=name2.charAt(j);                   
                  flag="set";
                  c++;      
                //   break ; 
                 /*for(int k=i+1;k<name1.length();k++)
                 {
                      if (name1.charAt(i)== name1.charAt(k))
                      {
                          c++;
                          
                      }
                 }*/
                }
                 
                             
                 }
            if ("set".equals(flag))
                 {
                     count++;
                     flag="reset";
                 
                 
                    
                
                
                
            }
                     }
        
        }
        c=c+count+k;
        int e=d-c;  
      System.out.println("number is entry" +count);
      System.out.println(+e);
       System.out.println("k="+k);
        
        
        Character [] flames= {'F','L','A','M','E'};
       // char[] array = { 'a', 'r', 't', 'i', 's', 't' };
        int x,uu=5;
      System.out.println(+flames[0]);
       while (uu!=1)
       {
              System.out.println("enetring while loop");
        if(e>uu)
        {
            x=e/uu;
            e=e-x*uu;
            System.out.println("the possition on flame "+x);
            for( cc=e-1;cc<=uu-(cc-1);cc++)
            {
                // int ccc=cc;
                flames[cc]=flames[cc+1];
                
            }
            
            //flames[cc]='\0';
            uu--;
            //continue;
        }
        else
        {
            for( cc=e-1;cc<=uu-(cc-1);cc++)
            {
                // int ccc=cc;
                flames[cc]=flames[cc+1];
                
            }
            
            flames[cc]='\0';
            uu--;
            
            
        }
        
        
        
        }
       System.out.print("out put"+ flames[cc]);
       //System.out.println("falmes length is "+flames.length);
           
     //  System.out.println("resultent value is"+flames[x] );
      for(int i=0;i<=flames.length-1;i++)
      {
          System.out.print(+ flames[i]);
      }
    }
    
}
