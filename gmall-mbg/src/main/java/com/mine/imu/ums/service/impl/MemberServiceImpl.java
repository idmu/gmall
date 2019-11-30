package com.mine.imu.ums.service.impl;

import com.mine.imu.ums.entity.Member;
import com.mine.imu.ums.mapper.MemberMapper;
import com.mine.imu.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author imu
 * @since 2019-11-28
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
