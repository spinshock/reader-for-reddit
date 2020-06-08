package com.spinshock.readerforreddit.model;

import java.util.UUID;

public class LogicalThread {
    private final UUID id;
    private final String content;

    public LogicalThread(UUID id, String content) {
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
