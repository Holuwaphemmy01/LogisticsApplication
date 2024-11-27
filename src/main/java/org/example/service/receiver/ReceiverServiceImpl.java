package org.example.service.receiver;

import org.example.dtos.request.ReceiverRequest;
import org.example.models.receiver.Receiver;
import org.example.repository.receiver.ReceiverRepository;
import org.springframework.stereotype.Service;

import java.io.Serial;

@Service
public class ReceiverServiceImpl implements ReceiverService {
    ReceiverRepository receiverRepository;

    @Override
    public String receiver(ReceiverRequest receiverRequest) {
        Receiver receiver = new Receiver();
        receiver.setName(receiverRequest.getFullName());
        receiver.setAddress(receiverRequest.getAddress());
        receiver.setId(receiver.getName()+ receiverRepository.count()+1);
        receiverRepository.save(receiver);
        return receiver.getId();
    }
}
