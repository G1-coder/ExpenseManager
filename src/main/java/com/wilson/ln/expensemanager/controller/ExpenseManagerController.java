package com.wilson.ln.expensemanager.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wilson.ln.expensemanager.model.Expense;

@RestController
public class ExpenseManagerController {
@PostMapping
public void createExpense(@RequestBody Expense expenseRequest){
	
}
}
