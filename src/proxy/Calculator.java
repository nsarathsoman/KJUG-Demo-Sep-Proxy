package proxy;

public class Calculator implements ICalculator {

    public Double add(Double x, Double y) { return x+y; }

    public Double subtract(Double x, Double y) { return x-y; }

    public Double multiply(Double x, Double y) { return x*y; }

    public Double divide(Double x, Double y) { return x/y; }

}
