package jp2017;

import java.math.BigDecimal;
import java.math.BigInteger;



public class HW41 {
/**
 * 
 * The <em>Rational(有理數)</em> class is used to represent immutable
 * rational numbers, which are numbers that can be represented in the form <em> a/b </em>
 * where <em>a</em> and <em>b</em> are two arbitrary integers.
 * 
 * <br/>
 * Each Rational object contains two private fields :
 * <li>BigInteger <em>numerator</em> for the numerator part(分子),</li>
 * and
 * <li>BigInteger <em>denominator</em> for the denominator part (分母).</li>
 * <br/>
 * Notes:
 * <li>Since we use BigInteger as the type of both parts, Rational can represent any
 * rational number of arbitrary size and precision for BigIntegers are
 * Immutable arbitrary-precision integers.</li>
 * <li>Both fields are declared as final; therefore it is not permitted to
 * change them once they have been set. For easy processing of comparison and
 * printing, you should remember to normalize the representation in all
 * constructions. So, for example, if you call new Rational(15, -30), then the
 * actual values stored would be 1 and -2, respectively.</li>
 * 
 *  
 */

@SuppressWarnings("serial")
public static class Rational extends Number implements Comparable<Rational> {

	private final BigInteger numerator;          // Do not change this field!
	private final BigInteger denominator;        // Do not change this field!

	/**
	 * Constant rational ZERO
	 */

	//////// public static final Rational ZERO = new Rational(1,0);
	public static final Rational ZERO = new Rational(0,1);

	/**
	 * Constant Rational ONE
	 */
	
	////////public static final Rational ONE = new Rational(0, 1);
	public static final Rational ONE = new Rational(1, 1);

	/**
	 * Construct a new Rational number representing <code>n/d</code>, where
	 * <code>n</code> and <code>d</code> are of the type <code>long</code>.
	 * Throws (Unchecked) ArithmeticException if d == 0.
	 */

	public Rational(long n, long d) {

		this(BigInteger.valueOf(n), BigInteger.valueOf(d));

	}

	/**
	 * Construct a new Rational number <code>n/d</code>, where <code>n</code>
	 * is the integer whose decimal string representing is given by the input
	 * String argument <code>nString</code> and <code>d</code> is the
	 * integer whose decimal string representing is given by the 2nd input
	 * String argument <code>dString</code>.<br>* Throws (unchecked)
	 * ArithmeticException if d == 0. Throws NumberFormatException if either
	 * argument is not well-formed integer number representation.
	 */

	public Rational(String nString, String dString) {

		this(new BigInteger(nString), new BigInteger(dString));

	}

	/**
	 * Construct a new Rational Number with numerator <code>n</code> and
	 * denominator <code>d</code> of type <code>BigInteger</code> passed as
	 * arguments.
	 * 
	 * Remember to divide gcd(n,d) from both d and n, and make sure d is
	 * positive, before assigning them to numerator and denominator.
	 * Gcd of n and d need not be implemented yourself as it can be found in the BigInteger class.　
	 *  
	 */

	public Rational(BigInteger n, BigInteger d) {
		
		//TODO replace the dummy assignments blow with you code here !!		
		boolean anegate = false, bnegate = false;
     
    //System.out.println(a);
    //System.out.println(b);
     
    if(n.compareTo(BigInteger.ZERO) < 0) {
      anegate = true;
      n = n.negate();
    }
    if(n.compareTo(BigInteger.ZERO) < 0) {
      bnegate = true;
      n = n.negate();
    }
     
    BigInteger store = BigInteger.valueOf(0);
    for(BigInteger i = new BigInteger("1"); i.compareTo(n) < 0 && i.compareTo(d) < 0; i = i.add(BigInteger.valueOf(1)) ) {
      if(n.remainder(i).compareTo(BigInteger.ZERO) == 0 && d.remainder(i).compareTo(BigInteger.ZERO) == 0) {
        store = i;
      }
		}
		n = n.divide(store);
		d = d.divide(store);
		
		if(anegate) {
			n = n.negate();	
		}
		if(bnegate) {
			d = d.negate();
		}
		numerator = n;
		denominator = d;
	}
	
