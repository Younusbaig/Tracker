package com.Tracker.Tracker.controller;


import com.Tracker.Tracker.dto.ClaimTask;
import com.Tracker.Tracker.dto.CompleteTask;
import com.Tracker.Tracker.model.ExpenseTracker;
import com.Tracker.Tracker.service.ExpenseService;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class ProcessController {

    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private ExpenseService expenseService;


    @GetMapping("/startprocess")
    public ResponseEntity<List<ExpenseTracker>> startProcess() {
        runtimeService.startProcessInstanceByKey("Process_0326zxg");
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/moveprocess")
    public ResponseEntity<List<ExpenseTracker>> moveProcess() {
        runtimeService.startProcessInstanceByKey("Flow_1rsiwns");
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/moveprocess1")
    public ResponseEntity<List<ExpenseTracker>> moveProcess1() {
        runtimeService.startProcessInstanceByKey("Flow_1rsiwns");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping("/claim")
    public void claimRequest(@RequestBody ClaimTask claimTask){
        expenseService.claimTask(claimTask.getTaskId(), claimTask.getUserId());
    }
    @RequestMapping("/complete")
    public void completeTask(@RequestBody CompleteTask completeTask){
        expenseService.completeTask(completeTask.getTaskId());
    }





}
