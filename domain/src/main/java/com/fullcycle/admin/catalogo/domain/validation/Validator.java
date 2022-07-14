package com.fullcycle.admin.catalogo.domain.validation;

public abstract class Validator {

    private final ValidationHandler handler;

    protected Validator(final ValidationHandler aHandler) {
        this.handler = aHandler;
    }

    protected ValidationHandler validationHandler(){
        return this.handler;
    }

    public abstract void validate();
}