	public static Rational valueOf(long n){
		return new Rational(n,1) ;
	}
	

	/**
	 * Parameter str is either of the form :<code>" n / d "</code> or of the
	 * form <code>" n "</code>, where <code>n</code> and <code>d</code>
	 * are decimal string representation of integers.
	 * 
	 * Ex:
	 * <li>Rational("-25/-10") return 5/2</li>
	 * <li>Rational("-10") return -10</li>
	 * <li>Rational("-2 -5/2") throws NumberFormatException:" -2 -5/2 is not a
	 * valid format of a rational number."
	 *  
	 */
	public static Rational valueOf(String str) throws java.lang.NumberFormatException {
		//TODO  replace the dummy assignments blow with your code here !!
		String n = null;
		String d = null;
		return new Rational(n, d) ;
	}
	
	/**
	 * Construct a Rational whose value is equal to an input BigDecimal.
	 * This method was implemented by the instructor! 
	 * @param bd a BigDecimal
	 */
	public static Rational valueOf(BigDecimal bd ){
		return new Rational(bd.unscaledValue(), BigInteger.TEN.pow(bd.scale())) ;
	}
	
	
	/**
	 * Construct a Rational whose value is equal to an input double value d.
	 * 
	 * 
	 * @param d a double value
	 */
	public static Rational valueOf(double d ){
		return valueOf(new BigDecimal(d));
	}	


	/**
	 * return the Numerator of this. Note: the returned value must be the one
	 * after normalization. So, for example,
	 * 
	 * (new Rational(4,-6)).getNumerator() should return -2, and (new
	 * Rational(4,-6)).getDenominator() should return 3.
	 *  
	 */

	public BigInteger getNumerator() {
		return numerator;
	}

	/**
	 * return the Denominator of this. Note: the returned value must be the one
	 * after normalization. So, for example,
	 * 
	 * (new Rational(4,-6)).getNumerator() should return -2, and (new
	 * Rational(4,-6)).getNumerator() should return 3.
	 *  
	 */
	public BigInteger getDenominator() {
		return denominator;
	}

	
	/**
	 * Return a normalized string representation of this. So, for example, (new
	 * Rational(100,-6)).toString() should return "-50/3", (new
	 * Rational(-100,-5)).toString() should return "20", and (new
	 * Rational(0,-6)).toString() should return "0".
	 * 
	 * This method was implemented by the instructor for ease of testing!
	 * Do not change its implementation!
	 */
	@Override
	public String toString() {
		if(numerator == null || denominator == null) return "null" ;
		if(numerator .equals(BigInteger.ZERO) ) return "0" ;
		if(denominator.equals(BigInteger.ONE)) return numerator.toString();
		return numerator + "/" + denominator ;
	}

	/**
	 * Return true iff o is a rational number and <code>this</code> is equal to o.
	 * Note: since Rational instances are assumed to be normalized (2/-4 -> -1/2),
	 * we can simply compare their numerators and denominators to determine if they are equal. 
	 */
	public boolean equals(Object o) {
		//TODO replace the dummy return by your code here!!
		return false;
	}

	/**
	 * return -1, 0, 1, respectively, if this is less than, equal to, or
	 * greater than o, which must be a Rational.
	 */
	@Override
	public int compareTo(Rational o) {
		//TODO　replace the dummy return by your code here!!
		return 0;
	}
	
	/**
	 * Check if this rational is less than the input rational r.
	 * @param r input rational to be compared with
	 * @return true if this < r.
	 */
	public boolean lt(Rational r) {
		//TODO replace the dummy return by your code here!!
		return false;
	}

	////////////////////////////////////////////////////////////////
	//
	// The followings are basic rational arithmetic
	// operations
	//  
	///////////////////////////////////////////////////////////////

	/**
	 * @return this + r2;
	 */
	public Rational add(Rational r2) {
		//TODO add your code here!
		return null;
	}

	/**
	 * Return a Rational whose value is equal to this - r2.
	 * @return this - r2;
	 */
	public Rational subtract(Rational r2) {
		//TODO add your code here!
		return ZERO;
	}

