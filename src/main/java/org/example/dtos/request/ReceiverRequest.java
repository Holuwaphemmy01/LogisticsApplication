package org.example.dtos.request;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class ReceiverRequest {
    private String fullName;
    private String address;
    private String phoneNumber;
    private String id;
}
