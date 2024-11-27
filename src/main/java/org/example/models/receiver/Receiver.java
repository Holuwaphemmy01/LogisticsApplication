package org.example.models.receiver;

import lombok.Data;
import org.springframework.data.annotation.Id;
@Data
public class Receiver {
    private String name;
    private String phoneNumber;
    private String address;
    @Id
    private String id;
}
