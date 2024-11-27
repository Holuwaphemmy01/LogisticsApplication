package org.example.service.receiver;

import org.example.dtos.request.ReceiverRequest;
import org.example.models.receiver.Receiver;
import org.example.repository.receiver.ReceiverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiverServiceImpl implements ReceiverService {
    @Autowired
    ReceiverRepository receiverRepository;

    @Override
    public String createReceiver(ReceiverRequest receiverRequest) {
        checkExceptions(receiverRequest);
        return setFields(receiverRequest);
    }

    private void checkExceptions(ReceiverRequest receiverRequest){
        if(receiverRequest.getFullName().isEmpty()|| receiverRequest.getFullName().isBlank()) throw new IllegalArgumentException("Name is empty");
        if(receiverRequest.getAddress().isEmpty() || receiverRequest.getAddress().isBlank()) throw new IllegalArgumentException("Address is empty");
        if(receiverRequest.getPhoneNumber().isEmpty() || receiverRequest.getPhoneNumber().isBlank()) throw new IllegalArgumentException("PhoneNumber is empty");
    }

    private String setFields(ReceiverRequest receiverRequest){
        Receiver receiver = new Receiver();
        receiver.setName(receiverRequest.getFullName());
        receiver.setAddress(receiverRequest.getAddress());
        receiver.setId(receiver.getName()+ (receiverRepository.count()+1));
        receiverRepository.save(receiver);
        return receiver.getId();
    }


}
