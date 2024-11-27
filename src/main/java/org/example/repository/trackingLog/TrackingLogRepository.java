package org.example.repository.trackingLog;

import org.example.models.trackingLog.TrackingLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrackingLogRepository extends MongoRepository<TrackingLog, String> {
}
