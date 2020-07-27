package com.example.demo.info;

public class Son extends Parent {

    private String message;

    public Son() {
        this.method();
    }

    public Son(String info, String message) {
        this.message = message;
    }


    private void method() {
        System.out.println("son method");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public static void main(String[] args) {
        Son son = new Son("1","2");

    }
}
