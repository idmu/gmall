package com.mine.imu.ums.service.impl;

import com.mine.imu.ums.entity.Role;
import com.mine.imu.ums.mapper.RoleMapper;
import com.mine.imu.ums.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户角色表 服务实现类
 * </p>
 *
 * @author imu
 * @since 2019-11-28
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
