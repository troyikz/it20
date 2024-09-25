/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thirdpackage;

/**
 *
 * @author Erick James Rubin
 */
public class MultidimensionalArray {
  
    public static void main(String[] args) {
       
        char[][] sos = {
            {'S', 'O', 'S'},
            {'O', 'S', 'O'},
            {'S', 'O', 'S'}
        };

       
        printSOS(sos);
    }

  
    public static void printSOS(char[][] signal) {
        for (int i = 0; i < signal.length; i++) {
            for (int j = 0; j < signal[i].length; j++) {
                System.out.print(signal[i][j] + " "); 
            }
            System.out.println(); 
        }
    }
}

    
}
