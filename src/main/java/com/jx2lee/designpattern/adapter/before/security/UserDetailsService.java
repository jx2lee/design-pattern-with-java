package com.jx2lee.designpattern.adapter.before.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
