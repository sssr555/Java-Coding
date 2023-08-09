import java.util.Scanner;
public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number: ");
        int sum=0,n,s,num,count=0,r;
        num=sc.nextInt();
        n=num;
        s=num;
        while(n>0)
        {
            n/=10;
            count++;
        }
        while(s>0)
        {
            r=s%10;
            sum=(int)(sum+Math.pow(r, count));
            n/=10;

        }
        if(num==sum)
        {
            System.out.println("The give number is Armstrong Number");
        }
        else{
            System.out.println("the Number is not Armstrong Number");
        }
    }
}
