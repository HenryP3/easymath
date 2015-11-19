package org.bitbucket.easymath.processor.mathematical.operation.operand;

import org.bitbucket.easymath.annotations.NumberType;

public class AbstractOperand implements Operand {

    private String id;
    private NumberType type;
    private String value;
    
    public AbstractOperand(String id, NumberType type, String value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }

    @Override
    public String getId() {
        return id;
    }
    
    @Override
    public NumberType getType() {
        return type;
    }

    @Override
    public String getValue() {
        return value;
    }
        
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof AbstractOperand)) {
            return false;
        }
        AbstractOperand other = (AbstractOperand) obj;
        if (value == null) {
            if (other.value != null) {
                return false;
            }
        } else if (!value.equals(other.value)) {
            return false;
        }
        if (type != other.type) {
            return false;
        }
        return true;
    }

}