
import java.util.*;
import java.lang.*;
public class FlipCoin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double rand;
        System.out.print("enter number of flips " );
        int numflips = sc.nextInt();
        int tails = 0;
        int heads = 0;

        for (int i = 0;i<numflips;i++){
            rand = Math.random();
            if(rand<0.5){
                tails = tails +1;
            }
            else {
                heads = heads + 1;
            }
        }

        float a = (((float)tails / numflips)* 100);
        float b = (((float)heads / numflips)* 100);
        System.out.println("heads" + b);
        System.out.println("tails" + a);

    }
}
