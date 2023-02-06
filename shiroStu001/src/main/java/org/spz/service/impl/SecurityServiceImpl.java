package org.spz.service.impl;

import org.spz.encodeutils.DigestsUtil;
import org.spz.service.SecurityService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SecurityServiceImpl implements SecurityService {
    @Override
    public Map<String, String> findPasswordByLoginName(String loginName) {
        return DigestsUtil.entryptPassword("123");
//        return map;
    }

    @Override
    public List<String> findRoleByloginName(String loginName) {
        List<String> list = new ArrayList<>();
        if ("admin".equals(loginName)){
            list.add("admin");
        }
        list.add("dev");
        return list;
    }

    @Override
    public List<String> findPermissionByloginName(String loginName) {
        return null;
    }
}
