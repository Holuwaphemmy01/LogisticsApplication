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
        Receiver receiver = new Receiver();
        receiver.setName(receiverRequest.getFullName());
        receiver.setAddress(receiverRequest.getAddress());
        receiver.setId(receiver.getName()+ (receiverRepository.count()+1));
        receiverRepository.save(receiver);
        return receiver.getId();
    }
}
