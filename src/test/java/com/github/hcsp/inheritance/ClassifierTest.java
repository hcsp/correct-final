package com.github.hcsp.inheritance;

import org.junit.jupiter.api.Assertions;

public class ClassifierTest {
    public void test() {
        Assertions.assertTrue(Base.class, Sub.class.getSuperclass());
    }
}
