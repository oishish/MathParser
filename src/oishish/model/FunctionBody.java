package oishish.model;

public abstract class FunctionBody {
    protected Boolean sign = true; // By default positive

    //EFFECTS: returns a double of what the function body evaluates to with given input value for dependent variable
    public abstract double calculate(double value);

    //EFFECTS: returns the function body as a string
    public abstract String bodyToString();

    //Changes sign, effects this
    // NEGATIVE => FALSE
    // POSITIVE => TRUE
    public void setSign(Boolean sign) {
        this.sign = sign;
    }

    public Boolean getSign() {
        return sign;
    }
}
