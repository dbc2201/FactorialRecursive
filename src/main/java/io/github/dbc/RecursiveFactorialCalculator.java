package io.github.dbc;

public class RecursiveFactorialCalculator {
    /**
     * This method calculates the factorial of a number.
     *
     * @param number the number to calculate the factorial of.
     * @return the factorial of the given number.
     */
    public static int factorial(int number) {
        return number == 0 ? 1 : number * factorial(number - 1);
    }
}
