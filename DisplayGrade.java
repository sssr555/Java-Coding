import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DisplayGrade {
    public static void main(String[] args) {
        char a;
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        a=(char)bf.read();
        if(a=='A'|| a=='a')
        {
            System.out.println("Student has got more than 80 marks out of 100");
        }
        else if(a=='B'||a=='b')
        {
            System.out.println("Student has got more than 60 marks but below 80 marks out of 100");
        }
        else if(a=='C'||a=='c')
        {
            System.out.println("Student has got more than 40 marks but below 60 out of 100");
        }
        else
        {
            System.out.println("Student has got failed!!!");
        }
    }
    
}
