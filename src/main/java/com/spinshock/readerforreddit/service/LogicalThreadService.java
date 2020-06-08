package com.spinshock.readerforreddit.service;

import com.spinshock.readerforreddit.dao.LogicalThreadDao;
import com.spinshock.readerforreddit.model.LogicalThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LogicalThreadService {

    private final LogicalThreadDao logicalThreadDao;

    @Autowired
    public LogicalThreadService(@Qualifier("fakeDao") LogicalThreadDao logicalThreadDao) {
        this.logicalThreadDao = logicalThreadDao;
    }

    public int addLogicalThread(LogicalThread logicalThread) {
       return logicalThreadDao.insertLogicalThread(logicalThread);
    }
}
