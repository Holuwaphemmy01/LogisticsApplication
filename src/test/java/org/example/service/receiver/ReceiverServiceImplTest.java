package org.example.service.receiver;

import org.example.dtos.request.ReceiverRequest;
import org.example.repository.receiver.ReceiverRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class ReceiverServiceImplTest {
    @Autowired
    private ReceiverService receiverService;

    @Autowired
    private ReceiverRepository receiverRepository;
    @BeforeEach
    void setUp() {
        receiverRepository.deleteAll();
    }

    @Test
    public void testToRegisterReceiver() {
        ReceiverRequest receiverRequest = new ReceiverRequest();
        receiverRequest.setFullName("FullName");
        receiverRequest.setAddress("Address");
        receiverRequest.setPhoneNumber("phoneNumber");
        receiverService.createReceiver(receiverRequest);
        assertEquals(1, receiverRepository.count());
    }

    @Test
    public void testThatUserNameIsEmptyAndExceptionIsThrown() {
        ReceiverRequest receiverRequest = new ReceiverRequest();
        receiverRequest.setFullName("  ");
        receiverRequest.setAddress("Address");
        receiverRequest.setPhoneNumber("phoneNumber");
        assertThrows(IllegalArgumentException.class, () ->receiverService.createReceiver(receiverRequest));
    }


    @Test
    public void testThatAddressIsEmptyAndExceptionIsThrown() {
        ReceiverRequest receiverRequest = new ReceiverRequest();
        receiverRequest.setFullName("Femi");
        receiverRequest.setAddress(" ");
        receiverRequest.setPhoneNumber("phoneNumber");
        assertThrows(IllegalArgumentException.class, () ->receiverService.createReceiver(receiverRequest));
    }

    @Test
    public void testThatPhoneNumberIsEmptyAndExceptionIsThrown() {
        ReceiverRequest receiverRequest = new ReceiverRequest();
        receiverRequest.setFullName("Femi");
        receiverRequest.setAddress("address");
        receiverRequest.setPhoneNumber(" ");
        assertThrows(IllegalArgumentException.class, () ->receiverService.createReceiver(receiverRequest));
    }





}