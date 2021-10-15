package com.sbt.bcamp.marketplace;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HealthCheckControllerTest {

    @Autowired
    HealthCheckController controller;

//    @MockBean
//    InfoProcAndMem info;

    @Test
    public void shouldReturnOK() {
        //Given skipped because method without parameters and should always return same result
        //When
        String actual = controller.check();
        //Then
        Assert.assertEquals("Method check() always return OK", "OK", actual);
    }
}
//    @Test
//    public void infoTest() {
//        controller.info();
//        verify(info).getMem();
//        verify(info).getProc();
//}