package org.example.repository.sender;


import org.example.models.sender.Sender;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SenderRepository extends MongoRepository<Sender, Long> {
}
