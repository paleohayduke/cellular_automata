/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellularautomataproject;

/**
 *
 * @author ww006
 */
public class CellularAutomataProject {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Conway game = new Conway();
//        game.showGrid();
//        game.applyRules();
//        game.copy1();
//        System.out.println("******************************************");
//        System.out.println("******************************************");
//        System.out.println("******************************************");
//        game.showGrid();
        for(int count = 0; count<100;count++){
            game.showGrid();
        game.applyRules();
        game.copy1();
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("******************************************");
        game.showGrid();
        }
        
        
    }
    
}
