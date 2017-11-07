import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] nums = new int[20];

        for(int i = 0; i < n; i++)
        {
            nums[i] = input.nextInt();
        }

        if(isOneToOne(n, nums))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }


        input.close();
    }

    public static boolean isOneToOne(int size, int[] vals)
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = i + 1; j < size; j++)
            {
                if(vals[i] == vals[j])
                {
                    return false;
                }
            }
        }

        return true;
    }

    // public static boolean isOnto(int size, int[] vals)
    // {
    //     for(int i = 0; i < size; i++)
    //     {
    //         for(int j = 1; j <= 20; j++)
    //         {
    //
    //         }
    //     }
    // }

}
