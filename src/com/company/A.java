package com.company;

public class A {
    public A() {
        System.out.println ("A:A()");
    }
    public A(A other) {
        this();
        System.out.println ("A:A(A other)");
    }
    protected A(A other1, A other2) {
        this(other1);
        System.out.println ("A:A(A other1, A other2)");
    }

    public static void main(String[] args) {
        new A(null, null);
    }

    public void a() {}
    protected void a(A other) {}
    private void a(A other1, A other2) {}
}
