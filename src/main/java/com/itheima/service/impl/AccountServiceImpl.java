package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Account> findAllAccounts() {
        return accountDao.findAllAccounts();
    }
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Account findAccountByAid(Integer aid) {
        return accountDao.findAccountByAid(aid);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
//        int i=1/0;//异常
    }


    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void delAccount(Integer aid) {
        accountDao.delAccount(aid);
    }
}
