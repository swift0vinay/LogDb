package com.troubleshoot.logdb.service;

import com.troubleshoot.logdb.model.LogEntry;

public interface LogDbService {
    
    public void addLog(LogEntry logEntry);

    public void errorLog();
}