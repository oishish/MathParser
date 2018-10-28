package oishish.model;

public class Variable extends FunctionBody {
    private String variable;

    public Variable(String variable){
        this.variable = variable;
    }

    @Override
    public double calculate(double value) {
        return value;
    }

    @Override
    public String bodyToString() {
        return variable;
    }
}
