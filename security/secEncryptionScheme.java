import java.io.*;
import java.util.*;

public class secEncryptionScheme {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int fact = 1;

        for(; n > 0; n--)
        {
            fact *= n;
        }

        System.out.println(fact);
    }
}
