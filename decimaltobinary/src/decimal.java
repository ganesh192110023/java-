import java.util.*;

public class decimal {
public static void main(String [] args)
{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();

    //converting integer to binary
    String binary = Integer.toBinaryString(n);
    System.out.println(binary);

}
}
