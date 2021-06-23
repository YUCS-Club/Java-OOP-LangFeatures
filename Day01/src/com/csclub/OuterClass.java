package com.csclub;

import com.csclub.demopackage.PackageDemo;

public class OuterClass {

    public static void main(String[] args) {
        PackageDemo demo = new PackageDemo();
        System.out.println(demo.className);
    }
}
