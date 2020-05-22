package com.itheima.test;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;

import java.io.InputStream;
import java.util.List;

public class AccountDaoTest {
//    @Test
    public void testFindAllAccounts() throws Exception{
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);//得到的是代理对象
        List<Account> accounts = accountDao.findAllAccounts();
        Assert.assertEquals(2,accounts.size());
        sqlSession.close();
    }
}
