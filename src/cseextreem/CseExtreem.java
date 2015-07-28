/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cseextreem;

import java.util.Scanner;

public class CseExtreem {
    
    public static int cal(String grid[]){
        int N=grid[0].length();
        //System.out.println(N);
        int count=0;
        for(int y=0;y<2;y++){
            for(int x=0;x<N;x++){    
                char c =grid[y].charAt(x);
                //System.out.println(c);
                if(c =='_'){
                    if(y==0){  // y==0
                        if(x+1<N&&grid[y].charAt(x+1)=='T'){
                            continue;
                        }
                        else if(x+1<N&&grid[y+1].charAt(x+1)=='T'){
                            continue;
                        }
                        else if(grid[y+1].charAt(x)=='T'){
                            continue;
                        }
                        else if(x-1>-1&&grid[y+1].charAt(x-1)=='T'){
                            continue;
                        }
                        else if(x-1>-1&&grid[y].charAt(x-1)=='T'){
                            continue;
                        }
                        
                        else{
                            //myName.substring(0,x)+'x'+myName.substring(5);
                            grid[y]=grid[y].substring(0,x)+'T'+grid[y].substring(x+1);
                            //System.out.println(grid[y]+"one count");
                            count+=1;
                        }
                    }
                    else{  // y=1 in second raw
                        if(x+1<N&&grid[y].charAt(x+1)=='T'){
                            continue;
                        }
                         else if(x-1>-1&&grid[y].charAt(x-1)=='T'){
                            continue;
                        }
                        else if(x-1>-1&&grid[y-1].charAt(x-1)=='T'){
                            continue;
                        }
                        else if(grid[y-1].charAt(x)=='T'){
                            continue;
                        }
                        else if(x-1<N&&grid[y-1].charAt(x+1)=='T'){
                            continue;
                        }
                        else{
                            //myName.substring(0,x)+'x'+myName.substring(5);
                            grid[y]=grid[y].substring(0,x)+'T'+grid[y].substring(x+1);
                            //System.out.println(grid[y]+"one count");
                            count+=1;
                        }
                    }
                    
                }
                else{
                    count+=1;
                }
                
            }
            
        }
        
        
        
        
        return count;  
    }
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

      
            String[] grid = new String[2];
            
            grid[0]=scan.nextLine();
            grid[1]=scan.nextLine();    
     
            int count = cal(grid);
            System.out.println(count);
            

        


        }
    }
    

