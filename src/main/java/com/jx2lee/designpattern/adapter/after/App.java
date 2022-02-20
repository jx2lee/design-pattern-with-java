package com.jx2lee.designpattern.adapter.after;

import com.jx2lee.designpattern.adapter.after.security.LoginHandler;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        AccountUserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("jaejun", "jaejun");
        System.out.println("login = " + login);
    }
}
