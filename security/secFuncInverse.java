import java.util.Scanner;

public class secFuncInverse
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] bjFunc = new int[n];

        for(int i = 0; i < n; i++)
        {
            bjFunc[i] = input.nextInt();
        }

        //bjFunc is bijective X->Y
        //so X = index Y = value at that index

        //write a func that is the inverse of bjFunc

        int[] invFunc = new int[n];

        for(int i = 0; i < n; i++)
        {
            invFunc[bjFunc[i] - 1] = i + 1;
        }

        for(int num: invFunc)
        {
            System.out.println(num);
        }

    }
}
