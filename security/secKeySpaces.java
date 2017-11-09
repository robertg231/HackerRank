import java.util.Scanner;

public class secKeySpaces
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String message = input.nextLine();
        int e = input.nextInt();

        for(int i = 0; i < message.length(); i++)
        {
            int digit = (Integer.parseInt(message.substring(i, i+1)) + e) % 10;
            System.out.print(digit);
        }


    }
}
