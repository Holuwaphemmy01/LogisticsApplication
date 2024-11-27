package org.example.repository.receiver;

import org.example.models.receiver.Receiver;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReceiverRepository extends MongoRepository<Receiver, String> {

}
