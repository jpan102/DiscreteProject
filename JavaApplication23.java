
package javaapplication23;

import java.util.InputMismatchException;
import java.util.Scanner;


public class JavaApplication23 {

    
    public static void main(String[] args) {
    mains();
    }
    public static void mains(){
        SuperC superc = new SuperC();
        Scanner a = new Scanner(System.in);
        try{
            
        System.out.println("   WELCOME TO OUR PROGRAM");
        System.out.println("1.Combination and Permutation!\n2.Combination and Permutation with Repetition!\n3.Stirling Numbers!\n4.Pascal Triangle!\n5.Exit");
        System.out.print("Enter your choice: ");
        int c = a.nextInt();
        
        if (c == 1) {
            superc = new ComPe();
            superc.perst();
        } else if (c == 2) {
            System.out.println("1.Permutation\n2.Combination");
            System.out.print("Enter your Choice: ");
            int cho = a.nextInt();
            if (cho == 1) {
                superc = new rep();
                superc.Prepetition();
            } else if (cho == 2) {
                superc = new rep();
                superc.Crepetition();
            }
          

        } else if (c == 3) {
            superc = new Stir();
            superc.stirling();
        } else if (c == 4) {
            superc= new pascal();
            superc.Triangle();
        }
        else if (c == 5){
            System.out.println("Thank you!");
            System.exit(0);
        }
        else if ( c > 5 || c <=0){
            System.out.println("Invalid input. Please try again");
            mains();
        }
        
       
        }
        catch(InputMismatchException p){
                System.out.println("Invalid input");
                mains();

        }
        
        
        }
            
    }
    

