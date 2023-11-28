package com.troubleshoot.logdb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class LogEntry {
    
    @Id
    private String traceId;
    
    private String timestamp;
    
    private String level;
    
    private String message;
    
    private String resourceId;
    
    
    private String spanId;
    
    private String commit;
    
    private LogMetaDeta metadata;
    
    public String getTimestamp() {
        return timestamp;
    }
    
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    
    public String getLevel() {
        return level;
    }
    
    public void setLevel(String level) {
        this.level = level;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getResourceId() {
        return resourceId;
    }
    
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    public String getTraceId() {
        return traceId;
    }
    
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }
    
    public String getSpanId() {
        return spanId;
    }
    
    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }
    
    public String getCommit() {
        return commit;
    }
    
    public void setCommit(String commit) {
        this.commit = commit;
    }
    
    public LogMetaDeta getMetadata() {
        return metadata;
    }
    
    public void setMetadata(LogMetaDeta metadata) {
        this.metadata = metadata;
    }
    
}