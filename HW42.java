package jp2017;

import java.util.Arrays;

////////////////////////////////////////////////////////////////////////////////
// NOTES: 1. Import the instructor's implementation of Rational. The jar file 
//           HW41Solution.jar should be included in the classpath to compile/test
//           HW42.java.
//        2. DO NOT USE YOUR OWN HW41.Rational!
////////////////////////////////////////////////////////////////////////////////
import jp2017.HW41Solution.Rational;

public class HW42 {

	/**
	 * 
	 * This class is used to represent complex numbers with rational
	 * coefficients.
	 * 
	 * 
	 */
	public static class Complex {

		/** The square root of -1. */
		public static final Complex I = new Complex(Rational.ZERO, Rational.ONE);

		/** 1. */
		public static final Complex ONE = new Complex(Rational.ONE, Rational.ZERO);

		/** 0 */
		public static final Complex ZERO = new Complex(Rational.ZERO, Rational.ZERO);

		/** The imaginary part. */

		protected final Rational imaginary; // DO NOT REMOVE 'final' !!

		/** The real part. */
		protected final Rational real; // DO NOT REMOVE 'final'!!

		/**
		 * Create a complex number given the real and imaginary parts.
		 * 
		 * @param real
		 *            the real part.
		 * @param imaginary
		 *            the imaginary part.
		 */
		public Complex(Rational real, Rational imaginary) {
			this.real = real;
			this.imaginary = imaginary;
		}

		/**
		 * Create a complex number given the real and imaginary parts.
		 * 
		 * @param real
		 *            the real part represented as a string.
		 * @param imaginary
		 *            the imaginary part represented as a string.
		 */
		public Complex(String real, String imaginary) {
			this(Rational.valueOf(real), Rational.valueOf(imaginary));
		}

		/**
		 * parse a string representation c of a complex number and return the
		 * parsed result. The input argument c can have any of the following
		 * forms (Note that we use j (instead of i) to represent the imaginary
		 * unit (j^2 == -1) :
		 * <ul>
		 * <li>r1+j|r2| : if r1!=0, r2 > 0</li>
		 * <li>r1-j|r2| : if r1!=0, r2 < 0</li>
		 * <li>r1+j : if |r2| == 1</li>
		 * <li>r1-j : if r2 = -1</li>
		 * <li>r1 : if r1 >=0, r2 == 0</li>
		 * <li>-r1 : if r1 < 0 and r2 == 0</li>
		 * <li>j|r2| : if r1 == 0, r2 > 0</li>
		 * <li>-j|r2| : if r1 == 0, r2 < 0,</li>
		 * </ul>
		 * Your program should be able to handle the following inputs:
		 * <code>1/2+j5/3, 1/2-j4/3, 1/2+j, 1/2-j, 2/3,-2/3, j3/4, -j3/4. </code>
		 * 
		 * Your should throw an IllegalArgumentException in case c is not
		 * well-formed.
		 * 
		 * @param c
		 *            a string representation of a complex number.
		 */
		public static Complex valueOf(String c) {
			// TODO Place your code here!
			return null;
			

		}

		/**
		 * return this + c2.
		 * 
		 * @return the complex number this + c2.
		 */
		public Complex add(Complex c2) {
			// TODO add your code here!
			return null;

			

		}

		/**
		 * Return a new Complex whose value is the conjugate of this complex
		 * number.
		 * 
		 * @return the conjugate = real - j imaginary.
		 */
		public Complex conjugate() {
			// TODO add your code here!
			return null;			

		}

		/**
		 * Return the inverse ( 1 / this) of this complex.
		 * 
		 * 
		 * @return the reverse of this complex number.
		 * @throws ArithmeticException
		 *             if this is ZERO
		 */
		public Complex inverse() throws ArithmeticException {
			// TODO add you code here!
			return null ;		

		}

		/**
		 * Return the quotient of this divided by c2.
		 * 
		 * @param c2
		 *            the divider
		 * @return the complex number quotient c1/c2.
		 * @throws ArithmeticException
		 *             if c2 = ZERO
		 */
		public Complex div(Complex c2) throws ArithmeticException {
			// TODO add you code here!
			return null;			

		}

		/**
		 * Return the quotient of this divided by r2.
		 * 
		 * @param r2
		 *            the divider
		 * @return the complex number quotient c1/r2.
		 * @throws ArithmeticException
		 *             if r2 = ZERO
		 */
		public Complex div(Rational r2) throws ArithmeticException {
			// TODO add you code here!
			return null;

			

		}

		
		/**
		 * return true if and only if c is a complex object and this = c
		 */
		public boolean equals(Object c) {
			// TODO add you code here!
			return false;
			
		}

