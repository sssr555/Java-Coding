import java.util.Scanner;
public class CheckPalindromeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int x=num;
        int rev=0,r;
        while(num>0)
        {
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        if(x==rev)
        {
            System.out.println("The given number is Palindrome");
        }
        else{
            System.out.println("The given number is not palindrome");
        }


    }
    
}
