import java.util.Scanner;

public class prngGuess
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[][] randNums = new int[n][10];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                randNums[i][j] = nextInt();
            }
        }


    }

}

//not sure what i'm doing...
class guessNext
{
    int seed;

    public void guessNextNums(int[] nums)
    {
        int nextNum;

        for(int i = 0; i < 10; i++)
        {
            seed = (seed * 0x5DEECE66D + 0xB) & ((1L << 48) - 1);
            nextNum = (int) ((seed >>> 17) % 1000);
        }
    }
}
