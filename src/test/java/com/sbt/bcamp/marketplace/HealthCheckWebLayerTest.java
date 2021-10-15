  package com.sbt.bcamp.marketplace;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class HealthCheckWebLayerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnOKMessage() throws Exception {
        mockMvc.perform(get("/health/check")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(is("OK")));
    }
//    @Test
//    public void shouldReturnInfo() throws Exception {
//        mockMvc.perform(get("/health/info")).andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().string(any(String.class)));
//    }
    @Test
    public void testGetNameAndSurname() throws Exception {
        String s = "{\"id\":3603,\"login\":\"19551447\",\"firstName\":\"Pavel\",\"lastName\":\"D.\",\"birthDate\":null}";
        mockMvc.perform(get("/customers/19551447"))
                .andExpect(status().isOk())
                .andExpect(content().string(is(s)));
    }
//    @Test
//    public void testAddOrder() throws Exception{
//        OrderDTO order = new OrderDTO(1,"test","test",1,true,1);
//        CustomerController customerController = new CustomerController();
//        Long l = customerController.addOrder(order);
//        Assert.assertNotNull(l);
//    }
}
