import java.math.BigInteger;

/**
 * File: Problem091.java
 * Date created: Apr 6, 2012
 * 
 * @author Anthony Gargiulo
 */

/**
 * @author Anthony Gargiulo
 * @version 0.1
 * 
 *          The first known prime found to exceed one million digits was
 *          discovered in 1999, and is a Mersenne prime of the form
 *          (2^6972593)-1; it contains exactly 2,098,960 digits. Subsequently
 *          other Mersenne primes, of the form (2^p)-1, have been found which
 *          contain more digits.
 * 
 *          However, in 2004 there was found a massive non-Mersenne prime which
 *          contains 2,357,207 digits: 28433�(2^7830457)+1.
 * 
 *          Find the last ten digits of this prime number.
 * 
 */
public class Problem091
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		BigInteger number = BigInteger.valueOf(2L);
		number.pow(7830457);
		number.multiply(BigInteger.valueOf(28433L));
		number.add(BigInteger.valueOf(1L));
		String result = number.toString();
		System.out.println(result.substring(result.length() - 11));
	}

}
