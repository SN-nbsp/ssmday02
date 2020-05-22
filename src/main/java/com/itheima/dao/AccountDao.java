package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountDao {
    List<Account> findAllAccounts();

    void saveAccount(Account account);

    Account findAccountByAid(Integer aid);

    void updateAccount(Account account);

    void delAccount(Integer aid);
}