		public int hashCode() {
			return getR().hashCode() ^ getI().hashCode();
		}

		/**
		 * Access the imaginary part.
		 * 
		 * @return the imaginary part.
		 */
		public Rational getI() {
			return imaginary;
		}

		/**
		 * Access the real part.
		 * 
		 * @return the real part.
		 */
		public Rational getR() {
			return real;
		}

		/**
		 * @return the complex number product = this * c2.
		 * 
		 */
		public Complex times(Complex c2) {
			// TODO add you code here!
			return null;

			

		}

		/**
		 * Returns the value of this complex number raised to the power of the argument e.
		 * I.e., return<code> this<sup>e</sup></code>.
		 * Note: e may be negative or 0.
		 * @return the complex number product = this ^ e.
		 * 
		 */
		public Complex pow(int e) {
			// TODO add you code here!
			return null;
			

		}

		/**
		 * Return the negative - this of this .
		 * 
		 * @return the negative - this of this.
		 */
		public Complex negate() {
			// TODO add you code here!
			return null;
			
		}

		/**
		 * Return the difference (this - c) between this and c2
		 * 
		 * @return a Complex whose value is c1 - c2.
		 */
		public Complex subtract(Complex c2) {
			// TODO add you code here!
			return null;
			
		}

		/**
		 * 
		 * Return a string representation of this complex number.
		 * 
		 * For a complex number c = new Complex( new Rational(6,9), New
		 * Rational(-10,2)); It should have an output of the form: "2/3-j5". The
		 * following are not well-formed outputs:
		 * 
		 * <pre>
		 *  -4/-2+j3/1, 0+j4/-2, 4+j0, j2 + 3, 0+j1, ...
		 * </pre>
		 * 
		 * 
		 * They should be changed to
		 * 
		 * <pre>
		 *  2+j3, -j2, 4, 3+j2, j
		 * </pre>
		 * 
		 * ,respectively.
		 * 
		 * 
		 */
		public String toString() {
			// TODO add your code here!
			return "Complex.toString() was not implemented!";

		}
	}

	//////////////////////////////////////////
	// The following are test program
	//////////////////////////////////////////

	/**
	 * IMPORTANT: DO NOT MAKE CHANGES TO THIS CLASS. If there are compilation
	 * errors in this class, It is most likely due to your implementation of the
	 * above 5 classes. In such case, you should change your implementation,
	 * instead of change the test code!
	 * 
	 * @author chencc
	 *
	 */

	public static class Test {

		public static boolean DEBUG = true;

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

		public static String[][] r1s = { { "1", "0" }, { "3", "0" }, { "0", "-1" }, { "6/9", "-10/2" }, { "2/3", "-5" },
				{ "4", "-5" }, { "-3", "6" }, { "8/3", "1" }, { "0", "3" }, { "4", "-3" } };

		static String[][] r2s_ = { { "1", "0" }, { "3", "0" }, { "0", "-1" }, { "6/9", "-10/2" }, { "2/3", "-5" },
				{ "4", "-5" }, { "-3", "6" }, { "8/3", "1" }, { "0", "3" }, { "4", "-3" } };

		public static String[][] r2s = shift(r2s_, 3);

		public static Complex[] c1s = ss2cs(r1s);
		public static Complex[] c2s = ss2cs(r2s);	
		
		/*
		["(5/3,-5)", "(11/3,-5)", "(4,-6)", "(-7/3,1)", "(10/3,-4)", "(4,-2)", "(1,3)", "(11/3,1)", "(3,3)", "(4,-4)"]
				["(1/3,5)", "(7/3,5)", "(-4,4)", "(11/3,-11)", "(-2,-6)", "(4,-8)", "(-7,9)", "(5/3,1)", "(-3,3)", "(4,-2)"]
				["(2/3,-5)", "(2,-15)", "(-5,-4)", "(28,19)", "(61/9,-38/3)", "(15,12)", "(6,33)", "(8/3,1)", "(0,9)", "(-3,-4)"]
				["(6/229,45/229)", "(18/229,135/229)", "(5/41,-4/41)", "(-32/45,11/45)", "(-29/73,-126/73)", "(-5/3,-4/3)", "(-6/5,3/5)", "(8/3,1)", "(0,1)", "(3,4)"]
				["(1,0)", "(1/81,0)", "(0,-1)", "(-1989/52441,540/52441)", "(6/229,45/229)", "(1,0)", "(-3,6)", "(55/9,16/3)", "(0,-27)", "(-527,-336)"]
				["(-1,0)", "(-3,0)", "(0,1)", "(-2/3,5)", "(-2/3,5)", "(-4,5)", "(3,-6)", "(-8/3,-1)", "(0,-3)", "(-4,3)"]
				["(1,0)", "(1/3,0)", "(0,1)", "(6/229,45/229)", "(6/229,45/229)", "(4/41,5/41)", "(-1/15,-2/15)", "(24/73,-9/73)", "(0,-1/3)", "(4/25,3/25)"]
         */				
		
