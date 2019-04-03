package com.sbt.bcamp.marketplace;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HealthCheckControllerTest {

    @Autowired
    HealthCheckController controller;

    @Test
    public void shouldReturnOK() {
        //Given skipped because method without parameters and should always return same result
        //When
        String actual = controller.check();
        //Then
        Assert.assertEquals("Method check() always return OK", "OK", actual);
    }
}