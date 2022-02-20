package com.jx2lee.designpattern.adapter.after.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
