import java.util.*;
public class LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a 4 digit number ");
        int n = sc.nextInt();
        if (n % 100 !=0 && n % 4 == 0||n % 100 == 0 && n % 400 == 0){
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }
    }
}
