package com.csc.finance.service;

import com.csc.finance.api.dto.ExpenseDTO;
import com.csc.finance.exception.EntryNotFoundException;
import com.csc.finance.mapper.ExpenseMapper;
import com.csc.finance.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Autowired
    private ExpenseMapper expenseMapper;

    public ExpenseDTO getById(Long id) {
        return expenseMapper.map(expenseRepository.findById(id).orElseThrow(() -> new EntryNotFoundException("No expense found with id: " + id)));
    }

    public List<ExpenseDTO> getAll() {
        return expenseMapper.map(expenseRepository.findAll());
    }

    public void save(ExpenseDTO expense) {
        expenseRepository.save(expenseMapper.map(expense));
    }

}
