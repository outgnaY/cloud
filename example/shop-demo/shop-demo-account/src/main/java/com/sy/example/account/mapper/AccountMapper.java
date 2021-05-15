package com.sy.example.account.mapper;



import com.sy.example.account.model.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface AccountMapper {

    /**
     * 根据用户id获取账户信息
     * @param userId 用户id
     */
    @Select("select id, user_id as userId, money from account_tbl where user_id = #{userId}")
    Account getAccountByUserId(String userId);
}
