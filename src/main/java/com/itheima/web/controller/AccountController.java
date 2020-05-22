package com.itheima.web.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAllAccounts")
    public String findAllAccounts(Model model){
        //查询所有账户
        List<Account> accounts = accountService.findAllAccounts();
        model.addAttribute("accounts",accounts);
        return "listAccounts";
    }


    @RequestMapping("/addAccountUI")
    public String addAccountUI(){
        return "addAccount";
    }

    @RequestMapping("/addAccount")
    public String addAccount(Account account){
        accountService.saveAccount(account);
        return "redirect:/index.jsp";//重定向到主页
    }

    @RequestMapping("/editAccountUI")
    public String editAccountUI(Integer aid,Model model){
        Account account = accountService.findAccountByAid(aid);
        model.addAttribute("account",account);
        return "editAccount";
    }


    @RequestMapping("/editAccount")
    public String editAccount(Account account){
        accountService.updateAccount(account);
        return "redirect:/index.jsp";//重定向到主页
    }

    @RequestMapping("/delAccount")
    public String delAccount(Integer[] aids){
        if(aids!=null&&aids.length>0){
            for(Integer aid:aids){
                accountService.delAccount(aid);
            }
        }
        return "redirect:/index.jsp";//重定向到主页
    }
}
