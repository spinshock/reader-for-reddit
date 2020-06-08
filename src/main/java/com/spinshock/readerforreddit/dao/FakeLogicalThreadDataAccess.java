package com.spinshock.readerforreddit.dao;

import com.spinshock.readerforreddit.model.LogicalThread;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakeLogicalThreadDataAccess implements LogicalThreadDao {

    private static List<LogicalThread> DB = new ArrayList<>();

    @Override
    public int insertLogicalThread(UUID id, LogicalThread logicalThread) {
        DB.add(new LogicalThread(id, logicalThread.getContent()));
        return 1;
    }
}
