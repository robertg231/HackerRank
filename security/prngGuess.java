import java.util.Scanner;
import java.util.Arrays;

public class prngGuess
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        prngCase[] randomCases = new prngCase[n];
        int[] caseNums = new int[10];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                caseNums[i] = input.nextInt();
            }

            randomCases[i] = new prngCase(caseNums);
        }


        for(int i = 0; i < n; i++)
        {
            System.out.println("FINDING STATE");
            System.out.println("FOUND STATE: " + randomCases[i].findState());


            System.out.println("PRINTING NEXT 20");
            for(int j = 0; j < 20; j++)
            {
                System.out.print(randomCases[i].nextInt(1000) + " ");
            }

            System.out.println();
        }

    }

}

class prngCase
{
    int[] randNums;
    long origState;
    long currSeed;

    prngCase(int[] newNums)
    {
        randNums = Arrays.copyOf(newNums, newNums.length);
    }


    //so the linear congruential generator is used in javas rand implementation
    //Xn1 = (aXn + c) mod m
    //Xn1 is new seed. java generates it and returns bits 47-16 which are a "random" 32 bit int
    //Xn is original seed. java doesn't tell us this. it uses the time to generate a seed but we don't know how
    //a  is multiplier. java uses a = 5DEECE66D in hex
    //c is increment. java uses c = 11
    //m is modulus. java uses m = 2^48

    //we know all the parts except the original seed.
    //hackerRank will give us 10 sequentially generated #s from calling nextInt(1000)
    //we will brute force the original seed and test it with the 10 given #s
    //if we find a match then we can "guess" the next 10 numbers
    //Who knows if this will work. it will take a long time though. we have 64 bits to crack, but we only know 32 of them....

    public long findState()
    {
        boolean works = false;

        final double sixteenBits = Math.pow(2,16);
        final long y = 0x5DEECE66DL;
        long stateGuess;
        for(long x = 0; x < sixteenBits; x++)
        {
            for(long z = 0; z < sixteenBits; z++)
            {
                stateGuess = (x << 47) + (y << 15) + z; //this is probably wrong
                works = testGuessState(stateGuess);

                if(works)
                {
                    origState = currSeed = stateGuess;
                    return stateGuess;
                }
            }
        }
        System.out.println("Nothing worked :(");
        return -1;
    }

    public boolean testGuessState(long guess)
    {
        //first iteration is guess which is a "guess" of the prng's first seed(which we don't know)
        for(int i = 0; i < 10; i++)
        {
            guess = (guess * 0x5DEECE66DL + 0xB) & ((1L << 48) - 1); //this is javas implementation of nextInt()
            int nextInt = (int) ((guess >>> 17) % 1000);

            if(nextInt != randNums[i])
            {
                return false;
            }
        }
        //if our guess seed matches/generates the 10 calls to nextInt then we have found the original seed that java used. now we can generate the rest of the nums
        return true;
    }

    public int nextInt(int n)
    {
        currSeed = (currSeed * 0x5DEECE66DL + 0xB) & ((1L << 48) - 1);
	    return (int) ((currSeed >>> 17) % n);
    }
}
