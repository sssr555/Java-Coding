import java.util.Scanner;
public class HeightCategory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the height: ");
        int height=sc.nextInt();
        if(height>=175)
        {
            System.out.println("The person is taller");
        }
        else if(height>=155 && height<175)
        {
            System.out.println("The person is average height");
        }
        else
        {
            System.out.println("the person is dwarf ");
        }

    }
    
}
