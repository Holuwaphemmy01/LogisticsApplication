package org.example.models.trackingLog;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class TrackingLog {
    @Id
    private String trackingId;
    private String trackingNumber;
    private String description;
    private LocalDateTime trackingDate;
}
