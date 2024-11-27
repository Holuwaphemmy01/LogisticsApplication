package org.example.service.sender;

import org.example.dtos.request.SenderRequest;
import org.example.models.sender.Sender;
import org.example.repository.sender.SenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SenderServiceImpl implements SenderService {

    @Autowired
    private SenderRepository senderRepository;
    @Override
    public String createSender(SenderRequest senderRequest) {
        Sender sender = new Sender();
        if(senderRequest.getPhoneNumber().isBlank()) throw new IllegalArgumentException("Phone number is mandatory");
        if(senderRequest.getName().isBlank()) throw new IllegalArgumentException("Sender name cannot be empty");
        sender.setName(senderRequest.getName());
        sender.setPhoneNumber(senderRequest.getPhoneNumber());
        sender.setId(senderRequest.getName()+(senderRepository.count()+1));
        senderRepository.save(sender);
        return sender.getId();
    }


}
