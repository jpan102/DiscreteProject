
package javaapplication23;
import java.util.*;
import java.math.BigInteger;


public class ComPe extends SuperC {

    public void perst(){
        
        Scanner a = new Scanner(System.in);
      
        try{
        
        System.out.print("Enter 'N' num: ");
        int num = a.nextInt();
           
        System.out.print("Enter 'R' num: ");
        int rum = a.nextInt();
        int min = num - rum;
        
        if (rum > 500 || num > 500 ){
            System.out.println("Input shouldn't exceed to 500.");
            perst();
        }
        else if (num <= 0 && rum <=0){
            System.out.println("Please enter positive integer.");
            perst();
        }
        else if (rum <= num ){
        
        System.out.println("PERMUTATION: "+factorial(num,rum,min));
        System.out.println("COMBINATION: "+factorial2(num,rum,min));
        exit();
        
        }
        
        else if (num < rum || rum <500 || num < 500){
            System.out.println("Your 'n' must be greater that your 'r'");
            perst();
        }
    }
         catch(InputMismatchException ex){
         System.out.println("Invalid input. Letters and characters are not allowed in this program.");
         perst();
         }
    }
     public void exit() {
        Scanner a= new Scanner(System.in);
        try{
        System.out.println("Do you want to try again? [0-No, 1-Yes, 2-Main Menu]");
        int a1= a.nextInt();
        
        if( a1 == 1){
        perst();    
        }
        else if( a1 == 2){
            mains();
        }
        else if ( a1 == 0){
            System.out.println("Thank you!");
            System.exit(0);
        }
        else if( a1 > 2 || a1 < 0){
            System.out.println("Invalid input. Please try again");
            exit();
        }
        }
        catch(InputMismatchException p){
            System.out.println("Invalid input. Letters and characters are not allowed in this program.");
            exit();
        }
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
        
        }
        else if (c > 2 || c < 0){
            System.out.println("Invalid input. Please try again");
            mains();
        }
        else if (c == 2) {
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
            else if (cho > 2 || cho <=0){
            System.out.println("Invalid input. Please try again");
            mains();
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
     
    static BigInteger factorial(int num,int rum,int min){
        BigInteger f = new BigInteger("1");
        BigInteger mins = new BigInteger("1");
        BigInteger equ;
        for (int i = 2; i <=num; i++) {
            f = f.multiply(BigInteger.valueOf(i));
            
        }
        for (int k = 2; k <=min; k++) {
            mins = mins.multiply(BigInteger.valueOf(k));
            
        }
       
        equ = f.divide(mins);
        
        return equ;
    }
    static BigInteger factorial2(int num,int rum,int min){
        BigInteger f = new BigInteger("1");
        BigInteger r = new BigInteger("1");
        BigInteger mins = new BigInteger("1");
        BigInteger equ;
        for (int i = 2; i <=num; i++) {
            f = f.multiply(BigInteger.valueOf(i));
            
        }
        for (int j = 2; j <=rum; j++) {
            r = r.multiply(BigInteger.valueOf(j));
            
        }
        for (int k = 2; k <=min; k++) {
            mins = mins.multiply(BigInteger.valueOf(k));
            
        }
       
        equ = f.divide((r.multiply(mins)));
        
        return equ;
    }
    
}
