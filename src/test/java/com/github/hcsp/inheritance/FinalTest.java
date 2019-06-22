package com.github.hcsp.inheritance;

import org.junit.jupiter.api.Assertions;

public class FinalTest {
    public void test() {
        Assertions.assertEquals(Base.class, Sub.class.getSuperclass());
    }
}
