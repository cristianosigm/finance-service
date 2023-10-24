package com.csc.finance.api.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpenseDTO {

    private Long id;
    @NotBlank(message = "Title is mandatory")
    private String title;
    private Double value;
    private Boolean paid;
    private Date dueDate;

}
