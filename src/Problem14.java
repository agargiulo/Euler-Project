import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 * @author Anthony Gargiulo
 * @version 0.5
 *          Euler Project
 *          Problem 14
 *          ---------
 *          The following iterative sequence is defined for the set of positive
 *          integers:
 *          n → n/2 (n is even)
 *          n → 3n + 1 (n is odd)
 *          Using the rule above and starting with 13, we generate the following
 *          sequence:
 *          13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 *          It can be seen that this sequence (starting at 13 and finishing at
 *          1) contains 10 terms. Although it has not been proved yet (Collatz
 *          Problem), it is thought that all starting numbers finish at 1.
 *          Which starting number, under one million, produces the longest
 *          chain?
 *          NOTE: Once the chain starts the terms are allowed to go above one
 *          million.
 */

public class Problem14
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        try
        {
            System.setOut(new PrintStream(new File("log.log")));
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        int maxChainLength = 0;
        int maxChainStart = 0;
        int chainLength = 0;
        ArrayList<Integer> chain;

        for (int i = 999999; i > 0; i--)
        {
            chain = getChain(i);
            System.out.println(chain);
            chainLength = chain.size();
            if (chainLength >= maxChainLength)
            {
                maxChainStart = i;
                maxChainLength = chainLength;
            }
        }
        System.err.println(maxChainStart + ", " + maxChainLength);
    }

    /**
     * @param start
     * @return the length of the chain starting from <code>start</code>
     */
    private static ArrayList<Integer> getChain(int start)
    {
        ArrayList<Integer> chain = new ArrayList<Integer>();
        chain.add(start);
        int curNum = start;
        while (curNum > 1)
        {
            curNum = getNext(curNum);
            chain.add(curNum);
        }
        return chain;
    }

    /**
     * n → n/2 (n is even)
     * n → 3n + 1 (n is odd)
     * 
     * @param curNum
     * @return the next number in the chain
     */
    private static int getNext(int curNum)
    {
        if (curNum % 2 == 0)
        {
            return curNum / 2;
        } else
        {
            return 3 * curNum + 1;
        }
    }
}