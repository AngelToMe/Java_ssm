package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Member;
import org.apache.ibatis.annotations.Select;

/**
 * @author Vagaband
 * @date 2020/8/9 8:05
 */
public interface IMemberDao {

    @Select("select * from member where id = #{id} ")
    public Member findById(String id) throws Exception;
}
