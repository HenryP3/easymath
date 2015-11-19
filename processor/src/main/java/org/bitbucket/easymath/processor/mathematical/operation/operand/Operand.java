package org.bitbucket.easymath.processor.mathematical.operation.operand;

import org.bitbucket.easymath.annotations.NumberType;

public interface Operand {

    public String getId();
    public NumberType getType();
    public String getValue();
    
}