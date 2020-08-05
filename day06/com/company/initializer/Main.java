package com.company.initializer;

/**
 * 초기화 블록(Initializer)
 */
public class Main {
    static int classVar;
    static int instanceCount;
    int instanceVar;

    // static initializer
    static {
        System.out.println("static block");
    }

    // initializr
    {
        System.out.println("block1");
        instanceVar = 30;
        classVar = 50;
        instanceCount++;
    }
}

class MainTest{
    public static void main(String[] args) {
        System.out.println(Main.classVar);
        Main main = new Main();
        System.out.println(Main.instanceCount);
        System.out.println(main.instanceVar);
        System.out.println(Main.classVar);

        Main main1 = new Main();
        System.out.println(Main.instanceCount);
        System.out.println(main.instanceVar);
        System.out.println(Main.classVar);

        Main main2 = new Main();
        System.out.println(Main.instanceCount);
        System.out.println(main.instanceVar);
        System.out.println(Main.classVar);
    }
}