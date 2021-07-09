package com.csculb;

import java.io.IOException;

public class CoolExceptionImpl extends CoolException {

    @Override
    void throwException() throws IOException {
        super.throwException();
    }

    @Override
    void dontThrowException() {
        super.dontThrowException();
    }
}
