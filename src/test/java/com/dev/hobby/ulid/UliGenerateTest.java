package com.dev.hobby.ulid;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class UliGenerateTest {

    @Test
    public void testGenerate() {
        UliGenerate ulidGenerate = new UliGenerate();
        String result = ulidGenerate.generate();

        Assertions.assertNotNull(result,"ULID should not be null");
        Assertions.assertEquals(26, result.length(), "ULID length should be 26");
        System.out.println("ULID: " + result);
    }
}