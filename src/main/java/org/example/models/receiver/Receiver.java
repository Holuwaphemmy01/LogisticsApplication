package org.example.models.receiver;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Receiver {
    private String name;
    private String phoneNumber;
    private String address;
    @Id
    private String id;
}
