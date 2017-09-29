package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CalculatorInvocationHandler implements InvocationHandler {

    Object calculator;

    public CalculatorInvocationHandler(Calculator calculator){

        this.calculator = calculator;

    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("Calculating....");

        Object result = method.invoke(calculator , args);

        System.out.println("Done....");

        return result;

    }

}
