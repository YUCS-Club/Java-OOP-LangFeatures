package com.csclub.demopackage;

public class PackageDemo {

    // Public
    public String className = "PackageDemo";

    // Default
    String defaultVariable = "This is default access modifier";

    // Private
    private String privateVariable = "This is really secret variable";

    void foo() {
        String v = defaultVariable;
        String p = privateVariable;
    }
}
