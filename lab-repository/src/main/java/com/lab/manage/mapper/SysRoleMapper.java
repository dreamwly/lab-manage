package com.lab.manage.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.lab.manage.pojo.SysRolePojo;

import java.util.List;

/**
 * Created by Chengcheng on 2018/12/13.
 */
public interface SysRoleMapper extends BaseMapper<SysRolePojo> {

    List<Integer> findByUserId(Integer userId);
}
