package com.jx2lee.designpattern.adapter.before;

public class AccountService {
    public Account findAccountByUsername(String username, String password, String email) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(password);
        account.setEmail(email);
        return account;
    }
}
