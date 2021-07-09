package com.csculb;

public class Container<T> {

    /*
     * T -> Type
     * K -> Key
     * V -> Value
     */

    String something = "";

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
