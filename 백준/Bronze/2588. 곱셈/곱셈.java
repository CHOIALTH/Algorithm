import java.util.*;

public class Main{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        
        System.out.println(x * (y % 10));
        System.out.println(x * (y % 100 / 10));
        System.out.println(x * (y / 100));
        System.out.println(x * y);

    }
}