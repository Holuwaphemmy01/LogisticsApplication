package org.example.models.packages;

import lombok.Data;
import org.example.models.receiver.Receiver;
import org.example.models.sender.Sender;
import org.example.models.trackingLog.TrackingLog;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class Packages {
    @DBRef
    private Receiver receiver;
    private List<TrackingLog> trackingLogs;
    private String description;
    private LocalDate creationDate;
    @DBRef
    private Sender sender;
    @Id
    private String packageId;
    private BigDecimal deliveryCost;
    private int quantity;





}
