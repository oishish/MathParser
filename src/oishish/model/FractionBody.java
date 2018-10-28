package oishish.model;

public class FractionBody extends FunctionBody {
    FunctionBody denominator;
    FunctionBody numerator;

    public FractionBody(FunctionBody denominator, FunctionBody numerator){
        this.denominator = denominator;
        this.numerator = numerator;
    }

    @Override
    public double calculate(double value) {
        return numerator.calculate(value)/denominator.calculate(value);
    }

    @Override
    public String bodyToString() {
        return "(" + numerator.bodyToString() + "/" + denominator.bodyToString() + ")";
    }
}
