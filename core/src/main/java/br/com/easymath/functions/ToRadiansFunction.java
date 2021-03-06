package br.com.easymath.functions;

import br.com.easymath.Function;

import java.math.MathContext;

import static br.com.easymath.Numbers.toDouble;

/**
 * ToRadians Function
 *
 * Created by PauloHenrique on 06/11/2016.
 */
public class ToRadiansFunction implements Function<Number> {

    /**
     * Public instance
     */
    public static final ToRadiansFunction INSTANCE = new ToRadiansFunction();

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
        double angdeg = toDouble(inputs[0], 0);
		/*
		 * Result
		 */
        return Math.toRadians(angdeg);
    }
}
