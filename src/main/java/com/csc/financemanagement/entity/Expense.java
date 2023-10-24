package com.csc.financemanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "expense", schema = "finance")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @NotBlank
    private String title;
    private Double value;
    @Builder.Default
    private Boolean paid = Boolean.FALSE;
    @Column(name = "due_date", nullable = false)
    private Date dueDate;
}
