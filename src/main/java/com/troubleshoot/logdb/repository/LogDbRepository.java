package com.troubleshoot.logdb.repository;

import com.troubleshoot.logdb.model.LogEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogDbRepository extends MongoRepository<LogEntry, String> {

}