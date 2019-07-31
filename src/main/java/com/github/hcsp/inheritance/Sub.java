package com.github.hcsp.inheritance;

public class Sub extends Base {
    @Override
    public void sayHello() {
        System.out.println("我是子类！");
    }

    public static void main(String[] args) {
        new Sub().sayHello();
    }
}
