package com.troubleshoot.logdb.service;

import com.troubleshoot.logdb.model.LogEntry;
import com.troubleshoot.logdb.repository.LogDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class LogDbServiceImpl implements LogDbService {
    
    @Autowired
    LogDbRepository logDbRepository;
    
    @Override
    public void addLog(LogEntry logEntry) {
        logDbRepository.insert(logEntry);
    }
    
    @Override
    public void errorLog() {
        throw new ResponseStatusException(HttpStatusCode.valueOf(HttpStatus.BAD_REQUEST.value()), "This is an errro!!");
    }
    
}