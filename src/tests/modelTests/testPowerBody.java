package tests.modelTests;

import oishish.model.Constant;
import oishish.model.FunctionBody;
import oishish.model.PowerBody;
import oishish.model.Variable;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testPowerBody implements testFunctionBody {
    private static FunctionBody powerBody;

    @BeforeAll
    public static void setUp(){
        FunctionBody x = new Variable("x");
        FunctionBody two = new Constant(2);
        powerBody = new PowerBody(x, two);
    }

    @Override
    @Test
    public void testCalculate() {
        assertEquals(4, powerBody.calculate(2));
        assertEquals(16, powerBody.calculate(-4));
    }

    @Override
    @Test
    public void testBodyToString() { }
}
