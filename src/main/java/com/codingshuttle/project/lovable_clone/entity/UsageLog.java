package com.codingshuttle.project.lovable_clone.entity;

import java.time.Instant;

public class UsageLog {
    Long id;
    User user;
    Project project;
    String active;
    Integer tokenUsed;
    Integer durationMs;
    String metaData;
    Instant createdAt;
}
