package org.example.dtos.request;

import lombok.Data;

@Data
public class ReceiverRequest {
    private String fullName;
    private String address;
    private String phoneNumber;
    private String id;
}
