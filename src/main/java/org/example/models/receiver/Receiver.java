package org.example.models.receiver;

import org.springframework.data.annotation.Id;

public class Receiver {
    private String name;
    private String phoneNumber;
    private String address;
    @Id
    private String id;
}