		public static String[] addSolution =  //  new String[c1s.length];
		  {"(5/3,-5)", "(11/3,-5)", "(4,-6)", "(-7/3,1)", "(10/3,-4)", "(4,-2)", "(1,3)", "(11/3,1)", "(3,3)", "(4,-4)" };
		 
		
		public static String[] subtractSolution = // new String[c1s.length];
               {"(1/3,5)", "(7/3,5)", "(-4,4)", "(11/3,-11)", "(-2,-6)", "(4,-8)", "(-7,9)", "(5/3,1)", "(-3,3)", "(4,-2)"};
		
		public static String[] timesSolution = // new String[c1s.length];
				
			{"(2/3,-5)", "(2,-15)", "(-5,-4)", "(28,19)", "(61/9,-38/3)", "(15,12)", "(6,33)", "(8/3,1)", "(0,9)", "(-3,-4)"};
						
		public static String[] divSolution = // new String[c1s.length];
			{"(6/229,45/229)", "(18/229,135/229)", "(5/41,-4/41)", "(-32/45,11/45)", "(-29/73,-126/73)", "(-5/3,-4/3)", "(-6/5,3/5)", "(8/3,1)", "(0,1)", "(3,4)" };
						
		
		public static String[] powSolution = // new String[c1s.length];
				{"(1,0)", "(1/81,0)", "(0,-1)", "(-1989/52441,540/52441)", "(6/229,45/229)", "(1,0)", "(-3,6)", "(55/9,16/3)", "(0,-27)", "(-527,-336)" };
						

		public static String[] inverseSolution = // new String[c1s.length];
			{"(1,0)", "(1/3,0)", "(0,1)", "(6/229,45/229)", "(6/229,45/229)", "(4/41,5/41)", "(-1/15,-2/15)", "(24/73,-9/73)", "(0,-1/3)", "(4/25,3/25)"} ;
				        
		
		public static String[] negateSolution = // new String[c1s.length];
	{"(-1,0)", "(-3,0)", "(0,1)", "(-2/3,5)", "(-2/3,5)", "(-4,5)", "(3,-6)", "(-8/3,-1)", "(0,-3)", "(-4,3)"};
						

		/*
		static {
			
			Complex[] addSolutionC = new Complex[c1s.length];
			Complex[] subtractSolutionC = new Complex[c1s.length];
			Complex[] timesSolutionC = new Complex[c1s.length];
			Complex[] divSolutionC = new Complex[c1s.length];
			Complex[] powSolutionC = new Complex[c1s.length];
			Complex[] inverseSolutionC = new Complex[c1s.length];
			Complex[] negateSolutionC = new Complex[c1s.length];
			
			for (int k = 0; k < r1s.length; k++) {

				Complex c1 = c1s[k], c2 = c2s[k];

				addSolutionC[k] = c1.add(c2);
				subtractSolutionC[k] = c1.subtract(c2);
				timesSolutionC[k] = c1.times(c2);
				divSolutionC[k] = c1.div(c2);

				powSolutionC[k] = c1.pow(k - 5);

				inverseSolutionC[k] = c1.inverse();
				negateSolutionC[k] = c1.negate();

			}
			
			 addSolution = cs2qs(addSolutionC);
			 subtractSolution = cs2qs(subtractSolutionC);
			 timesSolution = cs2qs(timesSolutionC);
			 divSolution = cs2qs(divSolutionC);
			 powSolution = cs2qs(powSolutionC);

			 inverseSolution = cs2qs(inverseSolutionC);
			 negateSolution = cs2qs(negateSolutionC);
			
			
			
			
		}
		
		*/

