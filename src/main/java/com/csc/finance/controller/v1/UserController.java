package com.csc.finance.controller.v1;

import com.csc.finance.api.dto.UserDTO;
import com.csc.finance.api.v1.UserResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class UserController implements UserResource {

    @Override
    public ResponseEntity save(UserDTO user) {
        return ResponseEntity.ok("OK");
    }

    @Override
    public List<UserDTO> getAll() {
        return Collections.emptyList();
    }

}
