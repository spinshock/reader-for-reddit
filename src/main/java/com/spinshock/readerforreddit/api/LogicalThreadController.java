package com.spinshock.readerforreddit.api;

import com.spinshock.readerforreddit.model.LogicalThread;
import com.spinshock.readerforreddit.service.LogicalThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/logicalthread")
@RestController
public class LogicalThreadController {

    private final LogicalThreadService logicalThreadService;

    @Autowired
    public LogicalThreadController(LogicalThreadService logicalThreadService) {
        this.logicalThreadService = logicalThreadService;
    }

    @PostMapping
    public void addLogicalThread(@RequestBody LogicalThread logicalThread) {
        logicalThreadService.addLogicalThread(logicalThread);
    }
}
