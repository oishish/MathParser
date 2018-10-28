package tests.modelTests;

import oishish.model.AddBody;
import oishish.model.Constant;
import oishish.model.FunctionBody;
import oishish.model.Variable;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testAddBody implements testFunctionBody {
    private static FunctionBody addBody;

    @BeforeAll
    public static void setUp(){
        FunctionBody x = new Variable("x");
        FunctionBody one = new Constant(1);
        List<FunctionBody> terms = new ArrayList<>();
        terms.add(x);
        terms.add(one);
        addBody = new AddBody(terms);
    }

    @Test
    @Override
    public void testCalculate() {
        assertEquals(1, addBody.calculate(0));
        assertEquals(4, addBody.calculate(3));
    }

    @Test
    @Override
    public void testBodyToString() {
        assertTrue(addBody.bodyToString().equals("x + 1.0"));
    }
}
