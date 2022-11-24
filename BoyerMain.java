import java.util.*;
public class BoyerMain {
    public static void main(String []args) {

        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the Text String");
        String text=sc.nextLine();
        char txtChar[] = text.toCharArray();
        System.out.println("Enter the Pattern String");
        String pattern=sc.nextLine();
        char patChar[] = pattern.toCharArray();
        boolean ans=BoyerMoore.search(txtChar, patChar);
        if(!ans)
            System.out.println("Pattern Not Found");
    }
}
