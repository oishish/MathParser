package oishish.model;

import java.lang.Math;

public class PowerBody extends FunctionBody {
    private FunctionBody base;
    private FunctionBody pow;

    public PowerBody(FunctionBody base, FunctionBody pow){
        this.base = base;
        this.pow = pow;
    }

    @Override
    public double calculate(double value) {
        return Math.pow(base.calculate(value), pow.calculate(value));
    }

    @Override
    public String bodyToString() {
        return base.bodyToString() + "^{" + pow.toString() + "}";
    }
}
