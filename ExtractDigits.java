import java.util.Scanner;
public class ExtractDigits {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=sc.nextInt();
        while(num>0)
        {
            int r=num%10;
            System.out.print(r+", ");
            num/=10;
        }
    }
}
