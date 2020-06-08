package com.spinshock.readerforreddit.api;

import com.spinshock.readerforreddit.model.LogicalThread;
import com.spinshock.readerforreddit.service.LogicalThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogicalThreadController {

    private final LogicalThreadService logicalThreadService;

    @Autowired
    public LogicalThreadController(LogicalThreadService logicalThreadService) {
        this.logicalThreadService = logicalThreadService;
    }

    public void addLogicalThread(LogicalThread logicalThread) {
        logicalThreadService.addLogicalThread(logicalThread);
    }
}
