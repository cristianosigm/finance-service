package com.csc.financemanagement.mapper;

import com.csc.financemanagement.api.dto.ExpenseDTO;
import com.csc.financemanagement.entity.Expense;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ExpenseMapper {

    public Expense map(ExpenseDTO from) {
        return Expense.builder()
                .id(from.getId())
                .title(from.getTitle())
                .paid(from.getPaid())
                .dueDate(from.getDueDate())
                .value(from.getValue())
                .build();
    }

    public ExpenseDTO map(Expense from) {
        return ExpenseDTO.builder()
                .id(from.getId())
                .title(from.getTitle())
                .paid(from.getPaid())
                .dueDate(from.getDueDate())
                .value(from.getValue())
                .build();
    }

    public List<ExpenseDTO> map(List<Expense> from) {
        return from.stream()
                .map(entry -> map(entry))
                .collect(Collectors.toList());
    }

}
