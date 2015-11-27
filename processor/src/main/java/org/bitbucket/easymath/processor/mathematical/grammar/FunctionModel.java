package org.bitbucket.easymath.processor.mathematical.grammar;

import java.math.RoundingMode;
import java.util.Collection;
import java.util.Deque;
import java.util.Set;

import org.bitbucket.easymath.annotations.Function;
import org.bitbucket.easymath.annotations.NumberType;
import org.bitbucket.easymath.processor.mathematical.operation.Operation;
import org.bitbucket.easymath.processor.mathematical.operation.operand.ConstantOperand;
import org.bitbucket.easymath.processor.mathematical.operation.operand.InputOperand;
import org.bitbucket.easymath.processor.mathematical.resolution.FormulaResolution;

public class FunctionModel {

    public Set<ConstantOperand> constants;
    public Deque<Operation> operations;
    public Set<InputOperand> inputs;
    private String formula;
    private Function function;
    
    private FormulaResolution resolution;

    public FunctionModel(Function function, String formula, Set<InputOperand> inputs,
            Set<ConstantOperand> constants, Deque<Operation> operations) {
        this.formula = formula;
        this.operations = operations;
        this.constants = constants;
        this.function = function;
        this.inputs = inputs;
        
        this.resolution = new FormulaResolution(formula, function.context().precision());
    }

    public int getPrecision() {
        return function.context().precision(); 
    }
    
    public RoundingMode getRoundingMode() {
        return function.context().roundingMode();
    }
    
    public String getName() {
        return function.name();
    }

    public String getformula() {
        return formula;
    }

    public NumberType getType() {
        return function.using();
    }
    
    public Set<InputOperand> getInputs() {
        return inputs;
    }

    public Deque<Operation> getOperations() {
        return operations;
    }

    public Operation getLastOperation() {
        return operations.getLast();
    }
    
    public String getInputResolutionFormat() {
        return resolution.format(inputs);
    }
    
    public String getOperationResolutionFormat(Operation operation) {
        return resolution.format(operation);
    }

    public Collection<String> getResolutionArguments() {
        return resolution.getFormatArguments();
    }
}
