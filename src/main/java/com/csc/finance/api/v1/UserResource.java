package com.csc.finance.api.v1;

import com.csc.finance.api.dto.UserDTO;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value = "/api/user")
public interface UserResource {

    @Operation(summary = "Create or update an user", description = "Create a new user, if the received entity has a null ID, or updates the values otherwise.")
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity save(@Valid @RequestBody UserDTO user);

    @Operation(summary = "Get all existing users", description = "Return all existing users in the database, regardless of their statuses.")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<UserDTO> getAll();

}
