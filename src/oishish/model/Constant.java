package oishish.model;

public class Constant extends FunctionBody{
    private double value;

    public Constant(double value){
        this.value = value;
    }

    @Override
    public double calculate(double value) {
        return this.value;
    }

    @Override
    public String bodyToString() {
        return Double.toString(value);
    }
}
