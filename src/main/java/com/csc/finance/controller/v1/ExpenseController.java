package com.csc.finance.controller.v1;

import com.csc.finance.api.dto.ExpenseDTO;
import com.csc.finance.api.v1.ExpenseResource;
import com.csc.finance.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpenseController implements ExpenseResource {

    @Autowired
    private ExpenseService expenseService;

    @Override
    public ExpenseDTO getById(Long id) {
        return expenseService.getById(id);
    }

    @Override
    public List<ExpenseDTO> getAll() {
        return expenseService.getAll();
    }

    @Override
    public ResponseEntity save(ExpenseDTO expense) {
        expenseService.save(expense);
        return ResponseEntity.ok().build();
    }
}
