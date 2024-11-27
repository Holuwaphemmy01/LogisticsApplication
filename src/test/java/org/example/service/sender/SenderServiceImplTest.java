package org.example.service.sender;

import org.example.dtos.request.SenderRequest;
import org.example.repository.sender.SenderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SenderServiceImplTest {
    @Autowired
    private SenderService senderService;

    @Autowired
    private SenderRepository senderRepository;



    @BeforeEach
    void setUp() {
    senderRepository.deleteAll();
    }

    @Test
    public void testToRegisterSender(){
        SenderRequest senderRequest = new SenderRequest();
        senderRequest.setName("name");
        senderRequest.setPhoneNumber("number");
        senderService.createSender(senderRequest);
        assertEquals(1, senderRepository.count());
    }

    @Test
    public void testThatNameIsEmptyAndExceptionsIsThrown(){
        SenderRequest senderRequest = new SenderRequest();
        senderRequest.setName(" ");
        senderRequest.setPhoneNumber("number");
        assertThrows(IllegalArgumentException.class, () -> senderService.createSender(senderRequest));
    }

    @Test
    public void testThatPhoneNumberIsEmptyAndExceptionsIsThrown(){
        SenderRequest senderRequest = new SenderRequest();
        senderRequest.setName("name");
        senderRequest.setPhoneNumber(" ");
        assertThrows(IllegalArgumentException.class, () -> senderService.createSender(senderRequest));
    }

    @Test
    public void testToRegisterTwoUserAndCountIsTwo(){
        SenderRequest senderRequest = new SenderRequest();
        senderRequest.setName("name");
        senderRequest.setPhoneNumber("number");
        senderService.createSender(senderRequest);
        assertEquals(1, senderRepository.count());
        SenderRequest senderRequest1 = new SenderRequest();
        senderRequest1.setName("name1");
        senderRequest1.setPhoneNumber("number1");
        senderService.createSender(senderRequest1);
        assertEquals(2, senderRepository.count());

    }
}