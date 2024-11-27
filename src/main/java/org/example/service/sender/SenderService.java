package org.example.service.sender;

import org.example.dtos.request.SenderRequest;

public interface SenderService {
    String createSender(SenderRequest senderRequest);
}
