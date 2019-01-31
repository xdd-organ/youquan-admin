package com.java.youquan.admin.user.service;

import com.github.pagehelper.PageInfo;

import java.util.Map;

/**
 * @author xdd
 * @date 2018/8/21
 */
public interface UserService {

    Map<String, Object> insert(Map<String, Object> params);

    Map<String, Object> getByUsername(String username);

    Map<String, Object> getByUserId(String userId);

    PageInfo pageByUser(Map<String,Object> params);

}
