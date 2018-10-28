package oishish.main;

import oishish.model.AddBody;
import oishish.model.FunctionBody;
import oishish.model.MultiplierBody;

import java.util.ArrayList;
import java.util.List;

public class FunctionBodyParser {
    private String input;
    private FunctionBody output;

    public FunctionBodyParser(String input){
        this.input = input;
        parse();
    }

    //Implementing a function body parser which works in reverse PEMDAS order
    private void parse(){
        if(input.contains("+")) {
            output = new AddBody(parseListBody("+"));
        } else if (input.contains("-")){
            output = new AddBody(parseSubtraction());
        } else if (input.contains("*")){
            output = new MultiplierBody(parseListBody("*"));
        }
    }







    private List<FunctionBody> parseListBody(String effector){
        char effectorchar = effector.charAt(0);
        long numInstances = input.chars().filter(ch -> ch == effectorchar).count();
        int prevIndex = 0;
        List<FunctionBody> terms= new ArrayList<>();
        while(numInstances>0){
            int index = input.indexOf(effector);
            FunctionBodyParser term = new FunctionBodyParser(input.substring(prevIndex, index));
            terms.add(term.getOutput());
            prevIndex = index;
            numInstances--;
        }
        return terms;
    }

    private List<FunctionBody> parseSubtraction(){
        List <FunctionBody> terms = parseListBody("-");
        for (int i = 0; i < terms.size(); i++) {
            if (i > 0) {
                terms.get(i).setSign(false);
            }
        }
        return terms;
    }


    private FunctionBody getOutput(){
        return output;
    }
}
