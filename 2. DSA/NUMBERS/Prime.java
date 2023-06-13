import java.util.Scanner;

public class Prime {

    static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
               return false; 
            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n:");
        int s= sc.nextInt();
        System.out.println("Prime or not..return in true or false: "+isPrime(s));
        }
}
