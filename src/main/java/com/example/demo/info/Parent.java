package com.example.demo.info;

public class Parent {

    private String info;


    private void method() {
        System.out.println("parent method");
    }

    public Parent() {
        this.method();
    }

    public Parent(String info) {
        this.info = info;
    }
}
