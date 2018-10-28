package oishish.model;

import static java.lang.Math.exp;

public class ExponentialBody extends FunctionBody {
    FunctionBody pow;

    public ExponentialBody(FunctionBody pow){
        this.pow = pow;
    }

    @Override
    public double calculate(double value) {
        return exp(pow.calculate(value));
    }

    @Override
    public String bodyToString() {
        return "e^{ " + pow.bodyToString() + "}";
    }
}
