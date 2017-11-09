import java.util.Scanner;

public class secMessage
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String message = input.nextLine();

        //int num = Integer.parseInt(message);

        for(int i = 0; i < message.length(); i++)
        {
            int digit = (Integer.parseInt(message.substring(i, i+1)) + 1) % 10;
            System.out.print(digit);
        }


    }
}
