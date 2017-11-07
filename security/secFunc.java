import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int calculate(int x)
    {
        // Complete this function
        return x % 11;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int result = calculate(x);
        System.out.println(result);
        in.close();
    }
}
