package com.codeforcoder.interfaces;

public class TestInterfaceSameDefaultMethod implements A, B{
    @Override
    public void print() {
        A.super.print();
        B.super.print();
    }

    public void main() {
        A.super.print();
    }

    public static void main(String[] args) {
        A test = new TestInterfaceSameDefaultMethod();
        test.print();
        //A.super.print();
    }
}
