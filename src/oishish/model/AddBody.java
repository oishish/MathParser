package oishish.model;

import java.util.List;

public class AddBody extends FunctionBody {
    private List<FunctionBody> terms;

    public AddBody(List<FunctionBody> terms){
        this.terms = terms;
    }

    @Override
    public double calculate(double value) {
        double result = 0;
        for(FunctionBody term: terms){
            result += term.calculate(value);
        }
        return result;
    }

    @Override
    public String bodyToString() {
        String result = "";
        for(int i = 0; i < terms.size(); i++){
            if(i < terms.size() -1) {
                result += terms.get(i).bodyToString() + " + ";
            } else {
                result += terms.get(i).bodyToString();
            }
        }
        return result;
    }
}
