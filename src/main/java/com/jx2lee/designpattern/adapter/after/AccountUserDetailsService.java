package com.jx2lee.designpattern.adapter.after;

import com.jx2lee.designpattern.adapter.after.security.UserDetails;
import com.jx2lee.designpattern.adapter.after.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {
    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        return new AccountUserDetails(accountService.findAccountByUsername(username));
    }
}
