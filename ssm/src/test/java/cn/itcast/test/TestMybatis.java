package cn.itcast.test;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


/**
 * @author Vagaband
 * @date 2020/5/26 9:37
 */
public class TestMybatis {

    @Test
    public void run1() throws Exception {
        // 1.加载Mybatis配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2.创建SqlSessionFactory对象
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        // 3.使用工厂，创建SqlSession对象
        SqlSession session = build.openSession();
        // 获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        // 执行查询所有方法
        List<Account> list = dao.findAll();
        for (Account account : list){
            System.out.println(account);
        }
        // 关闭资源
        session.close();
        in.close();
    }


    @Test
    public void run2() throws Exception {
        // 1.加载Mybatis配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2.创建SqlSessionFactory对象
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        // 3.使用工厂，创建SqlSession对象
        SqlSession session = build.openSession();
        // 获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        // 执行查询所有方法
        Account account = new Account();
        account.setMoney(302.00);
        account.setName("王五2");
        dao.saveAccount(account);
        // 关闭资源 也会提交事务
        session.close();
        in.close();
    }
}
