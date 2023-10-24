package com.csc.finance.entity;

import java.util.Optional;

public enum CmsRole {
    ADMIN, USER;

    public Optional<CmsRole> getByName(String name) {
        for(CmsRole role : CmsRole.values()) {
            if(role.name().equals(name)) {
                return Optional.of(role);
            }
        }
        return Optional.empty();
    }

}
