package org.example.dtos.request;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class SenderRequest {
    private String name;
    private String phoneNumber;
    private String id;
}
