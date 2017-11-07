import java.util.Scanner;

public class secPermutations
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] perm = new int[n];

        for(int i = 0; i < n; i++)
        {
            perm[i] = input.nextInt();
        }

        for(int i = 0; i < n; i++)
        {
            System.out.println(perm[perm[i] - 1]);
        }
    }
}
