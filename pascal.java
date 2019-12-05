
package javaapplication23;
import java.util.*;
import java.math.BigInteger;
public class pascal extends SuperC {

    public void Triangle(){
        Scanner a1= new Scanner(System.in);
        try{         
        System.out.print("Enter row value: ");
        int a2= a1.nextInt();
        BigInteger[] result = nthPascalRow(a2);
        for(BigInteger r: result){
            System.out.print(r + " ");
            
        
        if(a2 > 500){
        System.out.println("Your input should not exceed to 500.");
        Triangle();
        
        
        
        }
        
        }
           System.out.print("\n");
           exit();
        }
         catch(InputMismatchException ex){
         
         System.out.println("Invalid input. Letters and characters are not allowed in this program.");
         Triangle();
         }
         
    } 
        

    public void exit() {
        Scanner a= new Scanner(System.in);
        try{
        System.out.println("Do you want to try again? [0-No, 1-Yes, 2-Main Menu]");
        int a1= a.nextInt();
        
        if( a1 == 1){
        Triangle();    
        }
        else if (a1 ==2){
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

   
    private static BigInteger[] nthPascalRow(int a2) {
       BigInteger a = new BigInteger("1");
       BigInteger b = new BigInteger("1");
       
        BigInteger[] previous = {a,b};
        for (int r= 0; r <= a2; r++){
            BigInteger[] next = new BigInteger[r+1];
            next[0] = a;
            for (int i = 1; i < r; i++){
                next [i] = previous [ i -1 ].add(previous[i]);
      
            }
            next[r] = a;
            previous = next;
            
        }
        return previous;
    }
 }

