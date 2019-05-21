package recursive;

import java.math.BigDecimal;

public class Factorial {

	public static TailCall<BigDecimal> factorialTailRec(final BigDecimal factorial, final BigDecimal number) {
		if (number.compareTo(BigDecimal.ONE) <= 0) {
			return TailCalls.done(factorial);
		} else {
			return TailCalls.call(() -> factorialTailRec(factorial.multiply(number) , number.subtract(BigDecimal.ONE)));
		}
	}

	public static void main(String[] args) {
		System.out.println(Factorial.factorialTailRec(BigDecimal.ONE, BigDecimal.valueOf(1000000000)).invoke());
		System.out.println("-------");
		System.out.println(fact(BigDecimal.ONE, BigDecimal.valueOf(1000000000)));
	}

	public static BigDecimal fact (BigDecimal factorial, BigDecimal number) {
		if (number.compareTo(BigDecimal.ONE) <= 0) return factorial;
		return number.multiply(fact(factorial, number.subtract(BigDecimal.ONE)));
	}

}
