package com.Tracker.Tracker.service;


import com.Tracker.Tracker.model.ExpenseTracker;

import java.util.List;

public interface ExpenseService {


    List<ExpenseTracker> findAll();
    ExpenseTracker save(ExpenseTracker expenseTracker);
    ExpenseTracker findById(Long id);
    List<ExpenseTracker> gotTOExpense();
    void claimTask(String taskId, String userId);
    void completeTask(String taskId);
}


