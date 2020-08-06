package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * 账户service接口
 * @author Vagaband
 * @date 2020/5/26 8:49
 */
public interface AccountService {

    /**
     * 查询所有账户信息
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    public void saveAccount(Account account);

}
