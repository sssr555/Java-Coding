import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        int f=0;
        if(n==2)
        {
            System.out.println("It is prime number");
        }
        else{

            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    f=0;
                    break;
                }
                else{
                    f=1;
                }
        
             }
        if(f==1)
        {
            System.out.println("The given number is Prime number");
        }
        else{
            System.out.println("The given number is not Prime Number");
        }
         System.out.println("Adding message for testing");
         }
    }
    
}

