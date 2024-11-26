package org.example.models.sender;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Sender {
    private String name;
    private String phoneNumber;
    @Id
    private String id;
}

