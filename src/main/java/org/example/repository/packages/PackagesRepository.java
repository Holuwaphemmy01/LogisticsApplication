package org.example.repository.packages;

import org.example.models.packages.Packages;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PackagesRepository extends MongoRepository<Packages, String> {
}
