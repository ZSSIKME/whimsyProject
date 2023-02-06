package org.spz.service;

import java.util.List;
import java.util.Map;

public interface SecurityService {
    /**
     * 查询密码
     * @param loginName
     * @return
     */
    public Map<String,String> findPasswordByLoginName(String loginName);

    /**
     * 查询角色
     * @param loginName
     * @return
     */
    public List<String> findRoleByloginName(String loginName);

    /**
     * 查询权限
     * @param loginName
     * @return
     */
    public List<String>  findPermissionByloginName(String loginName);
}