	/**
	 * Return a Rational whose value is equal to this * r2.
	 * @return this * r2
	 */
	public Rational times(Rational r2) {
		//TODO add your code here!
		return ZERO;
	}

	/**
	 * Return a Rational whose value is equal to this / r2. 
	 * @return this / r2;
	 * @throws ArithmeticException  if r2 = 0 ;
	 */
	public Rational div(Rational r2)
		throws java.lang.ArithmeticException {
		//TODO add your code here!
		return ZERO;
	}
	
	/** 
	 * Return a Rational whose value is <code>this^exponent</code>. 
	 * Note that exponent is of the primitive type 'int' and it may be negative.
	 * Note also that r^0 == ((r== 0)? 1 : r ).
	 * 
	 * @return this^exponent
	 * 
	 */
	public Rational pow(int exponent ) {
		//TODO add your code here!
		return ZERO;
	}	
	
	

	/**
	 * @return 1 / this
	 * @throws ArithmeticException
	 *             if r = 0 ;
	 */
	public Rational inverse() throws ArithmeticException {
		//TODO add your code here!
		return ZERO;
	}

	/**
	 * Return a Rational whose value is equal to the negative of this. 
	 * 
	 * @return - this
	 */
	public Rational negate() {
		
		//TODO add your code here!
		return ZERO;
	}
	
	/**
	 * Return the absolute value of this rational. 
	 * 
	 * @return | this |
	 */
	public Rational abs() {
		
		//TODO add your code here!
		return null;
	}

	/**
	 * Return the largest integer less than or equal to <code> r</code>
	 *  
	 */

	public BigInteger floor() {
		//TODO add your code here!
		return BigInteger.ZERO;
	}

	/**
	 * Return the smallest integer greater than or equal to <code> r</code>
	 *  
	 */

	public BigInteger ceiling() {
		//TODO add your code here!
		return BigInteger.ZERO;
	}
	
	@Override 
	public int hashCode() {
		return numerator.hashCode() ^ denominator.hashCode();
	}
	
	

	////////////////////////////////////////////////////////////
	//
	// Implementation of all methods required from the Number super class 
	//
	///////////////////////////////////////////////////////////

	/**
	 * Return a double value approximation for this.<br> 
	 * Hint: Translate numerator and denominator to BigDecimal, 
	 * and then divide numerator by denominator
	 * using BigDecimal.divide to obtain a BigDecimal and finally convert the
	 * resulting BigDecimal to double using BigDecimal.doubleValue().
	 * 
	 * @see java.lang.Number#doubleValue()
	 * @see java.math.BigDecimal.
	 */
	public double doubleValue() {
		// TODO add your code here!
		return 0;
	}

