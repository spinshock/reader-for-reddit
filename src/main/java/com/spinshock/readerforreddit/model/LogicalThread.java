package com.spinshock.readerforreddit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class LogicalThread {
    private final UUID id;
    private final String content;

    public LogicalThread(UUID id,
                         @JsonProperty("content") String content) {
        this.id = id;
        this.content = content;
    }

    public UUID getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
