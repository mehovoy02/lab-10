public class Factorial {
    public static int getFactorial(int number) throws FactorialException {

        if (number < 0) throw new FactorialException("Сan't be less than 0", number);//возбуждает исключительную ситуацию

        int result = 1;

        for (; number > 0; result *= number--);
        return result;
    }
}
