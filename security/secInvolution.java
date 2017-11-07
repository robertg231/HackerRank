import java.util.Scanner;

public class secInvolution
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] someFunc = new int[n];

        for(int i = 0; i < n; i++)
        {
            someFunc[i] = input.nextInt();
        }

        boolean isInvolution = true;

        for(int i = 0; i < n; i++)
        {
            if(someFunc[someFunc[i] - 1] == i - 1)
            {
                isInvolution = false;
                break;
            }
        }

        System.out.print(isInvolution ? "YES" : "NO");
    }
}
