package com.springboot.login.model;


import java.util.Collection;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


@NoArgsConstructor
@AllArgsConstructor
public class MyUserDetails implements UserDetails {

  private String username;
  private String password;
  private List<GrantedAuthority> grantedAuthorityList;
  private boolean isEnabled;

  @Override public Collection<? extends GrantedAuthority> getAuthorities() {
    return this.grantedAuthorityList;
  }

  @Override public String getPassword() {
    return this.password;
  }

  @Override public String getUsername() {
    return this.username;
  }

  @Override public boolean isAccountNonExpired() {
    return true;
  }

  @Override public boolean isAccountNonLocked() {
    return true;
  }

  @Override public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override public boolean isEnabled() {
    return this.isEnabled;
  }
}
