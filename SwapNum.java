import java.util.Scanner;
public class SwapNum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers: ");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        System.out.println("the numbers before swapping: numbe1="+number1+"  number2: "+number2);
        number1=number1+number2;
        number2=number1-number2;
        number1=number1-number2;
        System.out.println("the numbers after swapping: number1= "+number1+" number2: "+number2);

    }
}
