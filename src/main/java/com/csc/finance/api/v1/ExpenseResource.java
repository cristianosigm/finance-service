package com.csc.finance.api.v1;

import com.csc.finance.api.dto.ExpenseDTO;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/api/expense")
public interface ExpenseResource {

    @Operation(summary = "Find an expense by its id.", description = "If an expense exists with the received id, it will be returned; otherwise, it will return null.")
    @GetMapping(value = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ExpenseDTO getById(@PathVariable Long id);

    @Operation(summary = "Return all existing expenses with no filter.", description = "It will return a collection of all existing expenses. If no expenses exist, it will return an empty collection.")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<ExpenseDTO> getAll();

    @Operation(summary = "Persists an expense.", description = "The received expense will be persisted, if the validation succeeded. Otherwise, an exception will be thrown.")
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity save(@Valid @RequestBody ExpenseDTO expense);

}
