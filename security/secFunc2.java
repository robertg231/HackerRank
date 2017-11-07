import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        int result = calculate(x);
        System.out.println(result);
        input.close();
    }

    public static int calculate(int x)
    {
        return x * x;
    }


}
