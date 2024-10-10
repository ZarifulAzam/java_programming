/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syntax;
import java.util.Scanner;
/**
 *
 * @author zarif
 */
public class Syntax {

    /**
     * @param args the command line arguments
     */
    private static Scanner input;
    int n, i;
    void setitem(){
        input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        n = input.nextInt();
        for(i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Syntax oneToN;
        oneToN = new Syntax();
        oneToN.setitem();
    }
    
}

