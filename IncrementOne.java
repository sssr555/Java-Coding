import java.util.Scanner;
public class IncrementOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=sc.nextInt();
        int r=0;
        int number=0;
        while(num>0)
        {
            r=num%10;
            r++;
            number=number*10+r;
            num/=10;
        }
        System.out.println(num);
        //System.out.println(number);
        num=number;
        number=0;
        while(num>0)
        {
            r=num%10;
            number=number*10+r;
            num/=10;
        }
        System.out.println("One Increment Digits : "+number);


    }
    
}
