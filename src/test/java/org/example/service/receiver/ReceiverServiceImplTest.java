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
        System.out.println(receiverRepository.count());
        assertEquals(1, receiverRepository.count());
    }


}