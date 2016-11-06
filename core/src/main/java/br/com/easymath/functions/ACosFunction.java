package br.com.easymath.functions;

import br.com.easymath.Function;

import java.math.MathContext;

import static br.com.easymath.Numbers.toDouble;

/**
 * ACos Function
 * <p>
 * Created by PauloHenrique on 06/11/2016.
 */
public class ACosFunction implements Function<Number> {

    /**
     * Public instance
     */
    public static final ACosFunction INSTANCE = new ACosFunction();

    /**
     * {@inheritDoc}
     */
    @Override
    public String name() {
        return "sin";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Number perform(MathContext mc, Number... inputs) {
        /*
		 * Method protection block
		 */
        if (inputs == null)
            throw new IllegalArgumentException("Argument 'inputs' cannot be null.");
        if (inputs.length != 1)
            throw new IllegalArgumentException(
                    "Length mismatch for argument 'inputs'. Expected '1' actual '" + inputs.length + "'");
        if (inputs[0] == null)
            throw new IllegalArgumentException("Argument 'inputs[0]' cannot be null.");
		/*
		 * Inputs typecast
		 */
        double a = toDouble(inputs[0], 0);
		/*
		 * Result
		 */
        return Math.acos(a);
    }

}
