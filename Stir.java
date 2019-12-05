package javaapplication23;

import java.util.Scanner;
import java.math.BigInteger;
import java.util.InputMismatchException;

public class Stir extends SuperC {
	
	public void stirling() {
		Scanner sc = new Scanner(System.in);
                try{
		System.out.print("Enter value of n: ");
		int n = sc.nextInt();
		System.out.print("Enter value of k: ");
		int k = sc.nextInt();
		
               
		BigInteger q = BigInteger.valueOf(-1); // value of (-1)^j
		BigInteger q2 = BigInteger.valueOf(-1); // value of (-1)^j
		
		BigInteger jn = BigInteger.ZERO; // use for value of (j-i)^n
		BigInteger jn1 = BigInteger.ZERO; // use for value of (j-i)^n
		BigInteger fna = BigInteger.ZERO; // for final answer
			for (int x = 0;x < k;x++) {
				q = (q).multiply(q2);
				BigInteger comb1 = factorial(k).divide(factorial(x).multiply(factorial(k-x)));
				jn = BigInteger.valueOf(k).subtract(BigInteger.valueOf(x));
				jn1 = BigInteger.valueOf(k).subtract(BigInteger.valueOf(x));
				for(int z = 1;z < n;z++) {
					jn = jn.multiply(jn1);
				}
				fna = fna.add((q).multiply(comb1).multiply(jn));
			}
                if (k > 500 || n > 500 ){
                    System.out.println("Input shouldn't exceed to 500.");
                    stirling();
                }
                else if (n < k ){
                    System.out.println("Your 'n' must be greater that your 'k'");
                    stirling();
                }
                else if ( k <= 0){
                    System.out.println("Your 'k' should be greater than 0.");
                    stirling();
                }
                else if ( k<= n){
                    System.out.println("Stirling: "+ fna.divide(factorial(k)));
                    exit();
                }
                
			
                        
	}
                
        
        catch(InputMismatchException ex){
         
         System.out.println("Invalid input. Letters and characters are not allowed in this program.");
         stirling();
         }
    }

        public void exit() {
        Scanner a= new Scanner(System.in);
        try{
        System.out.println("Do you want to try again? [0-No, 1-Yes, 2-Main Menu]");
        int a1= a.nextInt();
        
        if( a1 == 1){
        stirling();    
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
        else if ( c > 5 || c < 0){
            System.out.println("Invalid input. Please try again");
            mains();
        }
        
        
       
        }
        catch(InputMismatchException p){
                System.out.println("Invalid input");
                mains();

        }
     }
        
       
        static BigInteger factorial(int n) {
            
		BigInteger fact = new BigInteger("1"); //initialize result
			for (int i = 2;i <= n;i++) {
				fact = fact.multiply(BigInteger.valueOf(i)); // this will initiate the use of factorial
			}
			return fact;
		}
        
}