		public void testValueOfString() {

			String[] ss = { "1/2+j5/3", "1/2-j4/3", "1/2+j", "1/2-j", "2/3", "-2/3", "j3/4", "-j3/4" };
			Complex[] sols = { new Complex("1/2", "5/3"), new Complex("1/2", "-4/3"), new Complex("1/2", "1"),
					new Complex("1/2", "-1"), new Complex("2/3", "0"), new Complex("-2/3", "0"),
					new Complex("0", "3/4"), new Complex("0", "-3/4") };

			for (int k = 0; k < ss.length; k++) {
				test();
				try {
					Complex ansK = Complex.valueOf(ss[k]);
					if (!eqComplex(sols[k], ansK)) {
						error("testValueOfString() for %s return %s, while %s is expected", ss[k], c2s(ansK),
								c2s(sols[k]));
					}
				} catch (Exception e) {
					error("Executing testValueOfString() for (%s) throws unexpected Exception!", ss[k]);
					if (DEBUG)
						e.printStackTrace();
				}

			}

		}

		static boolean eqComplex(Complex c1, Complex c2) {

			return c1.getR().equals(c2.getR()) && c2.getI().equals(c2.getI());
		}

		private static String c2s(Complex c) {

			return "(" + c.getR() + "," + c.getI() + ")";
		}

		/**
		 * Generate an array of complex numbers from an array of strings.
		 * 
		 * @param ss
		 * @return
		 */
		private static Complex[] ss2cs(String[][] ss) {

			Complex[] rlt = new Complex[ss.length];
			for (int k = 0; k < ss.length; k++) {
				rlt[k] = new Complex(Rational.valueOf(ss[k][0]), Rational.valueOf(ss[k][1]));
			}
			return rlt;
		}
		
		/**
		 * Generate an array of complex numbers from an array of strings.
		 * 
		 * @param ss
		 * @return
		 */
		private static String[] cs2ss(Complex[] cs) {

			String[] rlt = new String[cs.length];
			
			for (int k = 0; k < cs.length; k++) {
				rlt[k] =  c2s( cs[k]);
			}
			return rlt;
		}
		
		/**
		 * Generate an array of complex numbers from an array of strings.
		 * 
		 * @param ss
		 * @return
		 */
		private static String[] cs2qs(Complex[] cs) {

			String[] rlt = new String[cs.length];
			
			for (int k = 0; k < cs.length; k++) {
				rlt[k] = "\"" + c2s( cs[k]) + "\"";
			}
			return rlt;
		}

		/**
		 * 
		 * @param os
		 * @return
		 */
		public static String[][] reverse(String[][] ss) {

			String[][] rlt = new String[ss.length][];

			for (int k = 0, j = ss.length; k < ss.length; k++) {
				rlt[k] = ss[--j];
			}

			return rlt;

		}
		
		/**
		 * 
		 * @param os
		 * @return
		 */
		public static String[][] shift(String[][] ss, int n) {

			String[][] rlt = new String[ss.length][];

			for (int k = 0; k < ss.length; k++) {
				rlt[k] = ss[ (k + n) % ss.length ];
			}

			return rlt;

		}


		public void testEquals() {

			Complex[] c2s = {c1s[0], c1s[7],c1s[2],c1s[6],c1s[4],c1s[3], c1s[6],c1s[1],c1s[8],c1s[4] };
			
			Boolean[] sols = {true, false, true, false, true, false, true,false, true, false};

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					boolean ansK = c1s[k].equals(c2s[k]);
					if (!(sols[k] == ansK)) {
						error("testEquals() for (%s,%s) return %s, while %s is expected", c1s[k], c2s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testDiv() for (%s,%s) throws unexpected Exception!", c1s[k], c2s[k]);
					if (DEBUG)
						e.printStackTrace();
				}

			}

		}

		public void testAdd() {			

			String[] sols = addSolution;

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					Complex ansK = c1s[k].add(c2s[k]);
					if (!sols[k].equals(c2s(ansK))) {
						error("testAdd() for (%s,%s) return %s, while %s is expected", c1s[k], c2s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testAdd() for (%s,%s) throws unexpected Exception!", c1s[k], c2s[k]);
					if (DEBUG)
						e.printStackTrace();
				}

			}

		}

		public void testSubtract() {

			String[] sols = subtractSolution;

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					Complex ansK = c1s[k].subtract(c2s[k]);
					if (!sols[k].equals(c2s(ansK))) {
						error("testSubtract() for (%s,%s) return %s, while %s is expected", c1s[k], c2s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testAdd() for (%s,%s) throws unexpected Exception!", c1s[k], c2s[k]);
					if (DEBUG)
						e.printStackTrace();
				}

			}

		}

		public void testTimes() {

			String[] sols = timesSolution;

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					Complex ansK = c1s[k].times(c2s[k]);
					if (!sols[k].equals(c2s(ansK))) {
						error("testTimes() for (%s,%s) return %s, while %s is expected", c1s[k], c2s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testTimes() for (%s,%s) throws unexpected Exception!", c1s[k], c2s[k]);
					if (DEBUG)
						e.printStackTrace();
				}

			}

		}

