/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellularautomataproject;

import java.util.Random;

/**
 *
 * @author ww006
 */
public class Conway {
    int size = 50;
    boolean [][] grid = new boolean[size][size];
    boolean [][] grid2 = new boolean[size][size];

    Conway(){
        Random rand = new Random();
        for(int count =0; count<grid.length;count++){
            for(int count2 = 0; count2<grid.length;count2++){
                if (rand.nextBoolean()==true){
                    grid[count][count2]=true;
                }
                else
                    grid[count][count2]=false;
            }
        }
    }
    
    public void copy1(){
        for(int count =0; count<grid.length;count++){
            for(int count2 = 0; count2<grid.length;count2++){
                if (grid2[count][count2]==true){
                    grid[count][count2]=true;
                }
                else
                    grid[count][count2]=false;
            }
            
        }
    }
    
    public void applyRules(){
        for(int count =0; count<grid.length;count++){
            for(int count2 = 0; count2<grid.length;count2++){
                grid2[count][count2]=isAlive(count, count2);
            }
            
        }
    }
    
    public boolean isAlive(int i, int j){
        int neighborCount=0;
        if(i>0&&i<size-1){
            if (j>0&&j<size-1){
                if(grid[i][j-1]==true){
                    neighborCount++;
                }
                if(grid[i][j+1]==true){
                    neighborCount++;
                }
                if(grid[i-1][j-1]==true){
                    neighborCount++;
                }
                if(grid[i-1][j]==true){
                    neighborCount++;
                }
                if(grid[i-1][j+1]==true){
                    neighborCount++;
                }
                if(grid[i+1][j-1]==true){
                    neighborCount++;
                }
                if(grid[i+1][j]==true){
                    neighborCount++;
                }
                if(grid[i+1][j+1]==true){
                    neighborCount++;
                }

            }
        }
        boolean returnBool;
        if(neighborCount==2||neighborCount==3&&grid[i][j]==true){
            returnBool=true;
        }
        else if(neighborCount==3&&grid[i][j]==false){
            returnBool=true;
        }
        else{
            returnBool=false;
        }
        return returnBool;
        
        
        
    }
    
    
    public void showGrid(){
        for(int count =0; count<grid.length;count++){
            for(int count2 = 0; count2<grid.length;count2++){
                if (grid[count][count2]==true){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
