package com.spinshock.readerforreddit.dao;

import com.spinshock.readerforreddit.model.LogicalThread;

import java.util.UUID;

public interface LogicalThreadDao {

    int insertLogicalThread(UUID id, LogicalThread logicalThread);

    default int insertLogicalThread(LogicalThread logicalThread) {
        UUID id = UUID.randomUUID();
        return insertLogicalThread(id, logicalThread);
    }
}