		public void testDiv() {

			String[] sols = divSolution;

			for (int k = 0; k < r1s.length; k++) {
				test();
				try {
					Complex ansK = c1s[k].div(c2s[k]);
					if (!sols[k].equals(c2s(ansK))) {
						error("testDiv() for (%s,%s) return %s, while %s is expected", c1s[k], c2s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testDiv() for (%s,%s) throws unexpected Exception!", c1s[k], c2s[k]);
					if (DEBUG)
						e.printStackTrace();
				}

			}

		}

		public void testPow() {
			
			int[] es = {-5,-4,-3,-2,-1,0,1,2,3,4} ;

			String[] sols = divSolution;

			for (int k = 0; k < c1s.length; k++) {
				test();
				try {
					Complex ansK = c1s[k].pow(es[k]);
					if (!sols[k].equals(c2s(ansK))) {
						error("testPow() for (%s,%d) return %s, while %s is expected", c1s[k], es[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testPow() for (%s,%s) throws unexpected Exception!", c1s[k], es[k]);
					if (DEBUG)
						e.printStackTrace();
				}

			}

		}

		public void testInverse() {

			String[] sols = inverseSolution;

			for (int k = 0; k < c1s.length; k++) {
				test();
				try {
					Complex ansK = c1s[k].inverse();
					if (!sols[k].equals(c2s(ansK))) {
						error("testInverse() for %s return %s, while %s is expected", c1s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testInverse() for %s throws unexpected Exception!", c1s[k]);
					if (DEBUG)
						e.printStackTrace();
				}

			}

		}

		public void testNegate() {

			String[] sols = negateSolution;

			for (int k = 0; k < c1s.length; k++) {
				test();
				try {
					Complex ansK = c1s[k].negate();
					if (!sols[k].equals(c2s(ansK))) {
						error("testNegate() for %s return %s, while %s is expected", c1s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testNegate() for %s throws unexpected Exception!", c1s[k]);
					if (DEBUG)
						e.printStackTrace();
				}

			}

		}
		
		
		public void testToString() {
			
			//r1s = { { "1", "0" }, { "3", "0" }, { "0", "-1" }, { "6/9", "-10/2" }, { "2/3", "-5" },
			// { "4", "-5" }, { "-3", "6" }, { "8/3", "1" }, { "0", "3" }, { "4", "-3" } };
			
			String[] toStringSolution = {
					"1",    "3","-j", "2/3-j5", "2/3-j5", "4-j5", "-3+j6", "8/3+j", "j3", "4-j3" } ;
			
			String[] sols = toStringSolution;

			for (int k = 0; k < c1s.length; k++) {
				test();
				try {
					String ansK = c1s[k].toString();
					if (!sols[k].equals(ansK)) {
						error("testToString() for %s return %s, while %s is expected", c1s[k], ansK, sols[k]);
					}
				} catch (Exception e) {
					error("Executing testToString() for %s throws unexpected Exception!", c1s[k]);
					if (DEBUG)
						e.printStackTrace();
				}

			}

			
		}
		
		/*
		 * Run this method after completing HW41 to test your implementation.
		 * 
		 */
		public static void mainTest(String[] args) {
			
			System.out.println("Operand1:" + Arrays.asList(c1s));
			System.out.println("Operand2:" + Arrays.asList(c2s));
			
			System.out.println("addSolutin:" + Arrays.asList( addSolution));
			System.out.println("subtractSolution:" + Arrays.asList( subtractSolution));
			System.out.println("timesSolution:"+ Arrays.asList( timesSolution));
			System.out.println("divSolution:"+ Arrays.asList( divSolution));
			System.out.println("powSolution:"+ Arrays.asList( powSolution));
			System.out.println("negateSolution:"+ Arrays.asList(negateSolution));
			System.out.println("inverseSolution:"+ Arrays.asList( inverseSolution));
		

			Test t = new Test();

			t.testValueOfString();

			t.testAdd();			
			t.testSubtract();
			t.testTimes(); 
			t.testDiv();
			
			t.testNegate(); 
			t.testInverse();
			
			t.testEquals();
			t.testToString();

			/*
			 * 
			 * 
			 * 
			 * 
			 * 
			 *  
			 * 
			 */

			System.out.println(t.summary());

		}

		


	}

	/**
	
	/**
	 * Write your test in the main program There should be at least one test for
	 * each method/constructor/field.
	 */
	public static void main(String[] args) {

		Test.mainTest(args);
		
		// Write your own test here!
		

	}

}