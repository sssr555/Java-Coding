import java.util.Scanner;
public class IntegerToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        IntegerToBinary obj=new IntegerToBinary();
        String bin=obj.binary(num);
        System.out.println("Integer to Binary: "+num+" = "+bin);
        
    }
    String binary(int x)
    {
        if(x>0)
        {
            int a=x%2;
            x=x/2;
            return a+""+binary(x);
        }
        return "";
        
    }
    
}
