package br.com.easymath.functions;

import br.com.easymath.FunctionCatalog;

/**
 * Standard catalog
 *
 * @author eduardovalentim
 */
public class CoreFunctionCatalog extends FunctionCatalog {

    /**
     * Default public constructor
     */
    public CoreFunctionCatalog() {
        super("core");
        addFunction(PowerFunction.INSTANCE);
        addFunction(FactorialFunction.INSTANCE);
        addFunction(SquareRootFunction.INSTANCE);
        addFunction(SinFunction.INSTANCE);
        addFunction(CosFunction.INSTANCE);
        addFunction(TanFunction.INSTANCE);
        addFunction(ASinFunction.INSTANCE);
        addFunction(ACosFunction.INSTANCE);
        addFunction(ATanFunction.INSTANCE);
        addFunction(ToRadiansFunction.INSTANCE);
        addFunction(ToDegreesFunction.INSTANCE);
    }

}
