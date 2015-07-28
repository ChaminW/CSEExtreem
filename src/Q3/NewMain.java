/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Chamin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int T= Integer.valueOf(scan.nextLine());
        //String[] grid = new String[T];
        
        //HashMap<Integer,Integer> hMap = new HashMap<Integer,Integer>();
        ArrayList<Integer> pA=new ArrayList<>();
        ArrayList<Integer> hA=new ArrayList<>();
        
        //Collections.max(pA);
        
        //int pArray[]=new int[200];
        //int hArray[]=new int[200];
        
        for(int i=0;i<T;i++){
            String str=scan.nextLine();
        
            String[] A = str.split(" ");
            //hMap.put(Integer.parseInt(A[0]), Integer.parseInt(A[1]));
            pA.add(Integer.parseInt(A[0]));
            hA.add(Integer.parseInt(A[1]));
            
        }
        int maxVal=Collections.max(hA);
        //System.out.println(maxVal);
        int maxId = hA.indexOf(maxVal);
        //System.out.println(maxId);
        int Dcharge=0;
        for(int t:pA){
            
            Dcharge+=abs(t-pA.get(maxId)); 
            
        }
        
        //System.out.println(Dcharge);
        int F=0;
        for(int t:hA){
            F+=t;
                
        }
        
        System.out.println((F-Dcharge)/T);
        
    }
    
}
