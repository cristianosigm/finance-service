package com.csc.finance.security.authentication;

import com.csc.finance.entity.CmsUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class CscUserPrincipal implements UserDetails {

    private final CmsUser cmsUser;

    public CscUserPrincipal(CmsUser cmsUser) {
        this.cmsUser = cmsUser;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return cmsUser.getPassword();
    }

    @Override
    public String getUsername() {
        return cmsUser.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !cmsUser.getLocked().booleanValue();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return !cmsUser.getLocked().booleanValue();
    }
}
