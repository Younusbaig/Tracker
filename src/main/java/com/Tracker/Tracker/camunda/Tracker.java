package com.Tracker.Tracker.camunda;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class Tracker implements JavaDelegate {

    @Autowired
    RuntimeService runtimeService;
    private final Logger LOGGER = LoggerFactory.getLogger(Tracker.class);


    @Override
    public void execute(DelegateExecution execution) throws Exception {
        LOGGER.info("Notification sent");
    }
}
