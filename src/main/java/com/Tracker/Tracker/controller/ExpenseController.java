package com.Tracker.Tracker.controller;


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
public class ExpenseController {

    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private ExpenseService expenseService;


    @GetMapping("/goToExpenses")
    public ResponseEntity<List<ExpenseTracker>> gotToExpense() {
        runtimeService.startProcessInstanceByKey("Process_0326zxg");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/expenses")
    public ResponseEntity<List<ExpenseTracker>> getAll(){
        List<ExpenseTracker> expense = expenseService.findAll();
        return new ResponseEntity<List<ExpenseTracker>>(expense, HttpStatus.OK);
    }

    @PostMapping("/expenses")
    public ResponseEntity<ExpenseTracker> save(@RequestBody ExpenseTracker expenseTracker){
        ExpenseTracker expenseTracker1 = expenseService.save(expenseTracker);
        return new ResponseEntity<ExpenseTracker>(expenseTracker1, HttpStatus.OK);

    }
    @GetMapping("/expenses/{id}")
    public ResponseEntity<ExpenseTracker> findById(@PathVariable("id") Long id){
        ExpenseTracker expenseTracker = expenseService.findById(id);
        return new ResponseEntity<ExpenseTracker>(expenseTracker, HttpStatus.OK);
    }

}
