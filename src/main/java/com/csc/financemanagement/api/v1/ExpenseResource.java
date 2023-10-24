package com.csc.financemanagement.api.v1;

import com.csc.financemanagement.api.dto.ExpenseDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Expenses API")
@RequestMapping(value = "/api/expense")
public interface ExpenseResource {

    @ApiOperation(
            value = "Find an expense by its id.",
            notes = "If an expense exists with the received id, it will be returned; otherwise, it will return null.")
    @GetMapping(value = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ExpenseDTO getById(@PathVariable Long id);

    @ApiOperation(
            value = "Return all existing expenses with no filter.",
            notes = "It will return a collection of all existing expenses. If no expenses exists, it will return an empty collection.")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<ExpenseDTO> getAll();

    @ApiOperation(
            value = "Persists an expense.",
            notes = "The received expense will be persisted, if the validation succeeded. Otherwise, an exception will be thrown.")
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity save(@Valid @RequestBody ExpenseDTO expense);

}
