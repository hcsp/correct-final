package com.github.hcsp.inheritance;

public class Sub extends Base {
    public void getSupperClass() {
        super.sayHello();
        System.out.println("我是子类！");
    }
}
