package com.Tracker.Tracker.service;

import com.Tracker.Tracker.model.ExpenseTracker;
import com.Tracker.Tracker.repository.ExpenseRepository;
import org.camunda.bpm.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImp implements ExpenseService {

    @Autowired
    TaskService taskService;
    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public List<ExpenseTracker> findAll() {
        return expenseRepository.findAll();
    }

    @Override
    public ExpenseTracker save(ExpenseTracker expenseTracker) {
        return expenseRepository.save(expenseTracker);

    }

    @Override
    public ExpenseTracker findById(Long id) {
        if (expenseRepository.findById(id).isPresent()) {
            return expenseRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public List<ExpenseTracker> gotTOExpense() {
        return expenseRepository.findAll();
    }

    @Override
    public void claimTask(String taskId, String userId) {

        taskService.claim("5664b0cf-b955-11eb-ba78-5ebaef4b9ea9","hasan");

    }

    @Override
    public void completeTask(String taskId) {
        taskService.complete("5664b0cf-b955-11eb-ba78-5ebaef4b9ea9");
        //taskService.createTaskQuery().active();
        //Map<String,Object> map= taskService.getVariables("9b499ae6-b94b-11eb-9b30-5ebaef4b9ea9");
        //System.out.println(map);


    }


    }


