package com.csc.finance.api.v1;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/api")
public interface RootResource {

    @Operation(summary = "Return the current application version", description = "Get the version of the finance backend in execution.")
    @GetMapping(value = "/")
    String getVersion();

}
