package com.csc.finance.api.v1;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Api("Root API")
@RequestMapping(value = "/")
public interface RootResource {

    @ApiOperation(
            value = "Return the current application version",
            notes = "Get the version of the finance backend in execution.")
    @GetMapping(value = "/")
    String getVersion();
}
