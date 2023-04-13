package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;


@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {
    @Mock
    Order order = new Order(10,"T-Shirt" , 7900) ;

    @InjectMocks
    EmailService emailService ;

    @Test(expected = RuntimeException.class)
    public void testEmailService(){
        emailService.sendEmail(order);
    }
    @Test
    public void testEmailWithCC(){
        String cc = "Shreya" ;
        assertTrue(emailService.sendEmail(order , cc)) ;
    }
}