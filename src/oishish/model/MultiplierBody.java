package oishish.model;

import java.util.List;

public class MultiplierBody extends FunctionBody{
    List<FunctionBody> terms;

    public MultiplierBody(List<FunctionBody> terms){
        this.terms = terms;
    }

    @Override
    public double calculate(double value) {
        double result = 1;
        for(FunctionBody term: terms){
            result *= term.calculate(value);
        }
        return result;
    }

    @Override
    public String bodyToString() {
        String result = "";
        for(int i = 0; i < terms.size(); i++){
            if(i < terms.size() -1) {
                result += terms.get(i).bodyToString() + " * ";
            } else {
                result += terms.get(i).bodyToString();
            }
        }
        return result;
    }
}
