package proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        ICalculator calculator = ( ICalculator ) Proxy.newProxyInstance (Calculator.class.getClassLoader(),
                new Class[]{ICalculator.class}, new CalculatorInvocationHandler(new Calculator()));
//        ICalculator calculator = new Calculator();

        System.out.println(" 10 + 10 = " + calculator.add( 10d, 10d));

        System.out.println(" 10 - 10 = " + calculator.subtract( 10d, 10d));

        System.out.println(" 10 * 10 = " + calculator.multiply( 10d, 10d));

        System.out.println(" 10 / 10 = " + calculator.divide( 10d, 10d));
    }
}
