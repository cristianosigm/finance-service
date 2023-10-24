package com.csc.financemanagement.controller.v1;

import com.csc.financemanagement.api.v1.RootResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController implements RootResource {
    @Override
    public String getVersion() {
        return "finance-management, version 0.1 ALPHA";
    }
}
