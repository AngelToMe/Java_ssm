package com.itheima.ssm.service;

import com.itheima.ssm.domain.SysLog;

import java.util.List;

/**
 * @author Vagaband
 * @date 2020/8/11 17:40
 */
public interface ISysLogService {

    // 保存
    public void save(SysLog sysLog) throws Exception;

    List<SysLog> findAll(int page, int size) throws Exception;

}