	/**
	 * Similar to doubleValue();
	 * 
	 * @see java.lang.Number#floatValue()
	 * @see java.math.BigDecimal.
	 */
	public float floatValue() {
		// TODO add your code here!
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Number#intValue()
	 */
	public int intValue() {
		// Auto-generated method stub
		return floor().intValue();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Number#longValue()
	 */
	public long longValue() {
		// Auto-generated method stub
		return floor().longValue();
	}
	

	


	
}



//////////////////////////////////////////
// The following are test program
//////////////////////////////////////////


/**
* IMPORTANT: DO NOT MAKE CHANGES TO THIS CLASS.
* If there are compilation errors in this class, It is most likely due to your implementation of the above 5 classes.
* In such case, you should change your implementation, instead of change the test code!
*     
* @author chencc
*
*/

	public static class Test {

		static final double SCORE_PER_PROBLEM = 1;

		int nTests = 0; // each test may produce multiple errors!
		int nErrors = 0;
		int nTestErrors = 0;
		boolean newTest = true;

		void error() {
			error("");
		}

		void error(String s) {
			nErrors++;
			if (newTest) {
				nTestErrors++;
				newTest = false;
				System.out.println(">>> new TestError! <<< ");
			}
			System.out.println("*** error " + nErrors + "*** :" + s);
		}

		void error(String s, Object... args) {
			error(String.format(s, args));
		}

		void test() {
			nTests++;
			newTest = true;
		}

		String summary() {

			StringBuilder sb = new StringBuilder();
			sb.append("\n************************\nThere are totally " + nTests + " full tests! \n");
			sb.append("There are " + nTestErrors + " test errors! \n");
			sb.append("There are " + nErrors + " detailed errors! \n");
			sb.append(" The passing rate is " + (nTests - nTestErrors) + "/" + nTests + "="
					+ ((nTests - nTestErrors) * 100 / nTests) + "!\n");

			double score = (nTests - nTestErrors) * (SCORE_PER_PROBLEM) + (100 - SCORE_PER_PROBLEM * nTests);

			sb.append("The score is " + Math.round(score) + " provided your source passes compilation!");

			return sb.toString();

		}

		
		public void testRationalBB() {

			BigInteger[] ns = { BigInteger.ZERO, BigInteger.valueOf(50), BigInteger.valueOf(-999),
					BigInteger.valueOf(2379 * 37) };
			BigInteger[] ds = { BigInteger.TEN, BigInteger.valueOf(20), BigInteger.valueOf(-33),
					BigInteger.valueOf(-2379 * 37 * 5) };
			String[] sols = { "0", "5/2", "333/11", "-1/5" };

			for (int k = 0; k < ns.length; k++) {
				test();
				try {
					Rational ansK = new Rational(ns[k], ds[k]);
					if (!sols[k].equals(ansK.toString())) {
						error("testRationalBB() for(%s,%s) return %s, while %s is expected", ns[k], ds[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testRationalBB() for (%s, %s) throws unexpected Exception!", ns[k], ds[k]);
				}

			}

		}
		
		public void testValueOfString() {

			String[] ss = { "0/1", "60/30","-774/-30", (2379 * 37) +"/" + (-2379 * 37 ) };
			String[] sols = { "0", "2", "129/5", "-1/5" };

			for (int k = 0; k < ss.length; k++) {
				test();
				try {
					Rational ansK = Rational.valueOf(ss[k]);
					if (!sols[k].equals(ansK.toString())) {
						error("testValueOfString() for %s return %s, while %s is expected", ss[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testValueOfString() for (%s) throws unexpected Exception!", ss[k]);
				}

			}

		}
		
		public void testEquals() {

			Rational[] r1s = { Rational.ZERO, Rational.ONE, new Rational(-3, -30), new Rational(2379 * 37 * 7, 2379 * 37 ) };
			Rational[] r2s = { Rational.ZERO, Rational.ZERO, new Rational(1, 10), new Rational( 7, -1) };
			Boolean[] sols = { true, false, true, false };

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					Boolean ansK = r1s[k].equals(r2s[k]);
					if (!sols[k] == ansK) {
						error("testEquals() for (%s,%s) return %s, while %s is expected", r1s[k], r2s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testEquals() for (%s,%s) throws unexpected Exception!", r1s[k], r2s[k]);
				}

			}

		}
		
		
		public void testComparedTo() {

			Rational[] r1s = { Rational.ZERO, Rational.ONE, new Rational(-3, -30), new Rational(5, - 2 ) };
			Rational[] r2s = { Rational.ZERO, Rational.ZERO, new Rational(1, 11), new Rational( 7, -3) };
			//////// int[] sols = { 0, -1, 1, -1 };
	        int[] sols = { 0, 1, 1, -1 };

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					int ansK = r1s[k].compareTo(r2s[k]);
					if (sols[k] != ansK) {
						error("testCompareTo() for (%s,%s) return %s, while %s is expected", r1s[k], r2s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testCompareTo() for (%s,%s) throws unexpected Exception!", r1s[k], r2s[k]);
				}

			}

		}
		
		public void testLt() {

			Rational[] r1s = { Rational.ZERO, Rational.ONE, new Rational(-3, -30), new Rational(5, - 2 ) };
			Rational[] r2s = { Rational.ZERO, Rational.ZERO, new Rational(1, 11), new Rational( 7, -3) };
			//////// boolean[] sols = { false, true, false, true };
			boolean[] sols = { false, false, false, true };
			
			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					boolean ansK = r1s[k].lt(r2s[k]);
					if (sols[k] != ansK) {
						error("testLt() for (%s,%s) return %s, while %s is expected", r1s[k], r2s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testLt() for (%s,%s) throws unexpected Exception!", r1s[k], r2s[k]);
				}

			}

		}
		
		
		
		
		
		public void testAdd() {

			Rational[] r1s = { Rational.ZERO,  new Rational(-3, -30), new Rational(5, - 2 ), new Rational(-3,4) };
			Rational[] r2s = { Rational.ONE,    new Rational(1, 11), new Rational( 7, -3), new Rational(4,5) };
			String[] sols = { "1", "21/110", "-29/6", "1/20" };

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					Rational ansK = r1s[k].add(r2s[k]);
					if (!sols[k].equals(ansK.toString())) {
						error("testAdd() for (%s,%s) return %s, while %s is expected", r1s[k], r2s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testAdd() for (%s,%s) throws unexpected Exception!", r1s[k], r2s[k]);
				}

			}

		}
		
		public void testSubtract() {

			Rational[] r1s = { Rational.ZERO,  new Rational(-3, -30), new Rational(5, - 2 ), new Rational(-3,4) };
			Rational[] r2s = { Rational.ONE,    new Rational(1, 11), new Rational( 7, -3), new Rational(4,5) };
			String[] sols = { "-1", "1/110", "-1/6", "-31/20" };

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					Rational ansK = r1s[k].subtract(r2s[k]);
					if (!sols[k].equals(ansK.toString())) {
						error("testSubtract() for (%s,%s) return %s, while %s is expected", r1s[k], r2s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testSubtract() for (%s,%s) throws unexpected Exception!", r1s[k], r2s[k]);
				}

			}

		}
		
		public void testTimes() {

			Rational[] r1s = { Rational.ZERO,  new Rational(-3, -30), new Rational(5, - 2 ), new Rational(-3,4) };
			Rational[] r2s = { Rational.ONE,    new Rational(1, 11), new Rational( 7, -3), new Rational(4,5) };
			String[] sols = { "0", "1/110", "35/6", "-3/5" };

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					Rational ansK = r1s[k].times(r2s[k]);
					if (!sols[k].equals(ansK.toString())) {
						error("testTimes() for (%s,%s) return %s, while %s is expected", r1s[k], r2s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testTimes() for (%s,%s) throws unexpected Exception!", r1s[k], r2s[k]);
				}

			}

		}
		
		public void testDiv() {

			Rational[] r1s = { Rational.ZERO,  new Rational(-3, -30), new Rational(5, - 2 ), new Rational(-3,4) };
			Rational[] r2s = { Rational.ONE,    new Rational(1, 11), new Rational( 7, -3), new Rational(4,5) };
			String[] sols = { "0", "11/10", "15/14", "-15/16" };

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					Rational ansK = r1s[k].div(r2s[k]);
					if (!sols[k].equals(ansK.toString())) {
						error("testTimes() for (%s,%s) return %s, while %s is expected", r1s[k], r2s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testTimes() for (%s,%s) throws unexpected Exception!", r1s[k], r2s[k]);
				}

			}

		}
		
		public void testPow() {

			Rational[] r1s = { Rational.ZERO, Rational.ZERO,new Rational(-3, -30),  new Rational(-3, -30), new Rational(5, - 2 ), new Rational(-3,4) };
			int[] r2s = { 0,1, 0, 3, -2, -1 };
			String[] sols = { "1", "0", "1", "1/1000", "4/25", "-4/3" };

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					Rational ansK = r1s[k].pow(r2s[k]);
					if (!sols[k].equals(ansK.toString())) {
						error("testPow() for (%s,%s) return %s, while %s is expected", r1s[k], r2s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testPow() for (%s,%s) throws unexpected Exception!", r1s[k], r2s[k]);
				}

			}

		}
		
		public void testInverse() {

			Rational[] r1s = { Rational.ONE,  new Rational(-3, -30), new Rational(5, - 2 ), new Rational(-3,4) };			
			String[] sols = { "1", "10", "-2/5", "-4/3" };

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					Rational ansK = r1s[k].inverse();
					if (!sols[k].equals(ansK.toString())) {
						error("testInverse() for %s return %s, while %s is expected", r1s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testInverse() for %s throws unexpected Exception!", r1s[k]);
				}

			}

		}
		
		public void testAbs() {

			Rational[] r1s = { Rational.ZERO,  new Rational(-3, -30), new Rational(5, - 2 ), new Rational(-3,4) };			
			String[] sols = { "0", "1/10", "5/2", "3/4" };

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					Rational ansK = r1s[k].abs();
					if (!sols[k].equals(ansK.toString())) {
						error("testAbs() for %s return %s, while %s is expected", r1s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testAbs() for %s throws unexpected Exception!", r1s[k]);
				}

			}

		}
		
		public void testNegate() {

			Rational[] r1s = { Rational.ZERO,  new Rational(-3, -30), new Rational(5, - 2 ), new Rational(-3,4) };			
			String[] sols = { "0", "-1/10", "5/2", "3/4" };

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					Rational ansK = r1s[k].negate();
					if (!sols[k].equals(ansK.toString())) {
						error("testNegate() for %s return %s, while %s is expected", r1s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testNegate() for %s throws unexpected Exception!", r1s[k]);
				}

			}

		}
		
		
		
		public void testCeiling() {

			Rational[] r1s = { Rational.ZERO, Rational.ONE,  new Rational(-3, -30), new Rational(5, - 2 ), new Rational(-3,4) };			
			String[] sols = { "0", "1", "1", "-2", "0" };

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					BigInteger ansK = r1s[k].ceiling();
					if (!sols[k].equals(ansK.toString())) {
						error("testCeiling() for %s return %s, while %s is expected", r1s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testCeiling() for %s throws unexpected Exception!", r1s[k]);
				}

			}
		}
		
		
		public void testFloor() {

			Rational[] r1s = { Rational.ZERO, Rational.ONE,  new Rational(-3, -30), new Rational(5, - 2 ), new Rational(-3,4) };			
			String[] sols = { "0", "1", "0", "-3", "-1" };

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					BigInteger ansK = r1s[k].floor();
					if (!sols[k].equals(ansK.toString())) {
						error("testFloor() for %s return %s, while %s is expected", r1s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testFloor() for %s throws unexpected Exception!", r1s[k]);
				}

			}
		}
		
		
		public void testDoubleValue() {

			Rational[] r1s = { Rational.ZERO, Rational.ONE,  new Rational(-3, -30), new Rational(5, - 2 ), new Rational(-3,4) };			
			double[] sols = { 0, 1, 0.1, -2.5, -0.75 };

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					double ansK = r1s[k].doubleValue();
					if (sols[k] != ansK) {
						error("testFloatValue() for %s return %s, while %s is expected", r1s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testFloatValue() for %s throws unexpected Exception!", r1s[k]);
				}

			}

		}
		
		public void testFloatValue() {

			Rational[] r1s = { Rational.ZERO, Rational.ONE,  new Rational(-3, -30), new Rational(5, - 2 ), new Rational(-3,4) };			
			float[] sols = { 0, 1, 0.1f, -2.5f, -0.75f };

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					float ansK = r1s[k].floatValue();
					if (sols[k] != ansK) {
						error("testFloatValue() for %s return %s, while %s is expected", r1s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testFloatValue() for %s throws unexpected Exception!", r1s[k]);
				}

			}

		}
		
		
		
		
		
		
		
		
	}



/**
 * Run this method after completing HW41 to test your implementation.
 * 
 */
public static void main(String[] args) {

	Test t = new Test();
	
	t.testRationalBB();
	t.testValueOfString();
	
	t.testAdd();	
	t.testSubtract();
	t.testTimes();
	t.testDiv();
		
	
	t.testEquals();	
	t.testComparedTo();
	t.testLt();
	
	t.testNegate();
	t.testInverse();
	t.testPow();
	t.testAbs();	
	
	
	
	t.testCeiling();
	t.testFloor();
	t.testDoubleValue();
	t.testFloatValue();
	
	System.out.println(t.summary()) ;
	
	

}

}