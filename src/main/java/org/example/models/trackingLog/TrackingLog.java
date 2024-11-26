package org.example.models.trackingLog;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
public class TrackingLog {
    @Id
    private String trackingId;
    private String trackingNumber;
    private String description;
    private LocalDateTime trackingDate;
}
