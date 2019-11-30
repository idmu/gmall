package com.mine.imu.cms.service.impl;

import com.mine.imu.cms.entity.Topic;
import com.mine.imu.cms.mapper.TopicMapper;
import com.mine.imu.cms.service.TopicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 话题表 服务实现类
 * </p>
 *
 * @author imu
 * @since 2019-11-28
 */
@Service
public class TopicServiceImpl extends ServiceImpl<TopicMapper, Topic> implements TopicService {

}
