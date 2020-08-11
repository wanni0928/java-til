package com.classs.interfaceclass.practice;

public class Main {
    public static void main(String[] args) {
        ArithmaticOperator  op;
        op = new Add();
        System.out.println(op.operate(10.0, 20));
        ArithmaticOperator[] ops;
        ops = new ArithmaticOperator[]{new Add(), new Mutiply()};
        for (ArithmaticOperator o : ops) {
            System.out.println(o.operate(5, 10));
        }
    }
}
