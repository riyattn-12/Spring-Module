package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {
    @Mock
    public EmailService emailService ;
    @Mock
    public Order order = new Order(2,"shoes",50000) ;



    @InjectMocks
    OrderService orderService ;

    @Test()
    public void testOrderPlaced(){

        orderService.placeOrder(order);

        verify(emailService ).sendEmail(order);
    }

    @Test
    public void testOrderPlaced_Boolean(){
        String cc = "RIYA" ;

        when(emailService.sendEmail(order , cc)).thenReturn(true) ;

        assertTrue(orderService.placeOrder(order , cc)); ;
    }
}
