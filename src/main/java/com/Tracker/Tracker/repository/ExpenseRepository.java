package com.Tracker.Tracker.repository;

import com.Tracker.Tracker.model.ExpenseTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<ExpenseTracker,Long> {
}
