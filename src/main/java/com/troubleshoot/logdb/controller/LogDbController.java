package com.troubleshoot.logdb.controller;

import com.troubleshoot.logdb.model.LogEntry;
import com.troubleshoot.logdb.model.common.ResponseStatus;
import com.troubleshoot.logdb.service.LogDbService;
import com.troubleshoot.logdb.service.LogDbServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogDbController {
    
    @Autowired
    LogDbService logDbService;
    
    @PostMapping("/api/v1/log/add")
    public ResponseEntity<String> addLog(@RequestBody LogEntry logEntry) {
        logDbService.addLog(logEntry);
        return ResponseEntity.ok(ResponseStatus.SUCCESS.name());
    }
    
    @GetMapping("/api/v1/log/error")
    public ResponseEntity<String> errorLog() {
        logDbService.errorLog();
        return ResponseEntity.ok(ResponseStatus.SUCCESS.name());
    }
    
}