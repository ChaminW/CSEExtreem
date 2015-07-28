/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chamin
 */
public class NewMain {
    
    public static String getSub(String word){
        int count=0;
   StringBuilder sub= new StringBuilder();
   for( int i = 0 ; i < word.length() ; i++ )
   {
      for( int j = 1 ; j <= word.length() - i ; j++ )
      {
         sub .append(word.substring(i, i+j)).append("\n");
          String subStr=word.substring(i, i+j);
          System.out.println(word.substring(i, i+j));
          if(subStr.length()%2==0&& subStr.substring(0,subStr.length()/2).equals(subStr.substring(subStr.length()/2))){
                   count++;
                   System.out.println("+1");
                   System.out.println(subStr.substring(0,subStr.length()/2)+"        "+subStr.substring(subStr.length()/2));
                   
               }
          
          
          
      }
   }
        System.out.println(sub.toString());
   return sub.toString();
}
/*
    public static ArrayList<String> getSubstrings(String word)
    {
        String str="",subStr = "";
        ArrayList<String> array = new ArrayList<String>();
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; i+j <= word.length(); j++) { //added i+j and equal to comparison
               subStr = word.substring(j, i + j); //changed word.substring(i, i + j) to word.substring(j, i + j)
               if("".equals(subStr)){
                   continue; //removing empty substrings
               }
               
                System.out.println(subStr);
               if(subStr.length()%2==0&& subStr.substring(0,subStr.length()/2).equals(subStr.substring(subStr.length()/2))){
                   //count++;
                   System.out.println("+1");
                   System.out.println(subStr.substring(0,subStr.length()/2)+"        "+subStr.substring(subStr.length()/2));
                   
               }
               array.add(subStr);
               
               
               
            }
        }
        
        
        
        
        return array;
    }
    */
    //Public static int getVal()
    
    public static int cal(String word){
        
        
        for(int x=0;x==word.length();x--){
           
        
        
        return 0;
     
        }
        return 0;
    }
    
    public static void main(String[] args) {
        
        
    
       Scanner scan = new Scanner(System.in);
        
        int T= Integer.valueOf(scan.nextLine());
        
        
        ArrayList<String[]> A1 = new ArrayList<String[]>();
        
        for(int i=0;i<T;i++){
            String str=scan.nextLine();
            char C[]=str.toCharArray();
            
            String[] array = new String[C.length];
            for(int j=0;i<C.length;j++){
                array[j]=C[j]+"1";
                A1.sort(null);
            }
            





            //getSub("baaba");
            //System.out.println("****************************");
            
            //A1=getSubstrings(str);
            //System.out.println(A1);
            
        }
        
       
        
        
        
        
    }
}
