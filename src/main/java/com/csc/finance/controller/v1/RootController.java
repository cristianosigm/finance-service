package com.csc.finance.controller.v1;

import com.csc.finance.api.v1.RootResource;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController implements RootResource {

    @Override
    public String getVersion() {
        return "finance-management, version 0.1 ALPHA";
    }

}
