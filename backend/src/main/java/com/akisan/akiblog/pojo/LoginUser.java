package com.akisan.akiblog.pojo;

import com.akisan.akiblog.entity.sys_user;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginUser implements UserDetails {

    private sys_user sys_user;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return sys_user.getAuthorities();
    }

    @Override
    public String getPassword() {
        return sys_user.getPassword();
    }

    @Override
    public String getUsername() {
        return sys_user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return sys_user.getPasswordNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return sys_user.getPasswordNonExpired();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
